package ourPetInventoryStuff;


public class Pets {

    private String name;
    private String species;
    private String breed;
    private String lifeStage;
    private String sex;
    private String weight;
    private double adoptionFee;
    private int userID;
    private int inventoryID;
    private String dateSold;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setLifeStage(String lifeStage) {
        this.lifeStage = lifeStage;
    }

    public String getLifeStage() {
        return lifeStage;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setAdoptionFee(double adoptionFee) {
        this.adoptionFee = adoptionFee;
    }
    public double getAdoptionFee() {
        return adoptionFee;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    public int getUserID() {
        return userID;
    }
    public void setInventoryID(int inventoryID) {
        this.inventoryID= inventoryID;
    }
    public int getInventoryID() {
        return inventoryID;
    }

    public void setDateSold(String dateSold) {
        this.dateSold = dateSold;
    }
    public String getDateSold() {
        return dateSold;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", breed='" + breed + '\'' +
                ", lifeStage='" + lifeStage + '\'' +
                ", sex='" + sex + '\'' +
                ", weight='" + weight + '\'' +
                ", adoptionFee=" + adoptionFee +
                ", userID=" + userID +
                ", inventoryID=" + inventoryID +
                ", dateSold='" + dateSold + '\'' +
                '}';
    }
}