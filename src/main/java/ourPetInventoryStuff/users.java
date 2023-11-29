package ourPetInventoryStuff;

public class users {


    private int userID;
    private String username;
    private String password;
    private Boolean isAdmin;
    private String fullName;
    private String shippingAddress;

    public users() {

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

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
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
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                ", fullName='" + fullName + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                '}';
    }
}