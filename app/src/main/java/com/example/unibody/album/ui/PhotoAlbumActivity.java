package com.example.unibody.album.ui;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.unibody.R;
import com.example.unibody.album.adapter.PhotoAlbumAdapter;
import com.example.unibody.album.viewmodel.PhotoAlbumViewModel;
import com.yalantis.ucrop.UCrop;

import java.io.File;
import java.util.List;

public class PhotoAlbumActivity extends AppCompatActivity {

    private RecyclerView album_list;
    private ImageButton close_btn;
    private Button send_btn;

    private boolean isCheck = true;

    private GridLayoutManager gridLayoutManager;

    private PhotoAlbumViewModel photoAlbumViewModel;
    private PhotoAlbumAdapter photoAlbumAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_album);

        initView();

        photoAlbumViewModel = new ViewModelProvider(this,new ViewModelProvider.AndroidViewModelFactory(getApplication())).get(PhotoAlbumViewModel.class);
        photoAlbumViewModel.getPhotoUriList().observe(this, new Observer<List<Uri>>() {
            @Override
            public void onChanged(List<Uri> uris) {
                photoAlbumAdapter = new PhotoAlbumAdapter(uris,isCheck,gridLayoutManager);
                album_list.setAdapter(photoAlbumAdapter);
                photoAlbumAdapter.setOnItemClickListener(new PhotoAlbumAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(int position) {
                        if (isCheck){
                            //??????
                            //??????????????????Activity
                        }else {
                            cropImage(uris.get(position));
                        }
                    }
                });
                photoAlbumAdapter.setOnCheckBoxListener(new PhotoAlbumAdapter.onCheckBoxListener() {
                    @Override
                    public void onChangeListener(boolean b, int position) {
                        if (b) {
                            photoAlbumViewModel.addImage(uris.get(position));
                        }else {
                            photoAlbumViewModel.removeImage(uris.get(position));
                        }
                        if (!PhotoAlbumViewModel.imageList.isEmpty()){
                            send_btn.setEnabled(true);
                        }
                    }
                });
            }
        });

        close_btn.setOnClickListener(v -> {
            PhotoAlbumViewModel.imageList.clear();
            finish();
        });
        send_btn.setOnClickListener(v -> {
            finish();
        });
    }

    private void initView(){
        album_list = findViewById(R.id.album_list);
        close_btn = findViewById(R.id.close_btn);
        send_btn = findViewById(R.id.send_btn);

        isCheck = getIntent().getBooleanExtra("isCheck",true);

        if (!isCheck){
            send_btn.setVisibility(View.GONE);
        }
        gridLayoutManager = new GridLayoutManager(this, 4);
        album_list.setLayoutManager(gridLayoutManager);
    }

    private void cropImage(Uri uri){
        //????????????
        UCrop.Options options = new UCrop.Options();
        // ?????????????????????
        options.setToolbarColor(getResources().getColor(R.color.teal_200));
        // ?????????????????????
        options.setStatusBarColor(getResources().getColor(R.color.teal_700));
        // ??????????????????
        options.setHideBottomControls(true);
        // ????????????
        options.setCompressionFormat(Bitmap.CompressFormat.PNG);
        // ????????????????????????
        options.setCompressionQuality(100);
        // ???????????????????????????(??????false)???????????????????????????????????????????????????????????????????????????
        // ???????????????????????????????????????????????????????????????
//                            options.setFreeStyleCropEnabled(true);
        // ????????????????????????
        options.setCompressionQuality(100);
        // ???
        options.setCircleDimmedLayer(true);
        // ??????????????????
        options.setShowCropGrid(false);
        options.setToolbarColor(getResources().getColor(R.color.main_color));

        File file = new File(getExternalCacheDir(),"head.png");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        // ?????????uri?????????uri
        UCrop.of(uri, Uri.fromFile(file))
                // ?????????
                .withAspectRatio(1, 1)
                // ????????????
                .withOptions(options)
                .start(PhotoAlbumActivity.this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode ==  UCrop.REQUEST_CROP&&data != null){
            photoAlbumViewModel.setHead_img(UCrop.getOutput(data));
            PhotoAlbumActivity.this.finish();
        }
    }
}

