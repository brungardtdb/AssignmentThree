/*************************************************
 Operation3.java
Author: David Brungardt

This program has the user guess a randomly generated
number. If the user guesses lower, the program will tell
them that their guess was too low, if the guess is too
high, the user will be prompted to guess a lower number.
*******************************************************/
import java.util.Random;
import java.util.Scanner;

public class Operation3
{
  public static void main(String[] args)
  {
    // declare and initialize variables
    int randNumber;
    int userGuess = 0;
    int counter = 1;

    // new instance of Random class
    Random randInt = new Random();

    // new instance of Scanner class
    Scanner scnr = new Scanner(System.in);

    // choose random number between 1 and 100 for user to  guess.
    randNumber = randInt.nextInt(100) + 1;

    // introduce game
    System.out.println("Welcome to the Higher / Lower game!!!\n"
    +  "Try to guess a number between 1 and 100.");

    // begin number guessing game
    while (userGuess != randNumber)
    {
      // prompt user to guess a number
      System.out.print("Enter your guess: ");
      userGuess = scnr.nextInt();

      // if user guesses correctly
      if(userGuess == randNumber)
      {
        System.out.println("\nThe number was " + userGuess +
        "! You guessed correctly! It took you " + counter + " tries.");
      }
      // if the user guesses a number that's too low
      else if (userGuess < randNumber && userGuess > 0)
      {
        System.out.println("\nThe number " + userGuess + " was too low, try again!");
        counter++;
      }
      // if the user guesses a number that's too high
      else if (userGuess > randNumber && userGuess < 101)
      {
        System.out.println("\nThe number " + userGuess + " was too high, try again!");
        counter++;
      }
      // if the user guesses a number that's out of range
      else
      {
        System.out.println("\nThe number " + userGuess + " was out of range."
        + "\nPlease enter a number between 1 and 100");
      }

    } // end of while loop
  } // end of main method
} // end of Operation3 class
