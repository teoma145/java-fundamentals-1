package org.fundamentals;

import java.util.Scanner;

public class calcolaBiglietto {
    public static void main(String[] args){
        double prezzoBiglietto= 0.21;
        int km;
        int age;
        Scanner keyboardReader = new Scanner(System.in);
        System.out.print("How many Km? ");
         km = keyboardReader.nextInt();
        System.out.print("How old are you? ");
        age = keyboardReader.nextInt();
        if (age < 18){
            double ticketPrice= prezzoBiglietto * km;
            double discount = ticketPrice - (ticketPrice*20/100);
            System.out.println("your ticket price is "+ discount);
        } else if ( age > 65) {
            double ticketPrice= prezzoBiglietto * km;
            double discount = ticketPrice - (ticketPrice*40/100);
            System.out.println("your ticket price is "+ discount);
        }
        else {
            double ticketPrice= prezzoBiglietto * km;
            System.out.println("your ticket price is "+ ticketPrice);
        }
    }
}
