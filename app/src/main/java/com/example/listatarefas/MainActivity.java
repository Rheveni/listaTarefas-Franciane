package com.example.listatarefas;

import
        android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listatarefas.Banco.TarefaDbHelper;
import com.example.listatarefas.adapter.TarefasAdapter;
import com.example.listatarefas.databinding.ActivityMainBinding;
import com.example.listatarefas.model.Tarefa;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import android.widget.EditText;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private TarefasAdapter tarefasAdapter;
    private ArrayList<Tarefa> listatarefas = new ArrayList<>();
    private RecyclerView recyclerView;
    private TarefasAdapter adapter;
    private TarefaDbHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        recyclerView = binding.RecyclerViewTarefas;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dbHelper = new TarefaDbHelper(this);

        List<Tarefa> listatarefas = dbHelper.obterTodasTarefas();

        adapter = new TarefasAdapter((ArrayList<Tarefa>) listatarefas, this);

        recyclerView.setAdapter(adapter);

        FloatingActionButton addBotao = findViewById(R.id.addBotao);
        addBotao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, addtarefa.class);
                startActivity(intent);
            }
        });
        EditText tituloEditText = findViewById(R.id.tituloAdd);
        EditText descricaoEditText = findViewById(R.id.descricaoAdd);
        EditText dataEntregaEditText = findViewById(R.id.dataEntrega);

    }

}