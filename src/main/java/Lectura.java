import com.fasterxml.jackson.databind.ObjectMapper;



import java.io.File;
import java.io.IOException;
import java.util.Map;


public class Lectura {
    public static void main(String[] args) throws IOException {
        /*Para leer un archivo, deberemos crear un nuevo fichero del que leer, que en este caso
        * lo tendremos ya creado ya que leemos de él
        * después de eso creamos un ObjectMapper con el que vamos a pasar la info a un objeto*/
        File archivoJSON = new File("datospersonales.json");
        ObjectMapper mapper = new ObjectMapper();

        /*Puesto que la info de los json está estructurada por clave valor, usaremos un mapa para asignarlo aqui
        * en vez de crear un nuevo mapa, mapper le asigna la info que esta leyendo a un mapa json
        * que le pasa la cadena que tiene la clave, y de segundo el objeto que este pasando, sea un String,
        * persona o int.*/
        Map<String,Object> json = mapper.readValue(archivoJSON,Map.class);
        System.out.println("El contenido del json: \n" + json);

        /*Esto es exactamente lo mismo, pero ya que tenemos la clase DatosPersonales, podemos coger
        * los datos que no pase mapper y directamente asignarlos a una instancia de esta clase*/
        DatosPersonales persona = mapper.readValue(archivoJSON,DatosPersonales.class);
        System.out.println(persona);
    }
}