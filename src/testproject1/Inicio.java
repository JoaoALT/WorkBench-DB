/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package testproject1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
/**
 *
 * @author lenovo
 */
public class Inicio extends Application{
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage ventana) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/testproject1/LoginFXML.fxml"));
        Scene scene = new Scene(root);
        ventana.setScene(scene);
        //Image image = new Image("/Images/RWIcon.png");
        //ventana.getIcons().add(image);
        
        //ventana.setTitle("Rent Wheels");
        ventana.setResizable(false);
        ventana.setOnCloseRequest(event -> {event.consume();});
        
        ventana.show();
    }
}