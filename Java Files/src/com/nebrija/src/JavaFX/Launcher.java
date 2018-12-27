package com.nebrija.src.JavaFX;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application{

	
	static Stage userMenu;
	static Stage signInMenu;
	static Stage sellMenu;
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
	
		userMenu = new Stage();
		signInMenu= new Stage();
		sellMenu= new Stage();
		
		
		try {
		
		URL res = getClass().getClassLoader().getResource("UserMenu.fxml");
		Parent root = FXMLLoader.load(res);
		Scene scene = new Scene(root);
		userMenu.setScene(scene);
		userMenu.setTitle("Luis-Shop");
		userMenu.show();
		
		}catch(Exception E) {
			
			E.printStackTrace();
			
		}
			

	try {
	
	URL res = getClass().getClassLoader().getResource("SignInMenu.fxml");
	Parent root = FXMLLoader.load(res);
	Scene scene = new Scene(root);
	signInMenu.setScene(scene);
	signInMenu.setTitle("Luis-Shop");
	
	}catch(Exception E) {
		
		E.printStackTrace();
		
	}
	
	try {
		
		URL res = getClass().getClassLoader().getResource("sellMenu.fxml");
		Parent root = FXMLLoader.load(res);
		Scene scene = new Scene(root);
		sellMenu.setScene(scene);
		sellMenu.setTitle("Luis-Shop");
		
		}catch(Exception E) {
			
			E.printStackTrace();
			
		}
		
}
	
	public static void mainLauncher() {
		// TODO Auto-generated method stub

		launch(null);
		
		
	}

	
}
