package com.mycompany.javafx_darktheme;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class LoginController implements Initializable {
    
    @FXML
    private Button btn_login;
    private static final String IDLE_BUTTON_STYLE = "-fx-background-color:  #4dce74;";
    
    @FXML 
    private Label lbl_confirm;
    
    @FXML 
    private TextField txt_un;
    @FXML 
    private Label lbl_err_un;
    
    @FXML 
    private TextField txt_pwd;
    @FXML 
    private Label lbl_err_pwd;
    
    @FXML 
    private Label lbl_forgotpwd;
    
    @FXML 
    private Label lbl_signup;

    // Formatting Effects
    DropShadow dropShadowEnter  = new DropShadow();
    DropShadow dropShadowExit   = new DropShadow();
  
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Effects
        dropShadowEnter.setRadius(5.0);
        dropShadowEnter.setOffsetX(3.0);
        dropShadowEnter.setOffsetY(3.0);
        dropShadowEnter.setColor(Color.color(0.4, 0.3, 0.3));
        
        dropShadowExit.setRadius(0.0);
        dropShadowExit.setOffsetX(0);
        dropShadowExit.setOffsetY(0);
        dropShadowExit.setColor(Color.color(0.0, 0.0, 0.0)); 
        
        // Login btn
        btn_login.setOnMouseEntered((MouseEvent e) -> btn_login.setEffect(dropShadowEnter));
        btn_login.setOnMouseExited((MouseEvent e) -> btn_login.setEffect(dropShadowExit));
         
    }    
    
    
    @FXML private boolean loginBtnClicked(MouseEvent event){
        boolean isValidUser = false;
        
        //Get user input
        String userName = txt_un.getText().trim();
        String userPwd = txt_pwd.getText().trim();
        
        btn_login.setEffect(dropShadowExit);
        
        System.out.println(userName + ":" +userPwd);
        
        return isValidUser;
    } 
    
    //TODO: test not working
    @FXML private void forgotLblClicked(MouseEvent event){
        boolean isValidUser = false;
        

        System.out.println("Forgot pwd clicked");

    } 
}