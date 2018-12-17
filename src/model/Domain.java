package model;



import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Domain {

    public ArrayList<Apartment> apartmentList = new ArrayList<>();


    public void addApartment(Apartment apartment) {
        apartmentList.add(apartment);
    }

    public ArrayList<Apartment> getApartmentList() {
        return apartmentList;
    }

    public void setApartmentList(ArrayList<Apartment> apartmentList) {
        this.apartmentList = apartmentList;
    }



    @Override
    public String toString() {
        return "Domain{" + "apartmentList=" + apartmentList + '}';
    }
}

