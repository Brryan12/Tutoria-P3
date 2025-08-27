package org.example.data;

import org.example.logic.Medicamento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD) //acceder a los atributos privados
@XmlRootElement(name = "listaMedicamento")
public class ListaMedicamentos {
    @XmlElement(name = "medicamento") //el nombre de los corchetes del xml + buscar
    private List<Medicamento> medicamentos;

    public ListaMedicamentos() {}
    public ListaMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }
}