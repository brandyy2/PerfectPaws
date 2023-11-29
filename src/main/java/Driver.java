import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {

        ArrayList<Inventory> cart = new ArrayList<>();

        ArrayList<Inventory> test = sortAvailableInventory();

        for (Inventory temp : test)
        {
            System.out.println(temp.getName() + "\n" + temp.getDescription() + "\n" + temp.getPrice() + "\n");
        }
    }

    public static void signUp(String username, String password)
    {
        User.load();

        ArrayList<User> tempArray = User.getUserList();
        boolean usernameTaken = false;

        for (User temp : tempArray)
        {
            if (username.equals(temp.getUsername()))
            {
                usernameTaken = true;
                break;
            }
        }

        if (password.length() >= 6 && !usernameTaken)
        {
            User tempUser = new User(username, password);
            tempUser.addUser(tempUser);
            User.save();
        }

        else
            System.out.println("Password must contain a minimum of six characters.");

    }

    public static User login(String username, String password)
    {
        User.load();
        ArrayList<User> arrayTemp = User.getUserList();

        for (User temp : arrayTemp)
        {
            if (temp.getUsername().equals(username) && temp.getPassword().equals(password))
                return temp;

        }

        return null;
    }

    public static void addInventory(User user, String title, String description, double price)
    {
        Inventory tempInventory = new Inventory(title, price, description);
        tempInventory.addInventory(tempInventory);
        Inventory.save();
    }

    public static ArrayList<Inventory> checkAvailableInventory()
    {
        Sales.load();
        Inventory.load();
        ArrayList<Sales> tempSale = Sales.getSalesList();
        ArrayList<Inventory> availableInventory = Inventory.getInventoryList();

        for (int i = availableInventory.size() - 1; i >= 0; i--)
        {
            for (Sales sale : tempSale)
            {
                if (sale.getInventoryID() == availableInventory.get(i).getInventoryID())
                {
                    availableInventory.remove(i);
                    break;
                }
            }
        }
        return availableInventory;
    }

    public static ArrayList<Inventory> sortAvailableInventory()
    {
        ArrayList<Inventory> temp = checkAvailableInventory();
        for (int i = 0; i < temp.size(); i++)
        {
            for (int j = 0; j < temp.size() - 1; j++)
            {
                if (temp.get(j).getPrice() > temp.get(j + 1).getPrice())
                {
                    Inventory tempInv = temp.get(j);
                    temp.set(j, temp.get(j + 1));
                    temp.set(j + 1, tempInv);
                }
            }
        }

        return temp;
    }

    public static void addToCart(ArrayList<Inventory> cart, Inventory temp)
    {
        cart.add(temp);
    }

    public static void removeFromCart(ArrayList<Inventory> cart, Inventory temp)
    {
        cart.remove(temp);
    }

    public static boolean validatePayment(String cardNum, int csv, int expMonth, int expYear)
    {
        return cardNum.length() == 16 && (csv > 0 && csv < 100) && (expMonth > 0 && expMonth < 13) && (expYear > 2022 && expYear < 2030);
    }

    public static double applySalesTax(ArrayList<Inventory> cart)
    {
        double total = cart.stream().mapToDouble(Inventory::getPrice).sum();
        return (total * 0.06) + total;
    }

    public static void checkout(ArrayList<Inventory> cart, User currentUser)
    {
        int userID = currentUser.getUserID();
        for (Inventory tempInv : cart)
        {
            Sales temp = new Sales(userID, tempInv.getInventoryID(), tempInv.getPrice());
            temp.addToSalesList(temp);
        }
    }


}