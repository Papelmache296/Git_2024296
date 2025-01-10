/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inpututils;

import java.util.Scanner;

/**
 *
 * @author kheal
 */
public class InputUtils {
    
    /**
     * Ask user to enter text
     * if not text, repeat prompt
     * @param prompt The question or prompt to the user
     * @return some valid text from user as a String
     */
    
    public String askUserForText(String prompt){
    
        
            Scanner myKB = new Scanner(System.in);
        
        String userInput;
        
        do {
            System.out.println(prompt);
            System.out.println("You must enter text only!");
            
            userInput = myKB.nextLine();
            
        }while (!userInput.matches("[a-zA-Z!.?', ]+"));
        
        //the input must be text
        return(userInput);
        
    }

    
    /**
     * Ask user to enter integer value based in a prompt
     * if not an int then keep asking
     * @param prompt the prompt/question for the user
     * @return  an int value entered by user
     */
    public int askUserforInt(String prompt){
            
        Scanner myKB = new Scanner(System.in);
         
        String userInput;
       
        do {
        System.out.println(prompt);
        System.out.println("You must enter numbers only!");
            
        userInput = myKB.nextLine();
            
        }while (!userInput.matches("[0-9]+"));
        //must have a numeric input stored as a string
        
        return(Integer.parseInt(userInput));
               
    }           
    /**
     * Ask user for an integer with a given maximum
     * if not valid then keep asking
     * @param prompt the prompt or question fo the user
     * @param maxValue the maximum int value
     * @return 
     */
     public int askUserforInt(String prompt, int maxValue){
             
     Scanner myKB = new Scanner(System.in);
     
    
        int userInput2= maxValue +1;
   
        do {
            System.out.println("Enter some numbers: ");
            System.out.println("You must enter numbers less than " + maxValue + " only!");
            
             try{
                    //this might go wrong if user enters text
                    userInput2 = myKB.nextInt();
            }
             catch (Exception e){
                System.out.println("That was not a number!");
                myKB.nextLine(); // this prevents infinite loop
            }
            
            //keep going while input too big
        }while ( userInput2 > maxValue);
        
        return (userInput2);
     
     }
    
    /**
     * Ask user for input and changes the input
     * @param userName Input asked to the user
     * @return Returns input modified
     */ 
    public String userNameFewDifferences(String userName){
        
        //Check of username is longer than 2 letters
        if (userName.length() > 2) {

            //Count characters in the string and cut it in half    
            int mid = userName.length() / 2;
        
        //Convert first half of the input as UpperCase
           String firstPart = userName.substring(0, mid).toUpperCase();
           
        // Convert second half of the input as LowerCase
           String secondPart = userName.substring(mid).toLowerCase();
           
           //Puts together the first and second half
            return firstPart + secondPart;
            
        } else {
            
         //If it has two or less character, return all characters in UpperCase   
            return userName.toUpperCase();
        }
        
    }
    
    /**
     * Method validates if user has integer as input
     * @param userName user input
     * @return TRUE = contains an integer , FALSE = does not contain an integer 
     */
    public boolean checkIfUserNameHasInt(String userName){
        
    return userName.matches("[0-9]+");
        
    }
    
    /**
     *Ask user for an user name without integer 
     * Keep asking if input has integer
     * @param prompt the prompt or question fo the user
     * @return Returns valid username to the user
     */
        public String askUserForUserName(String prompt){
    
        
            Scanner myKB = new Scanner(System.in);
        
        //Variable that contains Input
        String userName;
        
        //Variable to track the ammount of attemps
        int attempt = 0;
        
        //Starts the loop
        do {

        // If user has one or more attemps, display ERROR message    
        if (attempt > 0){
            System.out.println("[ERROR] The user name cannot contain numbers, try again.");
            
        }
        
        //Displays prompt whatever may be
        System.out.println(prompt);
        
            userName = myKB.nextLine();
            
        //Counts the attempts of the user    
        attempt = attempt + 1;
        
        //Check if conditions are optimum, if not, starts again
        // "This" usado para invocar method "checkIfUserNameHasInt" in this class
        }while (this.checkIfUserNameHasInt(userName));
        
        //the input must be text
        return(userName);
        
    }
}