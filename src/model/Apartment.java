package model;

import java.util.ArrayList;
import java.util.List;

public class Apartment {
    private ArrayList<Meter> meterList;
    private ArrayList<String> addressList;
    private ArrayList<User> userList;



    public Apartment() {
        this.meterList = new ArrayList<>();
        this.addressList = new ArrayList<>();
        this.userList = new ArrayList<>();
    }

    public ArrayList<Meter> getMeterList() {
        return meterList;
    }

    public void setMeterList(ArrayList<Meter> meterList) {
        this.meterList = meterList;
    }

    public void addMeter(String measureType, int nr){
        Meter meter=new Meter(measureType, nr);
        meterList.add(meter);
    }

    public ArrayList<String> getAddressList() {
        return addressList;
    }

    public void setAddresses(ArrayList<String> addresses) {
        this.addressList = addresses;
    }

    public void addAddress(String address) {
        addressList.add(address);
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public void addUser(User user){
        userList.add(user);
    }

    public String toString() {
        return
                userList + "\n";
    }
}
