package ourPetInventoryStuff;

public class shipping {


    private int shippingTypeID;
    private String name;
    private int price;
    public void setShippingTypeID(int shippingTypeID) {
        this.shippingTypeID = shippingTypeID;
    }
    public int getShippingTypeID() {
        return shippingTypeID;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "shipping{" +
                "shippingTypeID=" + shippingTypeID +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}