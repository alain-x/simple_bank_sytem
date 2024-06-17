package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner n =new Scanner(System.in);
        System.out.println("\n enter your number of ID \n" );
         int id = n.nextInt();

        System.out.println("\n enter amount  " );
        float amount = n.nextFloat();

        System.out.println("\n Enter 1. to withdraw  " );
        System.out.println("\n Enter 2. to Charge Account " );
        int money = n.nextInt();


        switch (money){
            case 1:
                System.out.println("\n enter amount your withdraw  " );
                float wi = n.nextFloat();
               float result = amount - wi;
               if (amount >wi){
                   System.out.println("\n You withdraw:  "+wi );
                   System.out.println("\n New Balance is:  "+result );
               }
               else {
                   System.out.println("\n your Balance is not enough  " );
               }
               break;
            case 2:
                System.out.println("\n enter amount your charge " );
                float wit = n.nextFloat();
                float total= amount + wit;
                if (amount>0&& wit>0){
                    System.out.println("\n You charge this amount:  "+wit );
                    System.out.println("\n New Balance is:  "+total );
                }
                else {
                    System.out.println("\n invalid!! " );
                }
                break;
            default:
                System.out.println("Try again!!");

        }



   
         }
    }
