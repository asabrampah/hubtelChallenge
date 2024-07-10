package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class Controller {
    @FXML
    private TextField searchBar;

    @FXML
    private ListView<Pane> transactionList;

    @FXML
    public void initialize() {
        // Load transactions and add to the list
        // Example: transactionList.getItems().add(FXMLLoader.load(getClass().getResource("transaction_card.fxml")));
    }

    @FXML
    private void handleHistory() {
        // Handle history button click
    }

    @FXML
    private void handleSummary() {
        // Handle transaction summary button click
    }
}
