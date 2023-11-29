import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Inventory {
    private static int numOfInventory = 1;
    private int inventoryID;
    private String name;
    private double price;
    private String description;
    private static ArrayList<Inventory> inventoryList = new ArrayList<>();

    // Constructor
    public Inventory(String n, double p, String d)
    {
        name = n;
        price = p;
        description = d;
        inventoryID = numOfInventory;
        numOfInventory++;
    }

    // Constructor used when converting CSV to an existing inventory
    public Inventory(String n, double p, String d, int id)
    {
        name = n;
        price = p;
        description = d;
        inventoryID = id;
    }

    public void addInventory(Inventory tempInventory)
    {
        inventoryList.add(tempInventory);
        save();
    }

    public static ArrayList<Inventory> getInventoryList()
    {
        return inventoryList;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double p)
    {
        price = p;
    }

    public int getInventoryID()
    {
        return inventoryID;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    // Method to convert inventory data to CSV string
    public String toCSVString()
    {
        return inventoryID + "," + name + "," + price + "," + description;
    }

    private static Path getDefaultPath()
    {
        String home = System.getProperty("user.home");
        return Paths.get(home).resolve("Inventory.csv");
    }

    public static void save()
    {
        save(getDefaultPath());
    }

    public static void save(Path tempPath)
    {
        try (PrintWriter writer = new PrintWriter(new FileWriter(tempPath.toFile())))
        {
            for (Inventory tempInv : inventoryList)
            {
                writer.println(tempInv.toCSVString());
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
                Inventory tempInv = new Inventory(data[1], Double.parseDouble(data[2]), data[3], Integer.parseInt(data[0]));
                inventoryList.add(tempInv);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
