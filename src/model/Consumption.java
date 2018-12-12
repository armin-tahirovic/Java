package model;

import java.util.ArrayList;

public class Consumption {
    private int consumption;

    public Consumption(int consumption) {
        this.consumption = consumption;
    }

    public int calculateAllConsumption() {
        int x;
        int z;

        Apartment apartment = new Apartment(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        apartment.getMeterList().size();
        System.out.println();

        for (z = 0; z < apartment.getApartmentList().size(); z++) {
            for (x = 0; x < apartment.getApartmentList().get(z).getMeterList().size(); x++) {
                consumption = consumption + apartment.getMeterList().get(x).allValues();
            }
        }
        return consumption;
    }


    public int lastMeasure(){
        return consumption;
    }


}
