// Generated by view binder compiler. Do not edit!
package com.example.listatarefas.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.listatarefas.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class EditarTarefaBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton botaoVoltar;

  @NonNull
  public final Button botaosalvarEdit;

  @NonNull
  public final EditText dataEntregaEdit;

  @NonNull
  public final EditText descricaoEdit;

  @NonNull
  public final Toolbar menu2;

  @NonNull
  public final EditText tituloEdit;

  private EditarTarefaBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton botaoVoltar, @NonNull Button botaosalvarEdit,
      @NonNull EditText dataEntregaEdit, @NonNull EditText descricaoEdit, @NonNull Toolbar menu2,
      @NonNull EditText tituloEdit) {
    this.rootView = rootView;
    this.botaoVoltar = botaoVoltar;
    this.botaosalvarEdit = botaosalvarEdit;
    this.dataEntregaEdit = dataEntregaEdit;
    this.descricaoEdit = descricaoEdit;
    this.menu2 = menu2;
    this.tituloEdit = tituloEdit;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static EditarTarefaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static EditarTarefaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.editar_tarefa, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static EditarTarefaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.botaoVoltar;
      FloatingActionButton botaoVoltar = ViewBindings.findChildViewById(rootView, id);
      if (botaoVoltar == null) {
        break missingId;
      }

      id = R.id.botaosalvarEdit;
      Button botaosalvarEdit = ViewBindings.findChildViewById(rootView, id);
      if (botaosalvarEdit == null) {
        break missingId;
      }

      id = R.id.dataEntregaEdit;
      EditText dataEntregaEdit = ViewBindings.findChildViewById(rootView, id);
      if (dataEntregaEdit == null) {
        break missingId;
      }

      id = R.id.descricaoEdit;
      EditText descricaoEdit = ViewBindings.findChildViewById(rootView, id);
      if (descricaoEdit == null) {
        break missingId;
      }

      id = R.id.menu2;
      Toolbar menu2 = ViewBindings.findChildViewById(rootView, id);
      if (menu2 == null) {
        break missingId;
      }

      id = R.id.tituloEdit;
      EditText tituloEdit = ViewBindings.findChildViewById(rootView, id);
      if (tituloEdit == null) {
        break missingId;
      }

      return new EditarTarefaBinding((ConstraintLayout) rootView, botaoVoltar, botaosalvarEdit,
          dataEntregaEdit, descricaoEdit, menu2, tituloEdit);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}