package com.sdpt.java.fundamentals;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main (String[] args){
        int index = 0;
        double[] gradesArray = new double[4];
        Scanner userInput = new Scanner(System.in);

        System.out.print("Grades for English  : ");
        gradesArray [index] = userInput.nextDouble();
        index++;

        System.out.print("Grades for Math     : ");
        gradesArray [index] = userInput.nextDouble();
        index++;

        System.out.print("Grades for Science  : ");
        gradesArray [index] = userInput.nextDouble();
        index++;

        System.out.print("Grades for Computer : ");
        gradesArray [index] = userInput.nextDouble();
        index++;

        double average = ((gradesArray[0] + gradesArray[1] + gradesArray[2] + gradesArray[3])/4);
        System.out.println("Average             : " + average);

        if (average>100)
            System.out.println("Invalid Grade!");
        else if (average>=98)
            System.out.println("W/ Latin honors");
        else if (average>=95)
            System.out.println("W/ High Honors");
        else if (average>=90)
            System.out.println("W/ Honors");
        else if (average>=75)
            System.out.println("Passed");
        else
            System.out.println("Failed");
    }
}
