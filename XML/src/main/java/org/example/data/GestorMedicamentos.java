package org.example.data;

import org.example.logic.Medicamento;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GestorMedicamentos {
    private File archivo= new File("Medicamentos.xml");

    public void guardar(List<Medicamento> medicamentos){
        try{
            JAXBContext ctx = JAXBContext.newInstance(ListaMedicamentos.class);
            Marshaller m = ctx.createMarshaller();
            m.marshal(new ListaMedicamentos(medicamentos), archivo);

        }catch (Exception e){ e.printStackTrace(); }
    }

    public List<Medicamento> cargar(){
        if(!archivo.exists()){
            return new ArrayList<>();
        }
        try {
            JAXBContext ctx = JAXBContext.newInstance(ListaMedicamentos.class);
            Unmarshaller um = ctx.createUnmarshaller();
            return ((ListaMedicamentos) um.unmarshal(archivo)).getMedicamentos();
        } catch (Exception e){
            return new ArrayList<>();
        }
    }

}
