package org.example.data;

import org.example.logic.Medicamento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement(name="listaMedicamentos")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaMedicamentos {

    @XmlElement(name="medicamento")
    private List<Medicamento> medicamentos;

    public ListaMedicamentos() {}
    public ListaMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }
}