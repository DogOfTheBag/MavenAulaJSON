import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;

public class CambioConNode {
    public static void main(String[] args) throws IOException {
        /*Ahora modificaremos usando JsonNode y ObjectNode. Lo importante de estas clases es que podremos
        * modificar información directamente del fichero. Con mapper solo podiamos leer directamente.*/
        File archivoJSON = new File("datospersonales.json");
        ObjectMapper mapper = new ObjectMapper();

        /*Creamos un JsonNode que lea la información del archivo en forma de arbol, de modo que tendrá la info
        * por ramas diferentes (Nombre,edad,email...)*/
        JsonNode root = mapper.readTree(archivoJSON);
        //Casteamos el nodo root a objectNode, que nos permite directamente modificar los atributos del objeto
        ObjectNode objeto = (ObjectNode) root;
        //añadimos el nuevo campo con el valor y borramos el email
        objeto.put("casada", true);
        objeto.remove("email");
        /*IMPORTANTE: Aquí no estamos guardando la información, el archivo json original se queda como es
        * esto lo unico que hace es convertir la info a cadena para luego imprimirla
        * si quisieramos guardar los cambios seria writeValue(nombreArchivo)*/
        String datos = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(objeto);
        System.out.println(datos);

    }
}
