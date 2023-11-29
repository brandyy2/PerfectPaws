package ourPetInventoryStuff;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
public class userReader {
    public static void main(String[] args) {
        {
            try {
                ObjectMapper objectMapper = new ObjectMapper();
                File usersJSONFile = new File("src/main/resources/users.json");
                users[] users = objectMapper.readValue(usersJSONFile,users[].class);
                System.out.println(Arrays.asList(users));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
