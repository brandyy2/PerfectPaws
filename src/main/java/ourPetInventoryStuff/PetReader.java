package ourPetInventoryStuff;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.Arrays;
public class PetReader {
    public static void main(String[] args) {
        {
            try {
                ObjectMapper objectMapper = new ObjectMapper();
                File petsJSONFile = new File("src/main/resources/pets.json");
                Pets[] pets = objectMapper.readValue(petsJSONFile, Pets[].class);
                System.out.println(Arrays.asList(pets));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
