package model;

import java.util.ArrayList;
import java.util.List;

public class Apartment {
    private ArrayList<Meter> meterList;
    private ArrayList<String> addresses;
    private List<User> userList;
    private ArrayList<Apartment> apartmentList = new ArrayList<>();


    public Apartment(ArrayList<Meter> meterList, ArrayList<String> addresses, List<User> userList) {
        this.meterList = meterList;
        this.addresses = addresses;
        this.userList = userList;
    }

    public void addApartment(ArrayList<Meter> meterList, ArrayList<String> addresses, List<User> userList) {
        Apartment apartment = new Apartment(meterList,addresses,userList);
        apartmentList.add(apartment);
    }

    public ArrayList<Apartment> getApartmentList() {
        return apartmentList;
    }

    public void setApartmentList(ArrayList<Apartment> apartmentList) {
        this.apartmentList = apartmentList;
    }

    public ArrayList<Meter> getMeterList() {
        return meterList;
    }

    public void setMeterList(ArrayList<Meter> meterList) {
        this.meterList = meterList;
    }

    public ArrayList<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<String> addresses) {
        this.addresses = addresses;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
