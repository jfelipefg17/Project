import service.ServiceFly;
import service.ServiceUser;
import java.util.Scanner;

/**
 * code a program that let u CRUD list of available fly , u have to be registered in the page for reserve a fly ,
 * when you are going to reserve a fly u have tu put the user
 * when someone reserve a fly, there  id gonna be a list that shows user an fly that have reserve
 * i have to show thw two list in different order (age, id, a-z)
 * */

//  TODO search how to comment every thing good

// TODO !!!!!!  also add testing folder and some unitary test and enum !!!!@!

// TODO change that when i send x date if it is wrong stop the program , change to resend the message telling you first to change the information that is wrong
public class Main {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        ServiceUser user = new ServiceUser();
        ServiceFly fly = new ServiceFly();

        boolean ss = true;
        boolean ss2 = true;
        int opt;
        int opt2;

        // add users to the list
        user.before();

        do {

            System.out.println("=================");
            System.out.println("1.  sing up user");
            System.out.println("=================");
            System.out.println("2.  organize user list");
            System.out.println("=================");
            System.out.println("3. see list of users");
            System.out.println("=================");
            System.out.println("4. exit");
            System.out.println("=================");
            opt = num.nextInt();

            switch (opt) {
                case 1:
                    user.singUpUser();
                    break;
                case 2:
                    user.organizeUser();
                    break;
                case 3:
                    user.print();
                    break;
                case 4:
                    ss = false;
                    break;
                default:
                    System.out.println("wrong answer");
                    System.out.println("==================");
            }
        }while (ss);

        //add fly to the HasMap
        fly.before();

        do {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("WELCOME TO THE MENU");

            System.out.println("1. create a fly");
            System.out.println("=================");
            System.out.println("2. see list of fly");
            System.out.println("=================");
            System.out.println("3. reserve fly");
            System.out.println("=================");
            System.out.println("4. delete a fly");
            System.out.println("=================");
            System.out.println("5. organize fly list");
            System.out.println("=================");
            System.out.println("6. exit");
            opt2 = num.nextInt();

            switch (opt2) {
                case 1:
                    fly.createFly();
                    break;
                case 2:
                    fly.showFly();
                    break;
                case 3:
                    fly.reserveFly();
                    break;
                case 4:
                    fly.deleteFly();
                    break;
                case 5:
                    fly.deleteFly();
                    break;
                case 6:
                    ss2 = false;
                    break;
                default:
                    System.out.println("wrong answer");
                    System.out.println("==================");
            }
        }while (ss2);
    }
}