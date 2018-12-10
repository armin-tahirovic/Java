package sample;
public class Main {


    public static void main(String args[]) {

        User user1 = new User(111,"sep1",true);
        User user2 = new User(222,"NICO",false);
        User user3 = new User(333,"armin",false);
        User user4 = new User(444,"OsCar",true);

        UserList list = new UserList();

        list.addUser(user1);
        list.addUser(user2);
        list.addUser(user3);
        list.addUser(user4);

        System.out.println(list);
    }

}