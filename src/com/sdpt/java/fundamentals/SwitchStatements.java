package com.sdpt.java.fundamentals;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        String monthName = "";
        int day = 0;
        int year = 0;
        boolean validMonth = true;
        boolean validDay = true;

        System.out.print("Enter your birth month (mm): ");
        int month = userInput.nextInt();
        switch (month){
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "Febuary ";
                break;
            case 3:
                monthName = "March ";
                break;
            case 4:
                monthName = "April ";
                break;
            case 5:
                monthName = "May ";
                break;
            case 6:
                monthName = "June ";
                break;
            case 7:
                monthName = "July ";
                break;
            case 8:
                monthName = "August ";
                break;
            case 9:
                monthName = "September ";
                break;
            case 10:
                monthName = "October ";
                break;
            case 11:
                monthName = "November ";
                break;
            case 12:
                monthName = "December ";
                break;
            default:
                System.out.println("Invalid Month ");
                validMonth = false;
        }
        if (validMonth) {
            System.out.print("Enter birth day (dd)      : ");
            day = userInput.nextInt();
            if (((month == 1|| month == 3|| month == 5|| month == 7||month == 8||month == 10||month == 12) && (day>31))
                    || (month == 2|| month == 4|| month == 6|| month == 9||month == 11) && (day>30)) {
                System.out.println("Invalid Day");
                validDay = false;
            }
        }
        if (validMonth && validDay){
            System.out.print("Enter birth year (yyyy)      : ");
            year = userInput.nextInt();
            System.out.println("Your birth date is : " + monthName + " " + day + ", " + year);
        }

    }

}


