package com.nebrija.jp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignInMenuController {
	String user;
	String password;
	String email;

    @FXML
    private TextField registerUser;

    @FXML
    private TextField registerEmail;

    @FXML
    private PasswordField registerPassword;

    @FXML
    private Button registerSignInButtom;

    @FXML
    void ActionregisterSignInButtom(ActionEvent event) {
    	user=registerUser.getText();
    	password=registerPassword.getText();
    	email=registerEmail.getText();
    	User.signIn(user, email, password);
    	Launcher.signInMenu.close();
    	Launcher.userMenu.show();
    	

    }

}
