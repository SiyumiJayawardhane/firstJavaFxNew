package com.example.firstjavafxnew;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class LoginController extends Application {

    @FXML
    public MenuItem closeMenuButton;
    @FXML
    public Button loginButton;
    @FXML
    public TextField userNameText;
    @FXML
    public PasswordField passwordText;
    @FXML
    public Label mySpaceLabel;

    @FXML
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }
    @FXML
    public void onCloseMenuButtonClick(){
        System.exit(1);
    }

    @FXML
    public void onLoginButtonClick(ActionEvent actionEvent) {
        String userName = userNameText.getText();
        String password = passwordText.getText();
        if(userName.isEmpty() || password.isEmpty()){
            mySpaceLabel.setText("Username and Password are Empty");
        }

    }
}
