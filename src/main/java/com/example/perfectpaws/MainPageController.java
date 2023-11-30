package com.example.perfectpaws;

import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import ourPetInventoryStuff.Pets;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MainPageController implements Initializable {
    @FXML
    private TableColumn<Pets, String> addButton;

    @FXML
    private TableColumn<Pets, String> breed;

    @FXML
    private TableColumn<Pets, String> lifeStage;

    @FXML
    private TableColumn<Pets, String> petName;

    @FXML
    private TableColumn<Pets, Double> price;

    @FXML
    private TableColumn<Pets, String> sex;

    @FXML
    private TableColumn<Pets, Integer> weight;

    @FXML
    private TableView<Pets> myTable;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            showInventory();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void showInventory() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File petsJSONFile = new File("src/main/resources/pets.json");
        Pets[] pets = objectMapper.readValue(petsJSONFile, Pets[].class);
        ObservableList<Pets> petsList = FXCollections.observableArrayList(pets);

        petName.setCellValueFactory(new PropertyValueFactory<>("name"));
        breed.setCellValueFactory(new PropertyValueFactory<>("breed"));
        lifeStage.setCellValueFactory(new PropertyValueFactory<>("lifeStage"));
        sex.setCellValueFactory(new PropertyValueFactory<>("sex"));
        weight.setCellValueFactory(new PropertyValueFactory<>("weight"));
        price.setCellValueFactory(new PropertyValueFactory<>("adoptionFee"));
        myTable.setItems(petsList);

    }


    @FXML
    void addToCart(ActionEvent event) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        File petsJSONFile = new File("src/main/resources/pets.json");
        Pets pets = objectMapper.readValue(petsJSONFile, Pets.class);
        System.out.println("Species: " + pets.getSpecies());
        System.out.println("Breed: " + pets.getBreed());

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
