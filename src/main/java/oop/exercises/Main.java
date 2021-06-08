package oop.exercises;
import java.util.Scanner;
/*
 * UCF cop3330 Summer 2021 Assignment 1 solutions
 * Copyright 2021 Keondez Robinson
 */
public class Main
{
    public static void main(String[] args)
    {
        double euros, rate, usDollars;
        Scanner input;

        input = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        euros = input.nextDouble();
        System.out.print("What is the exchange rate? ");
        rate = input.nextDouble();

        usDollars = (euros * rate);
        System.out.println(euros + " euros at an exchange rate of " + rate + " is " + Math.round(usDollars) + " U.S. Dollars.");


    }
}
