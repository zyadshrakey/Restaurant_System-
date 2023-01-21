package com.example.restraurantsystem;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController   {
    Parent rootbreakfast;
    {
        try {
            rootbreakfast = FXMLLoader.load(getClass().getResource("breakfastUI.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    Parent rootLunch;

    {
        try {
            rootLunch = FXMLLoader.load(getClass().getResource("LunchUI.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    Parent rootDinar;

    {
        try {
            rootDinar = FXMLLoader.load(getClass().getResource("DinarUI.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    Parent rootDesart;

    {
        try {
            rootDesart = FXMLLoader.load(getClass().getResource("DesartUI.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    Parent rootDrinks;

    {
        try {
            rootDrinks = FXMLLoader.load(getClass().getResource("DrinksUI.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @FXML
    public void clickOnBreakfast(){
        Scene scene=new Scene(rootbreakfast,550,450);
        Stage stage=new Stage();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void clickOnLunch(){
        Scene scene=new Scene(rootLunch,790,670);
        Stage stage=new Stage();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void clickOnDinar(){
        Scene scene=new Scene(rootDinar,650,550);
        Stage stage=new Stage();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void clickOnDesat(){
        Scene scene=new Scene(rootDesart,642,580);
        Stage stage=new Stage();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void clickOnDrinks(){
        Scene scene=new Scene(rootDrinks,642,500);
        Stage stage=new Stage();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }


}