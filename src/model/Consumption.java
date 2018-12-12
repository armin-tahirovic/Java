package model;

import java.util.ArrayList;

public class Consumption {
    private int consumption;

    public Consumption(int consumption) {
        this.consumption = consumption;
    }

    public int calculateAllConsumption(int apartmentNumber) {
        int x;

        Domain list = new Domain();

            for (x = 0; x < list.apartmentList.get(apartmentNumber).getMeterList().size(); x++) {
                consumption = consumption + list.apartmentList.get(apartmentNumber).getMeterList().get(x).allValues();
            }
        return consumption;
    }


    public int lastMeasure(){
        return consumption;
    }


}
