package com.example.listatarefas;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class editar_tarefa extends AppCompatActivity {

    private EditText editTextTituloEdit;
    private EditText editTextDescricaoEdit;
    private EditText editTextDataEntregaEdit;
    private Button botaosalvarTarefaEdit;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editar_tarefa);



    }
}
