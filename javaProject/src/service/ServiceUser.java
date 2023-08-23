package service;

import entities.User;
import utilities.UtilityUser;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceUser {

    private final Scanner num = new Scanner(System.in);
    private final Scanner read = new Scanner(System.in);


    ArrayList<User> userList = new ArrayList<>();
    UtilityUser utl = new UtilityUser();

    public void before () {
        userList.add(new User("felipe",19,1001445250));
        userList.add(new User("yely",50,39444336));
        userList.add(new User("julio",48,115437946));
    }
    public void singUpUser () {

        System.out.println("write your name: ");
        System.out.println("==================");
        String name = read.nextLine();
        System.out.println("write your age: ");
        System.out.println("==================");
        int age = num.nextInt();
        System.out.println("write your id: ");
        int id = num.nextInt();

        userList.add(new User(name,age,id));

    }

    public void organizeUser () {

        boolean ss = true;
        int n;

        do {
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("1. organize by name a - z");
            System.out.println("==================");
            System.out.println("2. organize by age > to < ");
            n = num.nextInt();

            if (n == 1) {
                utl.name(userList);
                ss = false;
            } else if (n == 2) {
                utl.id(userList);
                ss = false;
            } else {
                System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
                System.out.println(" WRONG ANSWER ");
                System.out.println(" try again ");
            }
        } while (ss);

    }

    public void print () {
        for ( User aux : userList ) {
            System.out.println(aux.toString());
        }
    }
}
