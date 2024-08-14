package com.deisesales.loginpage_javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.*;
import java.awt.event.ActionEvent;

public class HelloController {

    @FXML
    private Label textoBemVindo;

    @FXML
    private TextField txtUsuario;

    @FXML
    void acaoBotao(ActionEvent event) {
        textoBemVindo.setText("Olá mundo");
    }
}