package com.example.cipher;

import java.io.CharConversionException;
import java.util.ArrayList;
import java.util.*;

public class Cipher {

    private static void ReadIn() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the String to decode:");
        String first = keyboard.nextLine();
        int length = first.length();
        char temp;
        ArrayList<Character> straight = new ArrayList<Character>(length);
        for (int i = 0; i < length; i++) {
            temp = (first.charAt(i));
            straight.add(temp);
            System.out.print((char)(temp + 1));


        }
        System.out.println();
    }

    private static void encode(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter/Paste the text you would like to encode");
        String newString = keyboard.nextLine();
        int length = newString.length();
        char temp;
        ArrayList<Character> straight = new ArrayList<Character>(length);
        for (int i = 0; i < length; i++) {
            temp = (newString.charAt(i));
            straight.add(temp);
            System.out.print((char)(temp - 1));


        }
    }
    public static void main(String[] args) {
        System.out.println("test 9/26");
        char  primaryCommand = 'r';
        while(primaryCommand == 'r' || primaryCommand == 'e' ) {
            System.out.println();
            System.out.println("Type 'r' to read in a code or 'e' to encode a message");
            System.out.println("Or type 'x' to exit the program");
            Scanner keyboard = new Scanner(System.in);
            primaryCommand = keyboard.next().charAt(0);

            if (primaryCommand == 'r') {

                ReadIn();
            } else if (primaryCommand == 'e') {
                encode();
            } else {
                System.exit(0);
            }

        }
    }
}


