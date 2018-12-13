package com.nebrija.jp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import java.util.ArrayList;


public class sellMenuController {
	
	Category lapices=new Category("Lapices");
	Category rotuladores=new Category("Rotuladores");
	Product rojo=new Product ("Lapices", "Lapiz Rojo", 2, 1);
	Product verde=new Product ("Rotuladores", "Rotulador Verde", 3, 2);
	

    @FXML
    private Button buyButton;

    @FXML
    private ChoiceBox<?> categoryChoice;

    @FXML
    private ListView<?> productList;
    @FXML
     void addCategories() {
    	for(int i = 0; i < Category.Categories.size(); i++) {
    		categoryChoice.getItems().add(Category.Categories.get(i).getName());
		}
    	
    }
    
    @FXML
    void printlist() {
    	for(int i = 0; i < Category.Categories.size(); i++) {
    	productList.getItems().add(Category.Categories.get(categoryChoice.getCursor()).getProducts(i).getName());
    }
    }

}

