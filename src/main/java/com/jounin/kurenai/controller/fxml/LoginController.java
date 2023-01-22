package com.jounin.kurenai.controller.fxml;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.controlsfx.control.Notifications;

public class LoginController {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;
    public LoginController() {

    }

    public void login() {
        System.out.println("LoginController - login(): BEGIN");
        final String defaultEmail = "student@cod3r.com.br";
        final String defaultPassword = "12345678";
        final String typedEmail = emailField.getText();
        final String typedPassword = passwordField.getText();
        if (typedEmail.equals("") || typedPassword.equals("")) {
            System.out.println("LoginController - login(): E-mail or password is empty.");
        } else {
            System.out.println("LoginController - login(): emailField: " + typedEmail);
            System.out.println("LoginController - login(): passwordField: " + typedPassword);
            final boolean isValidEmail = typedEmail.equals(defaultEmail);
            final boolean isValidPassword = typedPassword.equals(defaultPassword);
            if(isValidEmail && isValidPassword) {
                System.out.println("LoginController - login(): SUCCESS");
                Notifications.create()
                        .position(Pos.CENTER)
                        .title("Login FXML")
                        .text("Login was SUCCESS!")
                        .showInformation();
            } else {
                System.out.println("LoginController - login(): FAILED");
                Notifications.create()
                        .position(Pos.CENTER)
                        .title("Login FXML")
                        .text("Login was FAILED!")
                        .showError();
            }
        }
        System.out.println("LoginController - login(): END");
    }
}
