import com.fasterxml.jackson.databind.ObjectMapper;



import java.io.File;
import java.io.IOException;
import java.util.Map;


public class Lectura {
    public static void main(String[] args) throws IOException {
        File archivoJSON = new File("datospersonales.json");
        ObjectMapper mapper = new ObjectMapper();

        Map<String,Object> json = mapper.readValue(archivoJSON,Map.class);
        System.out.println("El contenido del json: \n" + json);


        DatosPersonales persona = mapper.readValue(archivoJSON,DatosPersonales.class);
        System.out.println(persona);
    }
}