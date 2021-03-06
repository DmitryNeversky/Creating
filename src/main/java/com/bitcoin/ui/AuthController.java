package com.bitcoin.ui;

import com.bitcoin.domain.Controller;
import com.bitcoin.domain.Game;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class AuthController extends Validator{

    @FXML
    private TextField authEmail;

    @FXML
    private Button authButton;

    @FXML
    private Button regButton;

    @FXML
    private Button remButton;

    @FXML
    private PasswordField authPassword;

    @FXML
    private Label emailLabel;

    @FXML
    private Label passwordLabel;

    @FXML
    void initialize() {
        authButton.setOnAction(e -> {
            String email = authEmail.getText();
            String password = authPassword.getText();

            if(validEmail(email, emailLabel) && validPassword(password, passwordLabel)) {
                if (new Controller(email, password).auth(emailLabel, passwordLabel)) {
                    authButton.getScene().getWindow().hide();
                    Game.email = email;
                    repaint("/fxml/bitcoin.fxml", "Игра");
                }
            }
        });

        regButton.setOnAction(e -> {
            regButton.getScene().getWindow().hide();
            repaint("/fxml/reg.fxml", "Регистрация");
        });

        remButton.setOnAction(e -> {
            remButton.getScene().getWindow().hide();
            repaint("/fxml/rem.fxml", "Удаление");
        });
    }
}