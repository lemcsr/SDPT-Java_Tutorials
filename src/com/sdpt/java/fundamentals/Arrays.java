package com.sdpt.java.fundamentals;

import java.util.Scanner;

public class Arrays {
    public static void main (String[] args){
        String userEmail []  = {"lemuel@csr.com","rolandoiii@csr.com", "francis@csr.com",
                                "shawn@wanap.com","carl@wanap.com"};

        String userName [] = {  "lem","doiii", "kiko", "shawnbenzbarrios","carlstillio"};

        String userPassword []= {"1123415", "1241525123", "12453135adwf!1$",
                                 "-92091792845*(!@#", "kjoiuadjfl@$!%)(#!@#*" };

        Scanner getUserRequest = new Scanner(System.in);
        System.out.print("What's your index number: ");

        int indexRequestNum = getUserRequest.nextInt();

        System.out.println("Email    : " +userEmail[indexRequestNum]);
        System.out.println("User Name: " +userName[indexRequestNum]);
        System.out.println("Password : " +userPassword[indexRequestNum]);


    }
}
