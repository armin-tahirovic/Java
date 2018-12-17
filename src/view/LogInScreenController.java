package view;


import control.Control;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import model.Domain;
import run.UI;

import java.io.IOException;
import java.net.URL;

public class LogInScreenController {

    @FXML
    private Button logInBtn;

    @FXML
    private TextField userField;

    @FXML
    private PasswordField pwField;

    @FXML
    private Label errorLabel;

    @FXML
    void logIn (javafx.event.ActionEvent event){
        try{
            if (Integer.parseInt(userField.getText()) == Control.inst().getApartmentList().get(0).getUserList().get(0).getNumber() && pwField.getText().equals(Control.inst().getApartmentList().get(0).getUserList().get(0).getPassWord()) && Control.inst().getApartmentList().get(0).getUserList().get(0).isSuperUser()){
                URL homePageUrl = getClass().getResource("HomePage.fxml");
                AnchorPane homePage = FXMLLoader.load(homePageUrl);

                URL menuBarUrl = getClass().getResource("Menu.fxml");
                Pane menuBar = FXMLLoader.load(menuBarUrl);

                BorderPane border = UI.getRoot();
                border.setCenter(homePage);
                border.setTop(menuBar);
                }
             else {
                 userField.setText("");
                 pwField.setText("");
                 errorLabel.setVisible(true);
             }
            }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
