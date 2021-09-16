package com.company;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        menu();
    }
    public static void menu(){
    Scanner console = new Scanner(System.in);


        System.out.println();
        System.out.println("-------------VELKOMMEN TIL ENIGMA-------------");
        System.out.println("Tast  \"e\" for encode, eller tast \"d\" for decode ");
        String answer = console.next();

        switch(answer) {
            case "e":
                encode();
                System.out.println("encode");
                break;
            case "d":
                decode();
                System.out.println("+decode+");
                break;
            default:
                System.out.println("Sorry we did not understand your request try with \"e\" or \"d\"");
                menu();
        }

    }
    public static void encode(){
        String[] bogstaver = {" ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"
                , "r", "s", "t", "u", "v", "x", "w", "y", "z", "æ", "ø", "å"};

        int[] tal = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        System.out.println();
        System.out.println("Du har valgt encode, indtast din tekst:");
        Scanner kryp = new Scanner(System.in);
        String text = kryp.next();
        
        

    }

    public static void decode(){
        System.out.println();
        System.out.println("du har valgt decode, indtast dine tal.");
        Scanner dekryp = new Scanner(System.in);
        int tal = dekryp.nextInt();
        int list[] = new int[100];
        





        //ArrayList<Integer> listTal = new ArrayList<Integer>();
        //listTal.add(tal);
        //System.out.println("dette er dine indtastede tal: "+ listTal);


        //System.out.println(Arrays.toString(array));

        // single-dimensional Integer array
        //Integer[] arr = { 1, 2, 3, 4, 5 };

        // print string representation of the array
        //System.out.println(Arrays.toString(arr));
    }
}
