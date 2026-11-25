import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PersonaJSON {
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
        // Lectura del contenido del fichero JSON
        Object ob = new JSONParser().parse(new FileReader("./src/JSONFile.json"));
        // Convertir objeto a JSON y procesarlo
        JSONObject js = (JSONObject) ob;
        String firstName = (String) js.get("firstName");
        String lastName = (String) js.get("lastName");
        System.out.println("First name is: " + firstName);
        System.out.println("Last name is: " + lastName);
        JSONArray arr = (JSONArray) js.get("phoneNumbers");
        for (Object item : arr) {
            JSONObject data = (JSONObject) item;
            String post_id = (String) data.get("phone-number");
            System.out.println(post_id);
        }
    }
}
