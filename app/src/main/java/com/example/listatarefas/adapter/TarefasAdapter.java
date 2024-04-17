package com.example.listatarefas.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listatarefas.Banco.TarefaDbHelper;
import com.example.listatarefas.addtarefa;
import com.example.listatarefas.databinding.TarefasItemBinding;
import com.example.listatarefas.model.Tarefa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class TarefasAdapter extends RecyclerView.Adapter<TarefasAdapter.TarefasViewHolder> {

    private final ArrayList<Tarefa> listaTarefas;
    private final Context context;
    private int posicaoItemSelecionado = RecyclerView.NO_POSITION;
    private AdapterView.OnItemClickListener listener;


    public TarefasAdapter(ArrayList<Tarefa> listaTarefas, Context context) {
        this.listaTarefas = listaTarefas;
        this.context = context;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        listaTarefas.clear();
        listaTarefas.addAll(tarefas);

        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TarefasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TarefasItemBinding listItem = TarefasItemBinding.inflate(LayoutInflater.from(context), parent, false);
        return new TarefasViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull TarefasViewHolder holder, int position) {
        holder.bind(listaTarefas.get(position), position);
    }



    @Override
    public int getItemCount() {
        return listaTarefas.size();
    }
    public class TarefasViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final TarefasItemBinding binding;

        public TarefasViewHolder(@NonNull TarefasItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
            binding.getRoot().setOnClickListener(this);
            this.binding.imageButtonEditar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        Tarefa tarefa = listaTarefas.get(position);
                        Intent intent = new Intent(context, addtarefa.class);
                        intent.putExtra("TAREFA_ID", tarefa.getId());
                        intent.putExtra("TITULO", tarefa.getTitulo());
                        intent.putExtra("DESCRICAO", tarefa.getDescricao());
                        intent.putExtra("DATA_ENTREGA", tarefa.getDataEntrega());
                        context.startActivity(intent);
                    }
                }
            });

            binding.imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        deletarTarefa(position);
                    }
                }
            });
        }

        public void bind(Tarefa tarefa, int position) {
            binding.tituloAdd.setText(tarefa.getTitulo());
            binding.descricaoAdd.setText(tarefa.getDescricao());
            binding.data.setText(tarefa.getDataEntrega());

            String dataEntregaString = tarefa.getDataEntrega();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
            try {
                Date dataEntrega = dateFormat.parse(tarefa.getDataEntrega());
                if (dataEntrega != null && dataEntrega.before(new Date())) {
                    dataEntregaString += " [ATRASADA]";
                    binding.data.setTextColor(Color.RED);
                } else {
                    binding.data.setTextColor(Color.BLACK);
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
            binding.data.setText(dataEntregaString);

            if (position == posicaoItemSelecionado) {
                binding.getRoot().setBackgroundColor(context.getResources().getColor(android.R.color.darker_gray));
            } else {
                binding.getRoot().setBackgroundColor(context.getResources().getColor(android.R.color.transparent));
            }
        }

        @Override
        public void onClick(View v) {
            posicaoItemSelecionado = getAdapterPosition();
            notifyDataSetChanged();
        }

    }

    private void deletarTarefa(int position) {
        if (position >= 0 && position < listaTarefas.size()) {
            Tarefa tarefa = listaTarefas.get(position);
            long idTarefa = tarefa.getId();

            TarefaDbHelper dpHelper = new TarefaDbHelper(context);
            boolean sucesso = dpHelper.excluirTarefa(idTarefa);
            if (sucesso) {
                listaTarefas.remove(position);
                notifyItemRemoved(position);
                notifyItemRangeChanged(position, listaTarefas.size());
                Toast.makeText(context, "Tarefa deletada com sucesso", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, "Falha ao deletar tarefa", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public int getPosicaoItemSelecionado() {
        return posicaoItemSelecionado;
    }

}
