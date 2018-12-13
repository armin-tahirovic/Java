package model;

public class User {
    private int number;
    private String pw;
    private boolean superUser;

    public User (int number,String pw, boolean superUser){
        this.number = number;
        this.pw = pw;
        this.superUser = superUser;
    }

    public int getNumber() {
        return number;
    }

    public String getPw() {
        return pw;
    }

    public boolean isSuperUser() {
        return superUser;
    }

    public String toString() {
        return
                "model.User:"+ "\n" + "Name = " + number + "\n" + "Password = " + pw + "\n" + "Super model.User = " + superUser + "\n";
    }

}
