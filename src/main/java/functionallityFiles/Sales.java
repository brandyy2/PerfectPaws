package functionallityFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Sales {

    private static int numOfSales = 0;
    private int salesID;
    private int inventoryID;
    private int userID;
    private double totalCost;
    private static ArrayList<Sales> salesList = new ArrayList<>();

    // Constructor
    public Sales(int custID, int invID, double price)
    {
        numOfSales++;
        salesID = numOfSales;
        userID = custID;
        inventoryID = invID;
        totalCost = price;
    }

    // Constructor used when converting CSV to an existing sale
    public Sales(int saleID, int invID, int custID, double price)
    {
        this.salesID = saleID;
        this.inventoryID = invID;
        this.userID = custID;
        this.totalCost = price;
    }

    public int getSalesID()
    {
        return salesID;
    }

    public int getUserID()
    {
        return userID;
    }

    public int getInventoryID()
    {
        return inventoryID;
    }

    public double getTotalCost()
    {
        return totalCost;
    }

    public static ArrayList<Sales> getSalesList()
    {
        return salesList;
    }

    public void addToSalesList(Sales sold)
    {
        salesList.add(sold);
        save();
    }

    // Method to convert sales data to CSV string
    public String toCSVString()
    {
        return salesID + "," + userID + "," + inventoryID + "," + totalCost;
    }

    private static Path getDefaultPath()
    {
        String home = System.getProperty("user.home");
        return Paths.get(home).resolve("functionallityFiles.Sales.csv");
    }

    public static void save()
    {
        save(getDefaultPath());
    }

    public static void save(Path tempPath)
    {
        try (PrintWriter writer = new PrintWriter(new FileWriter(tempPath.toFile())))
        {
            for (Sales tempSale : salesList)
            {
                writer.println(tempSale.toCSVString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void load() {
        load(getDefaultPath());
    }

    public static void load(Path tempPath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(tempPath.toFile())))
        {
            String line;

            while ((line = reader.readLine()) != null)
            {
                String[] data = line.split(",");
                Sales tempSale = new Sales(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]),
                        Double.parseDouble(data[3]));
                salesList.add(tempSale);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}