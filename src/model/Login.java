package model;

public class Login {


    public boolean checkSuperUser(int apartmentNumber, Domain apartment, int userNumber) {

        if (apartment.apartmentList.get(apartmentNumber).getUserList().get(userNumber).isSuperUser()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkUserPw(int apartmentNumber, Domain apartment, int userNumber, String userPw) {

        if (apartment.apartmentList.get(apartmentNumber).getUserList().get(userNumber).getPassWord() == userPw) {
            return true;
        } else {
            return false;
        }
    }
}
