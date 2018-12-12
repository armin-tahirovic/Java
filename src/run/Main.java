package run;

import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String args[]) {

        List<User> userList = new ArrayList<>();
        ArrayList<Meter> meterList = new ArrayList();
        ArrayList<String> addressList = new ArrayList<>();

        User user1 = new User(111,"sep1",true);
        User user2 = new User(222,"NICO",false);
        User user3 = new User(333,"armin",false);
        User user4 = new User(444,"OsCar",true);

        Address address1 = new Address("");
        address1.addAddress("Horsens");
        System.out.println(address1.addressList.get(0));



        LocalDate today = LocalDate.now();
        Meter meter = new Meter(new ArrayList<>(), "flow", 5);
        ArrayList<Reading> readings = new ArrayList<>();
        meter.addReading(10, "heat", today);
        meter.addMeter(readings, "heat", 10);

        String otut = meter.generateOutput();
        System.out.println(otut);

        meter.setNr(19);
        meter.setMeasureType("Oscar");
        System.out.println(meter.generateOutput());

        UserList list = new UserList();
        list.addUser(user1);
        list.addUser(user2);
        list.addUser(user3);
        list.addUser(user4);



        System.out.println(list);

        Apartment apartment = new Apartment(meterList,addressList,userList);
        apartment.addApartment(meterList,addressList,userList);
        int x = 0;
        Consumption consumption = new Consumption(x);
        x = consumption.calculateAllConsumption();
        System.out.println(x);

    }

}