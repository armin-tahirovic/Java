package view;

import control.Control;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Meter;
import model.User;

public class EditPage {


    @FXML
    private Label currentUserLabel;

    @FXML
    private Label currentAptLabel;

    @FXML
    private Label currentAddressLabel;

    @FXML
    private TextField usernameField;
    @FXML
    private TextField pwField;
    @FXML
    private TextField aptField;
    @FXML
    private TextField meterField;
    @FXML
    private TextField meterField2;
    @FXML
    private TextField pwField2;
    @FXML
    private Button createUser;
    @FXML
    private Button deactivateMeter;
    @FXML
    private Button deleteBtn;

    @FXML
    void initialize(){
        currentUserLabel.setText("User: " + Control.inst().getApartmentList().get(0).getUserList().get(0).getNumber());
        currentAddressLabel.setText("" + Control.inst().getApartmentList().get(0).getUserList().get(0).getAddress());
    }

    @FXML
    void createMeter(ActionEvent event){
        Meter meter = new Meter(Integer.parseInt(meterField.getText()),true);
        User user = new User(Integer.parseInt(usernameField.getText()),pwField.getText(),false,Control.inst().getApartmentList().get(0).getUserList().get(0).getAddress(),aptField.getText(),meter);
        Control.inst().getApartmentList().get(0).getUserList().add(user);
        usernameField.setText("");
        pwField.setText("");
        aptField.setText("");
        meterField.setText("");
    }
    @FXML
    void deactivateMeter(ActionEvent event){
        if (pwField2.getText().equals(Control.inst().getApartmentList().get(0).getUserList().get(0).getPassWord())){
            Control.inst().getApartmentList().get(0).getUserList().get(Integer.parseInt(meterField2.getText())-1).getMeter().setStatus(false);
            pwField2.setText("");
            meterField2.setText("");
        }
    }
    @FXML
    void deleteMeter(ActionEvent event){
        if (pwField2.getText().equals(Control.inst().getApartmentList().get(0).getUserList().get(0).getPassWord())){
            Control.inst().getApartmentList().get(0).getUserList().remove(Integer.parseInt(meterField2.getText())-1);
            pwField2.setText("");
            meterField2.setText("");
        }
    }
}
