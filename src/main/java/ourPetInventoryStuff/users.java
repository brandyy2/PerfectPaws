package ourPetInventoryStuff;

public class users {


    private int userID = 16;
    private String username;
    private String password;
    private Boolean isAdmin;
    private String firstName;
    private String lastName;
    private String shippingAddress;

    public users() {

    }
    public users(String username, String password, Boolean isAdmin, String firstName,String lastName){
        userID++;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }
    public int getUserID() {
        return userID;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public void setIsAdmin (boolean isAdmin){
        this.isAdmin = isAdmin;
    }
    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
    public String getShippingAddress() {
        return shippingAddress;
    }

    @Override
    public String toString() {
        return "users{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                '}';
    }
}