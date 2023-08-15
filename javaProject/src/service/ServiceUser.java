package service;

import entities.User;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceUser {

    private final Scanner num = new Scanner(System.in);
    private final Scanner read = new Scanner(System.in);


    ArrayList<User> userList = new ArrayList<>();

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
}
