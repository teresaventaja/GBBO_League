/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gbbo_league;

import java.util.Scanner;

/**
 *
 * @author User
 */


// I may need to delete, is included in  main
public class get_user_input {
    
    public String askUser (String prompt) {
        
    //ask the user using prompt. Return what the user enters
        
    Scanner myScanner = new Scanner (System.in);
    System.out.println(prompt);
    try{
        String userInput = myScanner.nextLine();
    return userInput; // returns what the user entered
    } catch (Exception e) {
    return ""; // the method has to return something
    }
    }

     public int askInt (String prompt) {
        
    //ask the user using prompt. Return what the user enters
        
    Scanner myScanner = new Scanner (System.in);
    System.out.println(prompt);
    try{
        int userInput = myScanner.nextInt();
    return userInput; // returns what the user entered
    } catch (Exception e) {
    return 0; // the method has to return something
    }
    }
    
   
}
