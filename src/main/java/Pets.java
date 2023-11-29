/* Copyright 2023 freecodeformat.com */

//import org.codehaus.jackson.annotate.JsonIgnoreProperties;
// import org.codehaus.jackson.annotate.JsonProperty;
/* Time: 2023-11-28 18:49:3 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
public class Pets {

   // @JsonProperty("Name")
    private String name;
    //@JsonProperty("Species")
    private String species;
    //@JsonProperty("Breed")
    private String breed;
   // @JsonProperty("Life Stage");
    private String lifeStage;
  //  @JsonProperty("Sex")
    private String sex;
   // @JsonProperty("Weight")
    private String weight;
  //  @JsonProperty("Adoption Fee")
    private double adoptionFee;
  //  @JsonProperty("UserID")
    private int userid;
   // @JsonProperty("InventoryID")
    private int inventoryId;
  //  @JsonProperty("DateSold")
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

    public void setUserid(int userid) {
        this.userid = userid;
    }
    public int getUserid() {
        return userid;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }
    public int getInventoryId() {
        return inventoryId;
    }

    public void setDateSold(String dateSold) {
        this.dateSold = dateSold;
    }
    public String getDateSold() {
        return dateSold;
    }

}