package com.example.listatarefas.model;

import java.util.Date;
import java.util.Objects;

public class Tarefa {

    int id;
    String titulo;
    String descricao;
    String DataEntrega;

    public Tarefa(int id, String titulo, String descricao, String dataEntrega) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        DataEntrega = dataEntrega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataEntrega() {
        return DataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        DataEntrega = dataEntrega;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return id == tarefa.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

