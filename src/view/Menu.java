package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import run.UI;

import java.io.IOException;
import java.net.URL;

public class Menu {

    @FXML
    private Button homeBtn;

    @FXML
    private Button editBtn;

    @FXML
    private Button logOutBtn;

    @FXML
    private Button closeBtn;

    @FXML
    private Button minBtn;

    @FXML
    private Button maxBtn;

    @FXML
    void switchToHome (ActionEvent event){
        try{
            URL homePageUrl = getClass().getResource("HomePage.fxml");
            AnchorPane homePage = FXMLLoader.load(homePageUrl);

            BorderPane border = UI.getRoot();
            border.setCenter(homePage);

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    void switchToEdit (ActionEvent event){
        try{
            URL editPageUrl = getClass().getResource("EditPage.fxml");
            AnchorPane editPage = FXMLLoader.load(editPageUrl);

            BorderPane border = UI.getRoot();
            border.setCenter(editPage);

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    void logOut (ActionEvent event){
        try{
            URL logInUrl = getClass().getResource("LogInScreen.fxml");
            AnchorPane logInPage = FXMLLoader.load(logInUrl);

            BorderPane border = UI.getRoot();
            border.setCenter(logInPage);



        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    void closeApp (ActionEvent event) {

        Stage stage = (Stage) closeBtn.getScene().getWindow();
        stage.close();
    }

    @FXML
    void minApp (ActionEvent event) {

        Stage stage = (Stage) minBtn.getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    void maxApp (ActionEvent event) {

        Stage stage = (Stage) maxBtn.getScene().getWindow();
        stage.setMaximized(true);
    }
}
