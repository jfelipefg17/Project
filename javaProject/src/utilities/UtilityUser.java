package utilities;

import entities.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UtilityUser {

    public ArrayList name (ArrayList userList) {
        Collections.sort(userList, Comparator.comparing(User::getName));
        return userList;
    }

    public ArrayList id (ArrayList userList) {
        Collections.sort(userList, Comparator.comparing(User::getAge));
        return userList;
    }

    // TODO organice user list for a-z
    // TODO organice user list by age
}
