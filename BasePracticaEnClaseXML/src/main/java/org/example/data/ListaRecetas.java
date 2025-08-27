package org.example.data;

import org.example.logic.Receta;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="listaRecetas")
@XmlAccessorType(XmlAccessType.FIELD)

public class ListaRecetas {
    @XmlElement(name = "receta")
    private List<Receta> recetas;

    public ListaRecetas() {}
    public ListaRecetas(List<Receta> recetas) {
        this.recetas = recetas;
    }

    public List<Receta> getRecetas() {
        return recetas;
    }
}