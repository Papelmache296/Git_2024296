/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.wololo.git2024296;

import inpututils.InputUtils;

/**
 *
 * @author sanch
 */
public class Git2024296 {

    public static void main(String[] args) {
        
    //Inports InputUtils to the code
    InputUtils myInput = new InputUtils();
    
    String  userName;
    
    //Ask User for input
    userName = myInput.askUserForUserName("What is your name?");
    
        System.out.println("Your name is: " + userName);
    

     //Changes the input give
    userName = myInput.userNameFewDifferences(userName);
    
        System.out.println(" Are you " + userName + " The Dragon Slayer");
    }
}
