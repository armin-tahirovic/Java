package view;

import control.Control;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.time.LocalDate;
public class HomePage {

    @FXML
    private Label currentUserLabel;

    @FXML
    private Label currentAptLabel;

    @FXML
    private Label currentAddressLabel;

    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private DatePicker fromDP;
    @FXML
    private DatePicker toDP;
    @FXML
    private TextArea consumptionArea;
    @FXML
    private TextField aptNrField;
    @FXML
    private TextArea aptNrList;
    @FXML
    void initialize(){
        currentUserLabel.setText("User: " + Control.inst().getApartmentList().get(0).getUserList().get(0).getNumber());
        currentAddressLabel.setText("" + Control.inst().getApartmentList().get(0).getUserList().get(0).getAddress());
        aptNrList.setText("" + Control.inst().getApartmentList().get(0).getUserList().toString());
    }

    @FXML
    void showConsumption (ActionEvent event){

        consumptionArea.setText("");
        LocalDate date = fromDP.getValue();
        // Alt consumption som virker
        consumptionArea.setText("" + Control.inst().getApartmentList().get(0).getUserList().get(Integer.parseInt(aptNrField.getText())-1).getMeter().getReadings().toString());

        // Et for-loop der burde lave en ny liste baseret på den dato man vælger
        /*ArrayList<Reading> newList = new ArrayList<>();
        for(Reading reading: Control.inst().getApartmentList().get(0).getUserList().get(Integer.parseInt(aptNrField.getText())-1).getMeter().getReadings()){
            if (date == reading.getDate()){
                newList.add(reading);
            }
        }
        consumptionArea.setText("" + newList.toString());*/
    }

    @FXML
    void updateUserList(ActionEvent event){
        aptNrList.setText("");
        aptNrList.setText("" + Control.inst().getApartmentList().get(0).getUserList().toString());
    }
}
