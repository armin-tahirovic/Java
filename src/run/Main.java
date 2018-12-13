package run;

import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String args[]) {

        User user1 = new User(111,"sep1",true);
        User user2 = new User(222,"NICO",false);
        User user3 = new User(333,"armin",false);
        User user4 = new User(444,"OsCar",true);

        Domain apartment = new Domain();
        apartment.addApartment();
        apartment.getApartmentList().get(0).setMeterList(apartment.apartmentList.get(0).getMeterList());
        apartment.apartmentList.get(0).addAddress("Horsens");
        System.out.println(apartment.apartmentList.get(0).getAddressList().get(0));



        LocalDate today = LocalDate.now();
        apartment.apartmentList.get(0).addMeter("heat", 10);
        apartment.apartmentList.get(0).getMeterList().get(0).addReading(10, "heat", today);


        String otut = apartment.apartmentList.get(0).getMeterList().get(0).generateOutput();
        System.out.println(otut);

        apartment.apartmentList.get(0).getMeterList().get(0).setNr(19);
        apartment.apartmentList.get(0).getMeterList().get(0).setMeasureType("Oscar");
        System.out.println(apartment.apartmentList.get(0).getMeterList().get(0).generateOutput());

        Apartment list = new Apartment();
        list.addUser(user1);
        list.addUser(user2);
        list.addUser(user3);
        list.addUser(user4);

        apartment.apartmentList.get(0).getMeterList().get(0).addReading(15, "Armin", today);

        Consumption consumption = new Consumption();
        System.out.println(consumption.calculateAllConsumption(0, apartment));

        System.out.println(apartment.apartmentList.get(0).getMeterList().get(0).generateLastOutput());


        System.out.println(list);
    }

}