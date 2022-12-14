// Generated by view binder compiler. Do not edit!
package com.example.unibody.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.unibody.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ChatSystemBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView msgTv;

  private ChatSystemBinding(@NonNull RelativeLayout rootView, @NonNull TextView msgTv) {
    this.rootView = rootView;
    this.msgTv = msgTv;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ChatSystemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ChatSystemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.chat_system, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ChatSystemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.msg_tv;
      TextView msgTv = ViewBindings.findChildViewById(rootView, id);
      if (msgTv == null) {
        break missingId;
      }

      return new ChatSystemBinding((RelativeLayout) rootView, msgTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
