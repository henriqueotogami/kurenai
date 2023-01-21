package com.jounin.kurenai.controller.fxml;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;
    public LoginController() {

    }

    public void login() {
        System.out.println("LoginController - login(): BEGIN");
        System.out.println("LoginController - login(): emailField: " + emailField.getText());
        System.out.println("LoginController - login(): passwordField: " + emailField.getText());
        System.out.println("LoginController - login(): END");
    }
}
