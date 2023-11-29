package ourPetInventoryStuff;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
public class salesReader {
    public static void main(String[] args) {
        {
            try {
                ObjectMapper objectMapper = new ObjectMapper();
                File salesJSONFile = new File("src/main/resources/sales.json");
                sales[] sales = objectMapper.readValue(salesJSONFile,sales[].class);
                System.out.println(Arrays.asList(sales));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
