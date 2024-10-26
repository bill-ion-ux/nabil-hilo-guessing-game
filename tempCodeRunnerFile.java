/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guessing_game;

import java.util.Scanner;



public class Guessing_game {

    public static void main(String[] args) {
       
       Scanner scan = new Scanner(System.in);
       String playAgain = "";
       do{
           
             int theNumber = (int)(Math.random()*100 + 1 );
             int guess = 0;
             int numberOfTries = 0;
             while (guess != theNumber) {
                 //create a random number for the user to guess
                  System.out.println("Guess the Number between 1 to 100 : ");
                  guess = scan.nextInt(); // read user input (integer ) 
                  System.out.println("You Enter " + guess + ".");
                  if (guess > theNumber){
                       System.out.println("You're too far");
                  }
                  else if (guess < theNumber){
                       System.out.println("you're too low");
                  }
                  else{
                       System.out.println("YOU'RE CORRECT!!!");
                  }
                  numberOfTries++ ;
           }
             //ask the user to play again
           System.out.println("Congrats! you only took " + numberOfTries + "tries !" );
           System.out.println("Would you like to play again?(y/n) ");
           playAgain = scan.next();//scan for charachter 
        }while( playAgain.equalsIgnoreCase("y"));
         System.out.println("Thank you for Playing!");
         scan.close();
         //scan.close() to prevent resource leak
         //e.g memory exhaustion
         // it release any system resources that it was using to read input
          
         
       
       
       
       }
}
    
        
           
        
    

