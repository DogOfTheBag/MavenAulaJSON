import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;

public class CambioConNode {
    public static void main(String[] args) throws IOException {
        File archivoJSON = new File("datospersonales.json");
        ObjectMapper mapper = new ObjectMapper();

        JsonNode root = mapper.readTree(archivoJSON);
        ObjectNode objeto = (ObjectNode) root;

        objeto.put("casada", true);
        objeto.remove("email");

        String datos = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(objeto);
        System.out.println(datos);

    }
}
