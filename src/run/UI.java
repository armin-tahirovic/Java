package run;


import control.Control;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.*;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class UI extends Application {


    private double xOffset = 0;
    private double yOffset = 0;
    private static BorderPane root = new BorderPane();

    public static BorderPane getRoot() {
        return root;
    }

    @Override
    public void start(Stage primaryStage) throws IOException {


        URL logInScreenUrl = getClass().getResource("../view/LogInScreen.fxml");
        AnchorPane logInScreen = FXMLLoader.load(logInScreenUrl);

        URL menuBarUrl = getClass().getResource("../view/LogInBar.fxml");
        Pane menuBar = FXMLLoader.load(menuBarUrl);



        root.setCenter(logInScreen);
        root.setTop(menuBar);

        Scene scene = new Scene(root, 700, 500);

        primaryStage.setTitle("");
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();

        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                primaryStage.setX(event.getScreenX() - xOffset);
                primaryStage.setY(event.getScreenY() - yOffset);
            }
        });
    }




    public static void main(String[] args) {

        Control.inst();
        DataFileGenerator.generateFile();



        DataGenerator.randomReadings(100);

        Meter meter1 = new Meter(1,true);
        Meter meter2 = new Meter(2,true);
        Meter meter3 = new Meter(3,true);

        meter1.setReadings(DataGenerator.randomReadings(1000));
        meter2.setReadings(DataGenerator.randomReadings(1000));
        meter3.setReadings(DataGenerator.randomReadings(1000));
        Address address1 = new Address("Hobrovej",13);

        User user1 = new User(1001,"nico",true,address1,"1.tv",meter1);
        User user2 = new User(1002,"oscar",false,address1,"1.th",meter2);
        User user3 = new User(1003,"armin",false,address1,"2.tv",meter3);


        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        meter1.getReadings().sort(Comparator.comparing(Reading::getDate));
        meter2.getReadings().sort(Comparator.comparing(Reading::getDate));
        meter3.getReadings().sort(Comparator.comparing(Reading::getDate));

        Apartment apartment1 = new Apartment(1);

        apartment1.setUserList(users);

        ArrayList<Apartment> apartments = new ArrayList<>();

        apartments.add(apartment1);

        Control.inst().setApartmentList(apartments);

        Domain domain = new Domain();

        Consumption consumption = new Consumption();
        consumption.calculateDayConsumption(1, domain, LocalDate.now());

        launch(args);
    }


}
