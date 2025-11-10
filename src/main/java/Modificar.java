import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Modificar {
    public static void main(String[] args) throws IOException {
        File archivoJSON = new File("datospersonales.json");
        ObjectMapper mapper = new ObjectMapper();

        DatosPersonales persona = mapper.readValue(archivoJSON,DatosPersonales.class);

        persona.getLenguajes().add("C");
        persona.getDireccion().setCalle("Avenida del Tajo");

        System.out.println(persona);

        mapper.writerWithDefaultPrettyPrinter().writeValue(archivoJSON,persona);
    }
}
