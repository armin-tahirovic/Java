package model;

import java.time.LocalDate;
import java.util.ArrayList;


public class Meter {
    private ArrayList<Reading> readings=new ArrayList();
    private ArrayList<Meter> meterList=new ArrayList();
    private String measureType;
    private int nr;

    public Meter(ArrayList<Reading> readings, String measureType, int nr){
        this.readings=readings;
        this.measureType=measureType;
        this.nr=nr;
    }

    public int allValues(){
        int x;
        int allValues=0;
        for (x=0; x<readings.size(); x++){
            allValues=allValues+readings.get(x).getValue();
        }
        return allValues;
    }


    public ArrayList getReadings() {
        return readings;
    }

    public void setReadings(ArrayList readings) {
        this.readings = readings;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }

    public void setMeasureType(String measureType) {
        this.measureType = measureType;
    }

    public String getMeasureType() {
        return measureType;
    }

    public void addReading(int value, String type, LocalDate date){
        Reading reading = new Reading(value, type, date);
        readings.add(reading);
    }

    public void addMeter(ArrayList<Reading> readings, String measureType, int nr){
        Meter meter=new Meter(readings, measureType, nr);
        meterList.add(meter);
    }

    public ArrayList<Meter> getMeterList() {
        return meterList;
    }

    public String generateOutput(){

        StringBuilder allOutput=new StringBuilder();

        for (Reading reading: readings) {
            String output;
            int value = reading.getValue();
            String type = reading.getType();
            LocalDate date = reading.getDate();
            String measureType = this.measureType;
            int number = this.nr;
            output = date + ", " + value + ", " + type + ", " + measureType + ", " + number + "\r\n";
            allOutput.append(output);

        }
        return allOutput.toString();
    }

}
