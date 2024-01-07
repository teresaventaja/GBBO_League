/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gbbo_league;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author User
 */
public class player_points {
    
    String player_name;
    String line = "";  
String splitBy = ","; 
int total_points;

    
    
    public player_points(String player_name, int total_points) {
    this.player_name = player_name;
        this.total_points = total_points;
    }
    
    
    // find a particular player
   // public boolean find_player() {
   // return (player_name.equals("Tere"));
   // }        
            
    public int points;
    
    //sum all points from the same player
    public int total_points() {
    try   
    {  
    BufferedReader br = new BufferedReader(new FileReader("Fantasy GBBO.csv"));  
    while ( ((line = br.readLine()) != null) && player_name.equals("Tere")) //find a match in the file for the same name
    {  
    String[] var = line.split(splitBy);    // use comma as separator  
    points = Integer.parseInt(var[9]);
    total_points += points;
    } 
    System.out.println("Your total points are " + total_points);
    }
   
    catch (IOException e) {  
    System.out.println("The results points may be incorrect due to incorrect read of csv file");
    } return total_points; 
    }
}


