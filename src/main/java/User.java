import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

public class User {
    private static int numOfUsers = 1;
    private int userID;
    private String password;
    private String username;
    private boolean isAdmin;

    private static ArrayList<User> userList = new ArrayList<>();

    // Overloaded Constructor
    public User(String u, String p)
    {
        username = u;
        password = p;
        userID = numOfUsers;
        numOfUsers++;
        isAdmin = false;
    }

    // Constructor used when converting CSV to an existing user
    public User(int id, String u, String p, boolean admin)
    {
        userID = id;
        username = u;
        password = p;
        isAdmin = admin;
    }

    public void addUser(User tempUser)
    {
        userList.add(tempUser);
        save();
    }

    // Getters and Setters
    public static ArrayList<User> getUserList()
    {
        return userList;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String u)
    {
        username = u;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String p)
    {
        password = p;
    }

    public int getUserID()
    {
        return userID;
    }

    public Boolean getIsAdmin()
    {
        return isAdmin;
    }

    public void setIsAdmin()
    {
        isAdmin = true;
    }

    // Method to convert user data to CSV string
    public String toCSVString() {
        return userID + "," + username + "," + password + "," + isAdmin;
    }

    private static Path getDefaultPath()
    {
        String home = System.getProperty("user.home");
        return Paths.get(home).resolve("User.csv");
    }

    public static void save()
    {
        save(getDefaultPath());
    }

    public static void save(Path tempPath)
    {
        try (PrintWriter writer = new PrintWriter(new FileWriter(tempPath.toFile())))
        {
            for (User tempUser : userList)
            {
                writer.println(tempUser.toCSVString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void load()
    {
        load(getDefaultPath());
    }

    public static void load(Path tempPath)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(tempPath.toFile())))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                String[] data = line.split(",");

                User tempUser = new User(Integer.parseInt(data[0]), data[1], data[2], Boolean.parseBoolean(data[3]));
                userList.add(tempUser);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
	
   