package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christian Williams
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        final double conversion = 350;

        System.out.println("What is the size of the room in square feet? ");
        double roomSize = input.nextInt();

        double gallons = Math.ceil(roomSize / conversion);
        System.out.println("You will need to buy " + gallons + " gallon(s) of paint to cover " + roomSize + " square feet.");
    }
}
