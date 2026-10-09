package com.example.poo_ejemplo1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField num1;
    @FXML
    private TextField num2;

    @FXML
    protected void multiplication() {
        double firstNum = Double.parseDouble(num1.getText());
        double secondNum = Double.parseDouble(num2.getText());
        double multiplication = firstNum * secondNum;
        welcomeText.setText("El resultado es: " + multiplication);
    }



    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
