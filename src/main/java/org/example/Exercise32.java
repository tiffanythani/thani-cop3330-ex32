package org.example;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tiffany Thani
 */
public class Exercise32 {

    public static void main(String[] args) {
        //prompt the user for input
        System.out.println("Let's play Guess the Number! " );
        int mysteryNumber;
        mysteryNumber = (int) (Math.random() * 999 + 1);
        Scanner scan = new Scanner(System.in);
        int guess, total = 0, level;

        while (true) {

            total = 0;
            //prompt the user for output
            System.out.print("Enter the difficulty level(1, 2, or  3): ");
            level = scan.nextInt();//read the data
            //check for difficulty level
            if (level == 1)
                mysteryNumber = (int) (Math.random() * 10 + 1);
            else if (level == 2)
                mysteryNumber = (int) (Math.random() * 100 + 1);
            else
                mysteryNumber = (int) (Math.random() * 1000 + 1);
            //prompt the user for input
            System.out.print("I have my number. What's your guess?: ");
            do {
                guess = scan.nextInt(); //read the data
                total++; //count the guess
                if (guess == mysteryNumber) {//prompt the user for output
                    System.out.println("You got it in " + total + "  guesses!");
                } else if (guess < mysteryNumber)//prompt the user for output
                    System.out.println("Too low. Guess again: ");
                else if (guess > mysteryNumber)//prompt the user for output
                    System.out.println("Too high. Guess again: ");

            } while (guess != mysteryNumber);
            //prompt the user for input
            System.out.print("\nDo you wish to play again (Y/N)?  ");
            char s = scan.next().charAt(0);
            if (s == 'N' || s == 'n')
                break;
        }

    }
}

