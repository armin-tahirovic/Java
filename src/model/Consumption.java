package model;

import control.Control;

import java.time.LocalDate;

public class Consumption {
    private int consumption;
    private Reading lastReading;

    public Consumption() {
        this.consumption = consumption;
    }

    public int calculateAllConsumption(int apartmentNumber, Control apartment) {

        for (int x = 0; x < apartment.apartmentList.get(apartmentNumber).getUserList().size(); x++) {
            consumption = consumption + apartment.apartmentList.get(apartmentNumber).getUserList().get(x).getMeter().getMeterValues();
        }
        return consumption;
    }


    /*public Reading lastReading(int apartmentNumber, Domain apartment){
        lastReading = (Reading) apartment.apartmentList.get(apartmentNumber).getUserList().get(0).getReadings().get(0);
        return lastReading;
    }*/

    public int calculateDayConsumption(int apartmentNumber, Domain apartment, LocalDate date) {

        consumption = 0;
        for (int x = 0; x < apartment.apartmentList.get(apartmentNumber).getUserList().size(); x++) {
            int y = 0;
            for (y = 0; y < apartment.apartmentList.get(apartmentNumber).getUserList().get(x).getMeter().getReadings().size(); y++);{

                LocalDate a = (LocalDate) apartment.apartmentList.get(apartmentNumber).getUserList().get(x).getMeter().getdate(y);
                if (a.equals(date)){
                    consumption = consumption + apartment.apartmentList.get(apartmentNumber).getUserList().get(x).getMeter().getReadings().get(y).getValue();
                }
            }
        }
        return consumption;
    }

}

