/*
package model;

import java.time.LocalDate;

public class Consumption {
    private int consumption;
    private Reading lastReading;

    public Consumption() {
        this.consumption = consumption;
    }

    public int calculateAllConsumption(int apartmentNumber, Domain apartment) {

        for (int x = 0; x < apartment.apartmentList.get(apartmentNumber).getMeterList().size(); x++) {
            consumption = consumption + apartment.apartmentList.get(apartmentNumber).getMeterList().get(x).allValues();
        }
        return consumption;
    }


    public Reading lastReading(int apartmentNumber, Domain apartment){
        lastReading = (Reading) apartment.apartmentList.get(apartmentNumber).getMeterList().get(0).getReadings().get(0);
        return lastReading;
    }

    public int calculateDayConsumption(int apartmentNumber, Domain apartment, LocalDate date) {

        consumption=0;
        for (int x = 0; x < apartment.apartmentList.get(apartmentNumber).getMeterList().size(); x++) {
            int y=0;
            for (y = 0; y < apartment.apartmentList.get(apartmentNumber).getMeterList().get(x).getReadings().size(); y++);{

                LocalDate a = (LocalDate) apartment.apartmentList.get(apartmentNumber).getMeterList().get(x).getDate(y);
                if (a.equals(date)){
                    consumption = consumption + apartment.apartmentList.get(apartmentNumber).getMeterList().get(x).getValue(y);
                }
            }
        }
        return consumption;
    }

}
*/
