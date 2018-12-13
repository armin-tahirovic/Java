package model;

import java.time.LocalDate;
import java.util.ArrayList;


public class Meter {
    private ArrayList<Reading> readings = new ArrayList();
    private String measureType;
    private int nr;

    public Meter(String measureType, int nr){
        this.readings = new ArrayList<>();
        this.measureType = measureType;
        this.nr = nr;
    }

    public int allValues(){
        int x;
        int allValues = 0;
        for (x = 0; x < readings.size(); x++){
            allValues = allValues+readings.get(x).getValue();
        }
        return allValues;
    }


    public ArrayList getReadings() {
        return readings;
    }

    public void setReadings(ArrayList readings) {
        this.readings = readings;
    }

    public void addReading(int value, String type, LocalDate date){
        Reading reading = new Reading(value, type, date);
        readings.add(reading);
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getMeasureType() {
        return measureType;
    }

    public void setMeasureType(String measureType) {
        this.measureType = measureType;
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

    public String generateLastOutput(){

        StringBuilder allOutput = new StringBuilder();

            String output;
            int value = readings.get(readings.size()-1).getValue();
            String type = readings.get(readings.size()-1).getType();
            LocalDate date = readings.get(readings.size()-1).getDate();
            String measureType = this.measureType;
            int number = this.nr;
            output = date + ", " + value + ", " + type + ", " + measureType + ", " + number + "\r\n";
            allOutput.append(output);

        return allOutput.toString();
    }
}
