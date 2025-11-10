import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Modificar {
    public static void main(String[] args) throws IOException {

        /*para modificar un fichero hay que primero coger la info del archivo JSON, despues
        * asignarla a un objeto, modificarla aquí dentro, y escribir de vuelta la nueva info al fichero de salida*/
        File archivoJSON = new File("datospersonales.json");
        ObjectMapper mapper = new ObjectMapper();

        /*asignamos la info a la instancia de DatosPersonales*/
        /*IMPORTANTE: en la lectura necesitamos usar DatosPersonales.class en vez de una instancia para que
        * Jackson (la libreria) sepa la estructura en la que tiene que leer las cosas del archivo.*/
        DatosPersonales persona = mapper.readValue(archivoJSON,DatosPersonales.class);

        /*como lenguajes en una lista, le añadimos c, y direccion es otra clase con atributos, usamos un setter*/
        persona.getLenguajes().add("C");
        persona.getDireccion().setCalle("Avenida del Tajo");

        System.out.println(persona);
        /*volvemos a escribir el archivo con la nueva info de forma bonita*/
        /*IMPORTANTE: al escribir usamos persona en vez de datosPersonales.class, ya que la libreria
        * ya sabe cual es la estructura de la clase (la tiene en el objeto) y la puede guardar directamente asi*/
        mapper.writerWithDefaultPrettyPrinter().writeValue(archivoJSON,persona);
    }
}
