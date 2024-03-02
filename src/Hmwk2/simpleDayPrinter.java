package Hmwk2;

import java.util.Scanner;

public class simpleDayPrinter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the day`s number 1-7:");
        int day  = Integer.parseInt(scanner.nextLine());

        if ( day <= 0 || day > 7){
            System.out.println("Invalid input");
            return;
        }

        String[] dayOfWeek = new String[]{"Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday","Sunday"};


        switch (day){
            case 1:
                System.out.printf("The %d-st day of the week is %s",day,dayOfWeek[0]);
                break;
            case 2:
                System.out.printf("The %d-nd day of the week is %s",day,dayOfWeek[1]);
                break;
            case 3:
                System.out.printf("The %d-rd day of the week is %s",day,dayOfWeek[2]);
                break;
            case 4:
                System.out.printf("The %d-th day of the week is %s",day,dayOfWeek[3]);
                break;
            case 5:
                System.out.printf("The %d-th day of the week is %s",day,dayOfWeek[4]);
                break;
            case 6:
                System.out.printf("The %d-th day of the week is %s",day,dayOfWeek[5]);
                break;
            default:
                System.out.printf("The %d-th day of the week is %s",day,dayOfWeek[6]);
        }
    }
}
