
package control;


import model.Apartment;
import model.Domain;
import model.User;
import run.UI;

import java.util.ArrayList;

public class Control {
    private Domain model;
    private UI view;

    public ArrayList<Apartment> apartmentList = new ArrayList<>();

    public Control(Domain model, UI view){
        this.model = model;
        this.view = view;
        control = new Control(this.model,this.view);
    }
    Control control;


    private static Control controller = null;

    private Control(){}

    public static Control inst(){
        if(controller == null) {
            controller = new Control();
        }
        return controller;
    }

    public ArrayList<Apartment> getApartmentList() {
        return apartmentList;
    }

    public void setApartmentList(ArrayList<Apartment> apartmentList) {
        this.apartmentList = apartmentList;
    }

    public void addApartment(Apartment apartment) {
        apartmentList.add(apartment);
    }

}

