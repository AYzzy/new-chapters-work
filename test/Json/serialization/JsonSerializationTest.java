package Json.serialization;

import junit.framework.TestCase;
import org.junit.Test;

import java.time.LocalDateTime;

import static Json.serialization.Sex.SLIM;
import static org.junit.Assert.assertEquals;

public class JsonSerializationTest {
    @Test
    public void testSerialize(){
        Person person = new Person();
        person.setName("Aramide");
        String dateOfBirth = "2024-03-03";
        person.setDateOfBirth(dateOfBirth);
        person.setGender(SLIM);
        person.setPhoneNumber("09082957925");

        String json = JsonSerialization.serialize(person);
        String expected =
                "{\"name\":\"Aramide\",\"dateOfBirth\":\"2024-03-03\",\"gender\":\"SLIM\",\"phoneNumber\":\"09082957925\"}";
        assertEquals(expected, json);
    }
}