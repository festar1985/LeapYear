package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        // i will based my logic on https://en.wikipedia.org/wiki/Gregorian_calendar
        // allowing an input for the year

        Scanner object = new Scanner(System.in);
        System.out.println("Enter the year:");

        int year = object.nextInt(); // assigning the inputed value to "year"

        if (year % 4 !=0 ) // all years not dividable to 4 are non leap years
        {
            System.out.println("This is a non leap year");
        }
        else if (year% 400 == 0) // all years dividable to 400 in the Gregorian calendar are leap years
        {
            System.out.println("This is a leap year");
        }
        else if (year% 100 == 0) // all years dividable to 100 and not 400 in the Gregorian calendar are non leap years
        {
            System.out.println("This is a non leap year");
        }
        else // all the rest will be a leap year
        {
            System.out.println("This is a leap year");
        }
    }
}
