package org.example.data;

import org.example.logic.Paciente;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement(name="listaPacientes")
@XmlAccessorType(XmlAccessType.FIELD)

public class ListaPacientes {
    @XmlElement(name = "paciente")
    private List<Paciente> pacientes;

    public ListaPacientes() {}
    public ListaPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }
}