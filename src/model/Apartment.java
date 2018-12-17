package model;

import java.util.ArrayList;
import java.util.List;

public class Apartment {
    private ArrayList<User> userList;
    private int apartmentNr;

    public Apartment(int apartmentNr) {
        this.apartmentNr = apartmentNr;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public int getApartmentNr() {
        return apartmentNr;
    }

    public void setApartmentNr(int apartmentNr) {
        this.apartmentNr = apartmentNr;
    }

    @Override
    public String toString() {
        return "Apartment "+ apartmentNr +"\n" + "userList: " + "\n" + userList;
    }
}