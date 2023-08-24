package utilities;

import entities.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class UtilityUserTest {
    ArrayList<User> userList;

    @BeforeEach
    void setUp() {
        userList = new ArrayList<>();

        userList.add(new User("felipe",19,1001445250));
        userList.add(new User("yely",50,39444336));
        userList.add(new User("julio",48,115437946));
    }

    @Test
    public void organizeUserListAtoZByNameTest () {
        Collections.sort(userList, Comparator.comparing(User::getName));
        assertEquals("yely",userList.get(2).getName());
    }
}