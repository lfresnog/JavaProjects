package com.nebrija.jp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import java.util.ArrayList;

public class sellMenuController {
	
    @FXML
    private Button buyButton;

    @FXML
    private ChoiceBox<?> categoryChoice;

    @FXML
    private ListView<?> productList;
    
    private final ObservableList<Category> Categories = FXCollections.observableArrayList();
	
    @FXML
    public void initializebox() {
    	Categories.add(new Category("Lapices"));
    	Categories.add(new Category("Rotuladores"));
    	categoryChoice.setItems(Categories);
    }
    
    }


