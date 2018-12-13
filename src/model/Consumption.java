package model;

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
/*
    public int calculateDayConsumption(int apartmentNumber, Domain apartment) {

        for (int x = 0; x < apartment.apartmentList.get(apartmentNumber).getMeterList().size(); x++) {

            consumption = consumption + apartment.apartmentList.get(apartmentNumber).getMeterList().get(x).reas().get(0).;
        }
        return consumption;
    }
*/
}
