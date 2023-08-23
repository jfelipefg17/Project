package service;

import entities.Fly;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class ServiceFly {

    private final Scanner num = new Scanner(System.in);
    private final Scanner read = new Scanner(System.in);
    private Random random = new Random();


    HashMap<String, Fly> flyList = new HashMap<>();

    public void before () {
        flyList.put("AAD512", new Fly("AAD512",23456,true,LocalDate.of(2023,10,28),LocalTime.of(2,35)));
        flyList.put("ZZU098", new Fly("ZZU098",15432,true,LocalDate.of(2023,6,10),LocalTime.of(3,50)));
        flyList.put("JFG432", new Fly("JFG432",87644,true,LocalDate.of(2023,4,8),LocalTime.of(6,5)));
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
        System.out.println("write mount of the fly (01-12) ");
        System.out.println("==================");
        int m = num.nextInt();
        System.out.println("write day of the fly (01-31 'depends of the days of the month you choose') ");
        System.out.println("==================");
        int d = num.nextInt();
        int y = LocalDate.now().getYear();
        date = LocalDate.of(y,m,d);
        System.out.println("||||| Duration of the fly |||||");
        System.out.println("write mount of the fly (0-24) ");
        System.out.println("==================");
        int h = num.nextInt();
        System.out.println("write day of the fly (0-60) ");
        System.out.println("==================");
        int mi= num.nextInt();
        duration = LocalTime.of(h,mi);
        flyList.put(code,new Fly(code,id,ava,date,duration));

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
