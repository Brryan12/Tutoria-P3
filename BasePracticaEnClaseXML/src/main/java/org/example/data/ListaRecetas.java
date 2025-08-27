package org.example.data;

import org.example.logic.Receta;

import java.util.List;

public class ListaRecetas {
    private List<Receta> recetas;

    public ListaRecetas() {}
    public ListaRecetas(List<Receta> recetas) {
        this.recetas = recetas;
    }

    public List<Receta> getRecetas() {
        return recetas;
    }
}