package service;

import entities.Fly;
import Enum.TypeAirPlane;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class ServiceFly {

    private final Scanner num = new Scanner(System.in);
    private final Scanner read = new Scanner(System.in);
    private Random random = new Random();


    HashMap<String, Fly> flyList = new HashMap<>();

    public void before () {
        flyList.put("AAD512", new Fly("AAD512",23456,true,LocalDate.of(2023,10,28),LocalTime.of(2,35),TypeAirPlane.AIRBUSA320.getAirPlane()));
        flyList.put("ZZU098", new Fly("ZZU098",15432,true,LocalDate.of(2023,6,10),LocalTime.of(3,50), TypeAirPlane.BOEING737.getAirPlane()));
        flyList.put("JFG432", new Fly("JFG432",87644,true,LocalDate.of(2023,4,8),LocalTime.of(6,54), TypeAirPlane.AIRBUSA320.getAirPlane()));
    }
    public void createFly () {

        LocalDate date;
        LocalTime duration;

        System.out.println();
        System.out.println("write code of the fly EXAMPLE (AAA512) ");
        System.out.println("==================");
        String code = read.nextLine();
        int min = 10000;
        int max = 99999;
        int id = random.nextInt(max - min + 1);
        boolean ava = true;
        System.out.println("||||||| Date of the fly |||||||");
        System.out.println("write date of the fly in this order (year-month-day)");
        System.out.println("                                      (0000-00-00)");
        date = LocalDate.parse(read.nextLine());
        System.out.println("write duration of the fly in this order (hours:minutes)");
        System.out.println("                                           (00:00)");
        duration = LocalTime.parse(read.nextLine());
        System.out.println("||||||| Type Airplane |||||||");
        System.out.println("1. Airbus-a320");
        System.out.println("=================");
        System.out.println("2. Boeing-737");
        System.out.println("=================");
        System.out.println("3. Boeing-747");
        System.out.println("=================");
        int opt = num.nextInt();
        if (opt == 1) {
            flyList.put(code,new Fly(code,id,ava,date,duration, TypeAirPlane.AIRBUSA320.getAirPlane()));
        } else if (opt == 2) {
            flyList.put(code,new Fly(code,id,ava,date,duration, TypeAirPlane.BOEING737.getAirPlane()));
        } else if (opt == 3 ){
            flyList.put(code,new Fly(code,id,ava,date,duration,TypeAirPlane.BOEING747.getAirPlane()));
        } else {
            System.out.println("you choose a wrong answer, manually your Airplane is a Boeing-737");
            flyList.put(code,new Fly(code,id,ava,date,duration, TypeAirPlane.BOEING737.getAirPlane()));
        }
        System.out.println("YOU ADD A NEW FLY");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||");
    }

    public void showFly () {
        for ( Map.Entry<String,Fly> entry : flyList.entrySet()) {
            System.out.println();
            System.out.println("code fly" + entry.getKey() + "fly: " + entry.getValue());
        }

    }

    public void reserveFly () {

        boolean ss = true;

        showFly();

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println();
        System.out.println("write the code of the fly u want to reserve");
        String code = read.nextLine();

        for ( Map.Entry<String,Fly> entry : flyList.entrySet()) {

            if (entry.getKey().equals(code) ) {
                if (entry.getValue().isAvailable()) {
                    System.out.println("YOU HAE RESERVED " + entry.getKey() + " FLY");
                    entry.getValue().setAvailable(false);
                    ss = false;
                } else {
                    System.out.println("THAT FLY IS NO AVAILABLE");
                }
                break;
            }
        }
        if (ss) {
            System.out.println(" THE CODE YOU WROTE IS NOT ON THE FLY LIST");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||");
        }
    }

    public void deleteFly () {

        boolean ss = true;

        showFly();

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println();
        System.out.println("write the code of the fly u want to delete");
        String code = read.nextLine();

        for ( Map.Entry<String, Fly> entry : flyList.entrySet() ) {

            if (entry.getKey().equals(code)) {
                flyList.remove(entry.getKey());
                System.out.println("you remove fly: " + entry.getKey());
                ss = false;
                break;
            }
        }
        if (ss) {
            System.out.println(" THE CODE YOU WROTE IS NOT ON THE FLY LIST");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
        }
    }

}
