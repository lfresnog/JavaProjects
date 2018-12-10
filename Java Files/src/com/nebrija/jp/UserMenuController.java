package com.nebrija.jp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class UserMenuController {
	String user;
	String password;
	
    @FXML
    private Button LogInButton;

    @FXML
    private TextField UserText;

    @FXML
    private PasswordField setPassword;
    
    @FXML
    private Button SignInButton;

    @FXML
    void ActionLogInButton(ActionEvent event) {
    	user = UserText.getText();
    	password = UserText.getText();
    	User.logIn(user, password);
    }
  
    @FXML
    void ActionSignInButton(ActionEvent event) {
    	Launcher.userMenu.close();
    	Launcher.signInMenu.show();
    }

}
