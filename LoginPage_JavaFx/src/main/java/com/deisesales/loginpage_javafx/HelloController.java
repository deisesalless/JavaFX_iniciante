package com.deisesales.loginpage_javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;


public class HelloController {

    @FXML
    private Label textoBemVindo;

    @FXML
    private TextField txtNome;

    @FXML
    public void acaoBotao(ActionEvent event) {
        textoBemVindo.setText("Olá mundo: " + txtNome.getText());
    }
}