package org.example;

import org.example.data.GestorDatosMedicamento;
import org.example.data.GestorDatosPaciente;
import org.example.logic.DetalleReceta;
import org.example.logic.Medicamento;
import org.example.logic.Paciente;
import org.example.logic.Receta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
//        DetalleReceta d1 = new DetalleReceta("001", 2, "Tomar cada 8 horas");
//        DetalleReceta d2 = new DetalleReceta("002", 1, "Tomar después de comer");
//
//        Receta r1 = new Receta("R001", "P001", LocalDate.of(2024, 6, 1));
//        r1.getDetalles().add(d1);
//
//        Receta r2 = new Receta("R002", "P002", LocalDate.of(2024, 6, 2));
//        r2.getDetalles().add(d2);
//
//        List<Receta> recetas = new ArrayList<>();
//        recetas.add(r1);
//        recetas.add(r2);
//
//
        List<Medicamento> lista = new ArrayList<>();
        lista.add(new Medicamento("001", "Paracetamol", "Tableta"));
        lista.add(new Medicamento("002", "Ibuprofeno", "Cápsula"));
//
//
        List<Paciente> lista2 = new ArrayList<>();
        lista2.add(new Paciente("P001", "Ana López", LocalDate.of(2004, 5, 12), "600123456"));
        lista2.add(new Paciente("P002", "Juan Pérez", LocalDate.of(1985, 8, 23), "600654321"));
//
//
        GestorDatosMedicamento gestor = new GestorDatosMedicamento();
        gestor.guardar(lista);
        System.out.println("Medicamentos guardados en medicamentos.xml");
//
        GestorDatosPaciente gestor2 = new GestorDatosPaciente();
        gestor2.guardar(lista2);
        System.out.println("Pacientes guardados en pacientes.xml");
//
//        GestorDatosReceta gestor3 = new GestorDatosReceta();
//        gestor3.guardar(recetas);
//        System.out.println("Recetas guardadas en recetas.xml");
//
//
        List<Medicamento> cargados = gestor.cargar();
        System.out.println("Medicamentos cargados:");
        for (Medicamento m : cargados) {
            System.out.println("Código: " + m.getCodigo() +
                    ", Nombre: " + m.getNombre() +
                    ", Presentación: " + m.getPresentacion());
        }

//
//
        List<Paciente> cargados2 = gestor2.cargar();
        System.out.println("Pacientes cargados:");
        for (Paciente p : cargados2) {
            System.out.println("ID: " + p.getId() +
                    ", Nombre: " + p.getNombre() +
                    ", Fecha Nacimiento: " + p.getFechaNacimiento() +
                    ", Teléfono: " + p.getTelefono());
        }
//
//        List<Receta> cargadas = gestor3.cargar();
//        System.out.println("Recetas cargadas:");
//        for (Receta r : cargadas) {
//            System.out.println("ID: " + r.getId() +
//                    ", PacienteID: " + r.getPacienteId() +
//                    ", Fecha: " + r.getFecha());
//            for (DetalleReceta d : r.getDetalles()) {
//                System.out.println("  Medicamento: " + d.getMedicamentoCodigo() +
//                        ", Cantidad: " + d.getCantidad() +
//                        ", Indicaciones: " + d.getIndicaciones());
//            }
//        }

    }
}