package ourPetInventoryStuff;

public class sales {
    private int userID;
    private int inventoryID;
    private int shippingType;
    private String dateSold;
    private double subtotal;
    private double tax;
    private double grandTotal;
    public sales() {

    }
    public void setUserID(int userID) {
        this.userID = userID;
    }
    public int getUserID() {
        return userID;
    }

    public void setInventoryID(int inventoryID) {
        this.inventoryID = inventoryID;
    }
    public int getInventoryID() {
        return inventoryID;
    }

    public void setShippingType(int shippingType) {
        this.shippingType = shippingType;
    }
    public int getShippingType() {
        return shippingType;
    }

    public void setDateSold(String dateSold) {
        this.dateSold = dateSold;
    }
    public String getDateSold() {
        return dateSold;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    public double getSubtotal() {
        return subtotal;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
    public double getTax() {
        return tax;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }
    public double getGrandTotal() {
        return grandTotal;
    }

    @Override
    public String toString() {
        return "sales{" +
                "userID=" + userID +
                ", inventoryID=" + inventoryID +
                ", shippingType=" + shippingType +
                ", dateSold='" + dateSold + '\'' +
                ", subtotal=" + subtotal +
                ", tax=" + tax +
                ", grandTotal=" + grandTotal +
                '}';
    }

}