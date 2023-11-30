package ourPetInventoryStuff;


public class Pets {

    private String name;
    private String species;
    private String breed;
    private String lifeStage;
    private String sex;
    private String weight;
    private double adoptionFee;
    private int inventoryID;
    public Pets(){

    }



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

    public void setInventoryID(int inventoryID) {
        this.inventoryID= inventoryID;
    }
    public int getInventoryID() {
        return inventoryID;
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
                ", inventoryID=" + inventoryID +
                '}';
    }
}