// Generated by view binder compiler. Do not edit!
package com.example.restau.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.restau.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView most;

  @NonNull
  public final RecyclerView recyclerViewJuices;

  @NonNull
  public final RecyclerView recyclerViewMostOrdred;

  @NonNull
  public final TextInputEditText textInputEditText;

  @NonNull
  public final TextInputLayout textInputLayout2;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView4;

  private FragmentHomeBinding(@NonNull ScrollView rootView, @NonNull ImageView imageView,
      @NonNull TextView most, @NonNull RecyclerView recyclerViewJuices,
      @NonNull RecyclerView recyclerViewMostOrdred, @NonNull TextInputEditText textInputEditText,
      @NonNull TextInputLayout textInputLayout2, @NonNull TextView textView2,
      @NonNull TextView textView4) {
    this.rootView = rootView;
    this.imageView = imageView;
    this.most = most;
    this.recyclerViewJuices = recyclerViewJuices;
    this.recyclerViewMostOrdred = recyclerViewMostOrdred;
    this.textInputEditText = textInputEditText;
    this.textInputLayout2 = textInputLayout2;
    this.textView2 = textView2;
    this.textView4 = textView4;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.most;
      TextView most = ViewBindings.findChildViewById(rootView, id);
      if (most == null) {
        break missingId;
      }

      id = R.id.recyclerView_juices;
      RecyclerView recyclerViewJuices = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewJuices == null) {
        break missingId;
      }

      id = R.id.recyclerView_mostOrdred;
      RecyclerView recyclerViewMostOrdred = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewMostOrdred == null) {
        break missingId;
      }

      id = R.id.textInputEditText;
      TextInputEditText textInputEditText = ViewBindings.findChildViewById(rootView, id);
      if (textInputEditText == null) {
        break missingId;
      }

      id = R.id.textInputLayout2;
      TextInputLayout textInputLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout2 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ScrollView) rootView, imageView, most, recyclerViewJuices,
          recyclerViewMostOrdred, textInputEditText, textInputLayout2, textView2, textView4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}