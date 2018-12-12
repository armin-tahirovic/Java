package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reading {
    private int value;
    private String type;
    private LocalDate date;

    public Reading(int value, String type, LocalDate date){
        this.value=value;
        this.type=type;
        this.date=date;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public LocalDate getDate() {
        return date;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

}
