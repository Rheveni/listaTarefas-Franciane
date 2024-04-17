package com.example.listatarefas.Banco;
import android.provider.BaseColumns;

public final class TarefasContrato{
    private TarefasContrato(){}

    public static class TarefaEntry implements BaseColumns {
    public static final String TABELA_TAREFAS = "tarefas";
    public static final String COLUMN_TITULO = "titulo";
    public static final String COLUMN_DESCRICAO = "descricao";
    public static final String COLUMN_DATA_ENTREGA = "data_entrega";
  }

}
