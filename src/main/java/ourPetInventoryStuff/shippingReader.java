package ourPetInventoryStuff;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
public class shippingReader {
    public static void main(String[] args) {
        {
            try {
                ObjectMapper objectMapper = new ObjectMapper();
                File shippingJSONFile = new File("src/main/resources/shipping.json");
                shipping[] shipping = objectMapper.readValue(shippingJSONFile,shipping[].class);
                System.out.println(Arrays.asList(shipping));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
