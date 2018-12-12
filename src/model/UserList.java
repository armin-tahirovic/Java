package model;

import java.util.ArrayList;
import java.util.List;

public class UserList {

    List<User> userList = new ArrayList<>();

    public void addUser(User user){
        userList.add(user);
    }

    public String toString() {
        return
                userList + "\n";
    }
}
