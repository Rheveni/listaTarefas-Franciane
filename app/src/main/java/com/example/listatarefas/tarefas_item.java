package com.example.listatarefas;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listatarefas.Banco.TarefaDbHelper;
import com.example.listatarefas.adapter.TarefasAdapter;
import com.example.listatarefas.model.Tarefa;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class tarefas_item extends AppCompatActivity {

    private TarefaDbHelper dbHelper;
    private ArrayList<Tarefa> listaDeTarefa;
    private TarefasAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tarefas_item);

        dbHelper = new TarefaDbHelper(this);
        listaDeTarefa = new ArrayList<>();
        listaDeTarefa.addAll(dbHelper.obterTodasTarefas());
        adapter = new TarefasAdapter(listaDeTarefa, this);


//nada funciona nesse negocio
       /* FloatingActionButton botaoExcluir = findViewById(R.id.botaoExcluir);
        botaoExcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long idDaTarefaParaExcluir = obterIdDaTarefaSelecionada();
                if (idDaTarefaParaExcluir != -1) {
                    boolean excluidaComSucesso = dbHelper.excluirTarefa(idDaTarefaParaExcluir);
                    if (excluidaComSucesso) {
                        listaDeTarefa.clear();
                        listaDeTarefa.addAll(dbHelper.obterTodasTarefas());
                        adapter.setTarefas(listaDeTarefa); // Atualiza o adaptador com a nova lista de tarefas
                    } else {
                        Toast.makeText(tarefas_item.this, "Falha ao excluir tarefa.", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(tarefas_item.this, "Selecione uma tarefa para excluir.", Toast.LENGTH_SHORT).show();
                }
            }
        });*/

    //nem imprime a log
        ImageButton imageButtonEditar = findViewById(R.id.imageButtonEditar);
        imageButtonEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ImageButton", "ImageButton clicado");
                Intent intent = new Intent(tarefas_item.this, editar_tarefa.class);
                startActivity(intent);
            }
        });
    }

    private long obterIdDaTarefaSelecionada() {
        int posicaoSelecionada = adapter.getPosicaoItemSelecionado();
        if (posicaoSelecionada != RecyclerView.NO_POSITION) {
            Tarefa tarefaSelecionada = listaDeTarefa.get(posicaoSelecionada);
            return tarefaSelecionada.getId();
        } else {
            return -1;
        }
    }

}
