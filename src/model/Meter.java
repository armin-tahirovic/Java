package model;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;


public class Meter {
    private ArrayList<Reading> readings;

    private int nr;
    private boolean active;


    public Meter( int nr, boolean active) {
        this.nr = nr;
        this.active = active;
    }

    public ArrayList<Reading> getReadings() {
        return readings;
    }

    public void setReadings(ArrayList<Reading> readings) {
        this.readings = readings;
    }


    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public boolean isStatus() {
        return active;
    }

    public void setStatus(boolean status) {
        this.active = status;
    }

    public String generateOutput(){

        StringBuilder allOutput=new StringBuilder();

        for (Reading reading: readings) {
            String output;
            int value = reading.getValue();
            String type = reading.getType();
            LocalDate date = reading.getDate();
            int number = this.nr;
            output = date + ", " + value + ", " + type + "\r\n";
            allOutput.append(output);

        }
        return allOutput.toString();
    }


    @Override
    public String toString() {
        return ""+ nr + ", Active: " + active ;
    }
}
