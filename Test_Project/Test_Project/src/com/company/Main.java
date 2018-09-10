package com.company;

import java.util.Scanner;

import java.util.Random;

public class Main {

    static Random rand = new Random();
    static int[] price = new int[10];


    public static void main(String[] args) {

        fibonacci();

        for (int i = 0; i < price.length; i++) {
            price[i] = rand.nextInt(10);
                System.out.println(price[i]);

        }

        System.out.println("***********************");
        int sum = 0;
        for (int i = 0; i < price.length; i++) {
            sum = sum + price[i];
        }
        double i = sum / price.length;
        System.out.println("sum = " + i);
        System.out.println(calculateFactorial(4));
        //System.out.println(phoneNumberCustomValidator());



    }

    static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void fibonacci (){
        int n0 = 1, n1 = 1, n2;
        System.out.println(n0+n1);
        for(int i = 0; i < 18; i++){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
        System.out.println();
    }

    private static Scanner scan = new Scanner(System.in);
    public static void phoneNumberCustomValidator() {
        System.out.println("Enter a valid Ukrainian mobile phone number");
        String phoneNumber = scan.next();

        if (phoneNumber.length() == 13 && phoneNumber.startsWith("+380")) {
            System.out.println(phoneNumber + " <-------------- Valid number");


        } else if (phoneNumber.length() == 10 || phoneNumber.length() == 11) {
            System.out.println(phoneNumber + " <-------------- Add please +38");
        } else System.out.println(phoneNumber + " <-------------- Invalid phone number");
    }
}

