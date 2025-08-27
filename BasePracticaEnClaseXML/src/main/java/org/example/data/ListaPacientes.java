package org.example.data;

import org.example.logic.Paciente;

import java.util.List;

public class ListaPacientes {
    private List<Paciente> pacientes;

    public ListaPacientes() {}
    public ListaPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }
}