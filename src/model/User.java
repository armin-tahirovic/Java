package model;

public class User {
    private int number;
    private String passWord;
    private boolean superUser;
    private Address address;
    private Meter meter;
    private String aptNr;

    public User(int number, String passWord, boolean superUser, Address address,String aptNr, Meter meter) {
        this.number = number;
        this.passWord = passWord;
        this.superUser = superUser;
        this.address = address;
        this.meter = meter;
        this.aptNr = aptNr;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public boolean isSuperUser() {
        return superUser;
    }

    public void setSuperUser(boolean superUser) {
        this.superUser = superUser;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Meter getMeter() {
        return meter;
    }

    public void setMeter(Meter meter) {
        this.meter = meter;
    }

    public String getAptNr() {
        return aptNr;
    }

    public void setAptNr(String aptNr) {
        this.aptNr = aptNr;
    }

    @Override
    public String toString() {
        return "User " +  number + ", " + aptNr + ", Meter: " + meter +"\n";
    }
}



