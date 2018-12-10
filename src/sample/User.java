package sample;

public class User {
    private int number;
    private String pw;
    private boolean superUser;

    public User (int number,String pw, boolean superUser){
        this.number = number;
        this.pw = pw;
        this.superUser = superUser;
    }
    public String toString() {
        return
                "User:"+ "\n" + "Name = " + number + "\n" + "Password = " + pw + "\n" + "Super User = " + superUser + "\n";
    }

}
