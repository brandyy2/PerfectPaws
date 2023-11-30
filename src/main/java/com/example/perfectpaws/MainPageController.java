package com.example.perfectpaws;

import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import ourPetInventoryStuff.Pets;


import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class MainPageController implements Initializable {
    @FXML private Button addToCartButton;@FXML private Button addToCartButton1;@FXML private Button addToCartButton2;@FXML private Button addToCartButton3;
    @FXML private Text adoptionFee;@FXML private Text adoptionFee1;@FXML private Text adoptionFee2;@FXML private Text adoptionFee3;
    @FXML private Text breed;@FXML private Text breed1;@FXML private Text breed2;@FXML private Text breed3;
    @FXML private Hyperlink cartLink;
    @FXML private Text lifeStage;@FXML private Text lifeStage1;@FXML private Text lifeStage2;@FXML private Text lifeStage3;
    @FXML private Hyperlink logOutLink;
    @FXML private AnchorPane myAnchorPane;@FXML private AnchorPane myAnchorPane1;@FXML private AnchorPane myAnchorPane2;@FXML private AnchorPane myAnchorPane3;
    @FXML private Text name;@FXML private Text name1;@FXML private Text name2;@FXML private Text name3;
    @FXML private TextField searchPetBox;
    @FXML private Text sex;@FXML private Text sex1;@FXML private Text sex2;@FXML private Text sex3;@FXML private Text species;
    @FXML private Text species1;@FXML private Text species2;@FXML private Text species3;
    @FXML private Hyperlink viewSalesLink;
    @FXML private Text weight;@FXML private Text weight1;@FXML private Text weight2;
    @FXML private Text weight3;
    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            showText();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void showText() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        File petsJSONFile = new File("src/main/resources/pets.json");
        Pets[] pets = objectMapper.readValue(petsJSONFile, Pets[].class);

        name.setText(pets[0].getName());
        species.setText(pets[0].getSpecies());
        breed.setText(pets[0].getBreed());
        lifeStage.setText(pets[0].getLifeStage());
        sex.setText(pets[0].getLifeStage());
        weight.setText(pets[0].getWeight());
        adoptionFee.setText(String.valueOf(pets[0].getAdoptionFee()));

        name1.setText(pets[1].getName());
        species1.setText(pets[1].getSpecies());
        breed1.setText(pets[1].getBreed());
        lifeStage1.setText(pets[1].getLifeStage());
        sex.setText(pets[1].getLifeStage());
        weight1.setText(pets[1].getWeight());
        adoptionFee1.setText(String.valueOf(pets[1].getAdoptionFee()));

        name2.setText(pets[7].getName());
        species2.setText(pets[7].getSpecies());
        breed2.setText(pets[7].getBreed());
        lifeStage2.setText(pets[7].getLifeStage());
        sex2.setText(pets[7].getLifeStage());
        weight2.setText(pets[7].getWeight());
        adoptionFee2.setText(String.valueOf(pets[7].getAdoptionFee()));

        name3.setText(pets[10].getName());
        species3.setText(pets[10].getSpecies());
        breed3.setText(pets[10].getBreed());
        lifeStage3.setText(pets[10].getLifeStage());
        sex3.setText(pets[10].getLifeStage());
        weight3.setText(pets[10].getWeight());
        adoptionFee3.setText(String.valueOf(pets[9].getAdoptionFee()));

    }
    @FXML
    void addToCart(ActionEvent event) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        File petsJSONFile = new File("src/main/resources/pets.json");
        Pets pets = objectMapper.readValue(petsJSONFile, Pets.class);
        System.out.println("Species: " + pets.getSpecies());
        System.out.println("Breed: " + pets.getBreed());

        species.setText(pets.getSpecies());
        breed.setText(pets.getBreed());
    }
    @FXML
    void logOut(ActionEvent event) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 635,550 );
        Stage stage = new Stage();
        stage.setTitle("Login Page");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void searchPet(ActionEvent event) {

    }

    @FXML
    void viewCart(ActionEvent event) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("cart-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 730,610 );
        Stage stage = new Stage();
        stage.setTitle("Cart Page");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void viewSales(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sales-admin-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 870,640 );
        Stage stage = new Stage();
        stage.setTitle("Sales Page (Admin Only)");
        stage.setScene(scene);
        stage.show();

    }

}
