// Generated by view binder compiler. Do not edit!
package com.example.listatarefas.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.listatarefas.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class TarefasItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout constraint;

  @NonNull
  public final TextView data;

  @NonNull
  public final TextView descricaoAdd;

  @NonNull
  public final ImageButton imageButton;

  @NonNull
  public final ImageButton imageButtonEditar;

  @NonNull
  public final TextView tituloAdd;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final View view;

  private TarefasItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout constraint, @NonNull TextView data, @NonNull TextView descricaoAdd,
      @NonNull ImageButton imageButton, @NonNull ImageButton imageButtonEditar,
      @NonNull TextView tituloAdd, @NonNull Toolbar toolbar, @NonNull View view) {
    this.rootView = rootView;
    this.constraint = constraint;
    this.data = data;
    this.descricaoAdd = descricaoAdd;
    this.imageButton = imageButton;
    this.imageButtonEditar = imageButtonEditar;
    this.tituloAdd = tituloAdd;
    this.toolbar = toolbar;
    this.view = view;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static TarefasItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TarefasItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.tarefas_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TarefasItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout constraint = (ConstraintLayout) rootView;

      id = R.id.data;
      TextView data = ViewBindings.findChildViewById(rootView, id);
      if (data == null) {
        break missingId;
      }

      id = R.id.descricaoAdd;
      TextView descricaoAdd = ViewBindings.findChildViewById(rootView, id);
      if (descricaoAdd == null) {
        break missingId;
      }

      id = R.id.imageButton;
      ImageButton imageButton = ViewBindings.findChildViewById(rootView, id);
      if (imageButton == null) {
        break missingId;
      }

      id = R.id.imageButtonEditar;
      ImageButton imageButtonEditar = ViewBindings.findChildViewById(rootView, id);
      if (imageButtonEditar == null) {
        break missingId;
      }

      id = R.id.tituloAdd;
      TextView tituloAdd = ViewBindings.findChildViewById(rootView, id);
      if (tituloAdd == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.view;
      View view = ViewBindings.findChildViewById(rootView, id);
      if (view == null) {
        break missingId;
      }

      return new TarefasItemBinding((ConstraintLayout) rootView, constraint, data, descricaoAdd,
          imageButton, imageButtonEditar, tituloAdd, toolbar, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}