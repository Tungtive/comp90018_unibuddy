// Generated by view binder compiler. Do not edit!
package com.example.unibody.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.unibody.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FinderFilterFragmentBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView finderFilterAge;

  @NonNull
  public final ImageButton finderFilterBack;

  @NonNull
  public final RadioButton finderFilterBoyButtonId;

  @NonNull
  public final RadioGroup finderFilterChooseGender;

  @NonNull
  public final RadioGroup finderFilterChooseStates;

  @NonNull
  public final RadioButton finderFilterDatingButtonId;

  @NonNull
  public final TextView finderFilterDistanceList;

  @NonNull
  public final View finderFilterDivider;

  @NonNull
  public final TextView finderFilterFilter;

  @NonNull
  public final TextView finderFilterGender;

  @NonNull
  public final RadioButton finderFilterGirlButtonId;

  @NonNull
  public final TextView finderFilterSave;

  @NonNull
  public final RadioButton finderFilterSecretButtonId;

  @NonNull
  public final RadioButton finderFilterSingleButtonId;

  @NonNull
  public final Spinner finderFilterSpinnerAge;

  @NonNull
  public final Spinner finderFilterSpinnerDistance;

  @NonNull
  public final Spinner finderFilterSpinnerUniversity;

  @NonNull
  public final TextView finderFilterStatus;

  @NonNull
  public final TextView finderFilterUniversityList;

  private FinderFilterFragmentBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView finderFilterAge, @NonNull ImageButton finderFilterBack,
      @NonNull RadioButton finderFilterBoyButtonId, @NonNull RadioGroup finderFilterChooseGender,
      @NonNull RadioGroup finderFilterChooseStates, @NonNull RadioButton finderFilterDatingButtonId,
      @NonNull TextView finderFilterDistanceList, @NonNull View finderFilterDivider,
      @NonNull TextView finderFilterFilter, @NonNull TextView finderFilterGender,
      @NonNull RadioButton finderFilterGirlButtonId, @NonNull TextView finderFilterSave,
      @NonNull RadioButton finderFilterSecretButtonId,
      @NonNull RadioButton finderFilterSingleButtonId, @NonNull Spinner finderFilterSpinnerAge,
      @NonNull Spinner finderFilterSpinnerDistance, @NonNull Spinner finderFilterSpinnerUniversity,
      @NonNull TextView finderFilterStatus, @NonNull TextView finderFilterUniversityList) {
    this.rootView = rootView;
    this.finderFilterAge = finderFilterAge;
    this.finderFilterBack = finderFilterBack;
    this.finderFilterBoyButtonId = finderFilterBoyButtonId;
    this.finderFilterChooseGender = finderFilterChooseGender;
    this.finderFilterChooseStates = finderFilterChooseStates;
    this.finderFilterDatingButtonId = finderFilterDatingButtonId;
    this.finderFilterDistanceList = finderFilterDistanceList;
    this.finderFilterDivider = finderFilterDivider;
    this.finderFilterFilter = finderFilterFilter;
    this.finderFilterGender = finderFilterGender;
    this.finderFilterGirlButtonId = finderFilterGirlButtonId;
    this.finderFilterSave = finderFilterSave;
    this.finderFilterSecretButtonId = finderFilterSecretButtonId;
    this.finderFilterSingleButtonId = finderFilterSingleButtonId;
    this.finderFilterSpinnerAge = finderFilterSpinnerAge;
    this.finderFilterSpinnerDistance = finderFilterSpinnerDistance;
    this.finderFilterSpinnerUniversity = finderFilterSpinnerUniversity;
    this.finderFilterStatus = finderFilterStatus;
    this.finderFilterUniversityList = finderFilterUniversityList;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FinderFilterFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FinderFilterFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.finder_filter_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FinderFilterFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.finder_filter_Age;
      TextView finderFilterAge = ViewBindings.findChildViewById(rootView, id);
      if (finderFilterAge == null) {
        break missingId;
      }

      id = R.id.finder_filter_back;
      ImageButton finderFilterBack = ViewBindings.findChildViewById(rootView, id);
      if (finderFilterBack == null) {
        break missingId;
      }

      id = R.id.finder_filter_BoyButtonId;
      RadioButton finderFilterBoyButtonId = ViewBindings.findChildViewById(rootView, id);
      if (finderFilterBoyButtonId == null) {
        break missingId;
      }

      id = R.id.finder_filter_chooseGender;
      RadioGroup finderFilterChooseGender = ViewBindings.findChildViewById(rootView, id);
      if (finderFilterChooseGender == null) {
        break missingId;
      }

      id = R.id.finder_filter_chooseStates;
      RadioGroup finderFilterChooseStates = ViewBindings.findChildViewById(rootView, id);
      if (finderFilterChooseStates == null) {
        break missingId;
      }

      id = R.id.finder_filter_DatingButtonId;
      RadioButton finderFilterDatingButtonId = ViewBindings.findChildViewById(rootView, id);
      if (finderFilterDatingButtonId == null) {
        break missingId;
      }

      id = R.id.finder_filter_distance_list;
      TextView finderFilterDistanceList = ViewBindings.findChildViewById(rootView, id);
      if (finderFilterDistanceList == null) {
        break missingId;
      }

      id = R.id.finder_filter_divider;
      View finderFilterDivider = ViewBindings.findChildViewById(rootView, id);
      if (finderFilterDivider == null) {
        break missingId;
      }

      id = R.id.finder_filter_Filter;
      TextView finderFilterFilter = ViewBindings.findChildViewById(rootView, id);
      if (finderFilterFilter == null) {
        break missingId;
      }

      id = R.id.finder_filter_Gender;
      TextView finderFilterGender = ViewBindings.findChildViewById(rootView, id);
      if (finderFilterGender == null) {
        break missingId;
      }

      id = R.id.finder_filter_GirlButtonId;
      RadioButton finderFilterGirlButtonId = ViewBindings.findChildViewById(rootView, id);
      if (finderFilterGirlButtonId == null) {
        break missingId;
      }

      id = R.id.finder_filter_save;
      TextView finderFilterSave = ViewBindings.findChildViewById(rootView, id);
      if (finderFilterSave == null) {
        break missingId;
      }

      id = R.id.finder_filter_SecretButtonId;
      RadioButton finderFilterSecretButtonId = ViewBindings.findChildViewById(rootView, id);
      if (finderFilterSecretButtonId == null) {
        break missingId;
      }

      id = R.id.finder_filter_SingleButtonId;
      RadioButton finderFilterSingleButtonId = ViewBindings.findChildViewById(rootView, id);
      if (finderFilterSingleButtonId == null) {
        break missingId;
      }

      id = R.id.finder_filter_Spinner_age;
      Spinner finderFilterSpinnerAge = ViewBindings.findChildViewById(rootView, id);
      if (finderFilterSpinnerAge == null) {
        break missingId;
      }

      id = R.id.finder_filter_Spinner_distance;
      Spinner finderFilterSpinnerDistance = ViewBindings.findChildViewById(rootView, id);
      if (finderFilterSpinnerDistance == null) {
        break missingId;
      }

      id = R.id.finder_filter_Spinner_university;
      Spinner finderFilterSpinnerUniversity = ViewBindings.findChildViewById(rootView, id);
      if (finderFilterSpinnerUniversity == null) {
        break missingId;
      }

      id = R.id.finder_filter_Status;
      TextView finderFilterStatus = ViewBindings.findChildViewById(rootView, id);
      if (finderFilterStatus == null) {
        break missingId;
      }

      id = R.id.finder_filter_university_list;
      TextView finderFilterUniversityList = ViewBindings.findChildViewById(rootView, id);
      if (finderFilterUniversityList == null) {
        break missingId;
      }

      return new FinderFilterFragmentBinding((RelativeLayout) rootView, finderFilterAge,
          finderFilterBack, finderFilterBoyButtonId, finderFilterChooseGender,
          finderFilterChooseStates, finderFilterDatingButtonId, finderFilterDistanceList,
          finderFilterDivider, finderFilterFilter, finderFilterGender, finderFilterGirlButtonId,
          finderFilterSave, finderFilterSecretButtonId, finderFilterSingleButtonId,
          finderFilterSpinnerAge, finderFilterSpinnerDistance, finderFilterSpinnerUniversity,
          finderFilterStatus, finderFilterUniversityList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
