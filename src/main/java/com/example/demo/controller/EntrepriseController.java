package com.example.demo.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class EntrepriseController {

    @FXML
    private TextField searchField;

    @FXML
    private void handleSearch(ActionEvent event) {
        @SuppressWarnings("unused")
        String query = searchField.getText();
    }
}