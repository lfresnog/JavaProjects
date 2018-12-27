package com.nebrija.src.JavaFX;



import com.nebrija.src.Product;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;

public class sellMenuController {

	
    @FXML
    private Button buyButton;

    @FXML
    private SplitMenuButton categoriesbox;

    @FXML
    private MenuItem Lapices;

    @FXML
    private MenuItem Rotuladores;

    @FXML
    private ListView<Product> productList;
    
    private final ObservableList<Product> lapicest = FXCollections.observableArrayList();

    @FXML
    void openLapices(ActionEvent event) {
    	lapicest.add(new Product("Lapices","Rojo", 2, 5));
    	lapicest.add(new Product("Lapices","Verde", 3, 4));
    	
    	productList.setItems(lapicest));
    	
    }

    @FXML
    void openRotuladores(ActionEvent event) {

    }

}
