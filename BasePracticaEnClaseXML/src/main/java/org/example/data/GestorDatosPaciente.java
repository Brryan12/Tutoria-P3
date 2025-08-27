package org.example.data;

import org.example.logic.Paciente;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GestorDatosPaciente {
    private File archivo = new File("Datos/pacientes.xml");

    public void guardar(List<Paciente> lista) {
        try {
            JAXBContext ctx = JAXBContext.newInstance(ListaPacientes.class);
            Marshaller m = ctx.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(new ListaPacientes(lista), archivo);
        } catch (Exception e) { e.printStackTrace(); }
    }

    public List<Paciente> cargar() {
        if (!archivo.exists()) return new ArrayList<>();
        try {
            JAXBContext ctx = JAXBContext.newInstance(ListaPacientes.class);
            Unmarshaller um = ctx.createUnmarshaller();
            return ((ListaPacientes) um.unmarshal(archivo)).getPacientes();
        } catch (Exception e) { return new ArrayList<>(); }
    }
}
