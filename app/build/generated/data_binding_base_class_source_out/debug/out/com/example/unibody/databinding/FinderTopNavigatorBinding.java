// Generated by view binder compiler. Do not edit!
package com.example.unibody.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.unibody.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FinderTopNavigatorBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final BottomNavigationView finderTopNavigator;

  private FinderTopNavigatorBinding(@NonNull LinearLayout rootView,
      @NonNull BottomNavigationView finderTopNavigator) {
    this.rootView = rootView;
    this.finderTopNavigator = finderTopNavigator;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FinderTopNavigatorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FinderTopNavigatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.finder_top_navigator, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FinderTopNavigatorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.finder_top_navigator;
      BottomNavigationView finderTopNavigator = ViewBindings.findChildViewById(rootView, id);
      if (finderTopNavigator == null) {
        break missingId;
      }

      return new FinderTopNavigatorBinding((LinearLayout) rootView, finderTopNavigator);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
