/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package testproject1;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author shayc
 */
public class LoginFXMLController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private PasswordField Passwordname;
    @FXML
    private TextField Username;
    @FXML
    private TextField Portname;
    @FXML
    private TextField BDMSname;

    /**
     * Initializes the controller class.
     */
    
    private String urll;
    private String username;
    private String password;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }   
    
    
    private void Link(){
          
        this.urll="jdbc:"+this.BDMSname.getText()+"://localhost:"+this.Portname.getText()+"/"; 
        this.username = this.Username.getText();
        this.password = this.Passwordname.getText();
        
        //DBMS name, DB name, Username name, Password.
        //url,username,password.
        
        
        try{
        
        // jdbc:mysql://localhost:3306/world
            
        
        Class.forName("com.mysql.cj.jdbc.Driver");    
            
        Connection con = DriverManager.getConnection(urll, username, password);
        
        }
        

        catch(Exception e){
            System.out.println(e);
            
            
        }
    
    }
    
    

    @FXML
    private void OnLoginClicked(ActionEvent event) throws IOException{
        
        root = FXMLLoader.load(getClass().getResource("/textproject1/SecondScreenFXLM.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Automobiles");
        //Image image = new Image("/Images/CarIcon.png");
        //stage.getIcons().add(image);
        stage.show();
        
        
    }

    @FXML
    private void OnCloseClicked(ActionEvent event) {
        
        
    }
    

    
        
    
}
