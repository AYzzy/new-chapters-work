package Json.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerialization {

    public static String serialize(Person person) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json =mapper.writeValueAsString(person);
            return json;
        }catch (Exception exception){
            System.err.println(exception.getMessage());
            throw new RuntimeException(exception);
        }
    }


}
