package org.example.data;

import org.example.logic.Medicamento;

import javax.xml.bind.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GestorDatosMedicamento {
    private File archivo = new File("Datos/medicamentos.xml");

    public void guardar(List<Medicamento> lista) {
        try {
            JAXBContext ctx = JAXBContext.newInstance(ListaMedicamentos.class);
            Marshaller m = ctx.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(new ListaMedicamentos(lista), archivo);
        } catch (Exception e) { e.printStackTrace(); }
    }

    public List<Medicamento> cargar() {
        if (!archivo.exists()) return new ArrayList<>();
        try {
            JAXBContext ctx = JAXBContext.newInstance(ListaMedicamentos.class);
            Unmarshaller um = ctx.createUnmarshaller();
            return ((ListaMedicamentos) um.unmarshal(archivo)).getMedicamentos();
        } catch (Exception e) { return new ArrayList<>(); }
    }
}
