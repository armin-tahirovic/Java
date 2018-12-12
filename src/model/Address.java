package model;

import java.util.ArrayList;

public class Address {

    private String address;
    public ArrayList<String> addressList = new ArrayList<>();

    public Address(String address) {
        this.address = address;
    }

    public void addAddress(String address) {
        addressList.add(address);
    }
}
