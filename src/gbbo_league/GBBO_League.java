/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gbbo_league;

import java.io.BufferedReader;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author User
 */
public class GBBO_League {
    
        public static void main(String[] args) throws FileNotFoundException {
              
get_user_input obj = new get_user_input();
String player_name;
int total_points = 0;
String best_baker_nomination = null;
String baker_to_leave_nomination = null;
String technical_winner_nomination = null;
String final_winner_first_nomination;
String finalist1_nomination;
String finalist2_nomination;
String final_winner_second_nomination;
String best_baker_result = null; 
String baker_to_leave_result = null;
String technical_winner_result = null;
String nominations;
String line = "";  
String splitBy = ",";  



player_name = obj.askUser("Introduce your name");
int week = obj.askInt("Introduce the game's week");
if ((week == 1) || (week == 3) || (week == 4) || (week == 5) || (week == 6) || (week == 7) || (week == 8) || (week == 9)) {
best_baker_nomination = obj.askUser("Nominate Best Baker");
baker_to_leave_nomination = obj.askUser("Nominate Baker to Leave");
technical_winner_nomination = obj.askUser("Nominate winner of the technical round");
nominations = (player_name+","+week+","+best_baker_nomination+","+baker_to_leave_nomination+","+technical_winner_nomination+","+""+","+""+","+""+","+""+","+"");
} else if (week == 2) {
best_baker_nomination = obj.askUser("Nominate Best Baker");
baker_to_leave_nomination = obj.askUser("Nominate Baker to Leave");
technical_winner_nomination = obj.askUser("Nominate winner of the technical round");
final_winner_first_nomination = obj.askUser("Nominate winner of the final episode");
finalist1_nomination = obj.askUser("Nominate one finalist who does not win the final episode");
finalist2_nomination = obj.askUser("Nominate another finalist who does not win the final episode");
nominations = (player_name+","+week+","+best_baker_nomination+","+baker_to_leave_nomination+","+technical_winner_nomination+","+final_winner_first_nomination+","+finalist1_nomination+","+finalist2_nomination+","+""+","+"");
} else {
final_winner_second_nomination = obj.askUser("Nominate winner of the final episode");
nominations = (player_name+","+week+","+""+","+""+","+""+","+""+","+""+","+""+","+final_winner_second_nomination+","+"");
}

/*
To do:

1. Fix player_points calculations
2. Create menu: a player should be able to see their own history of predictions and point scoring.
        Players options:
        - Select week
        - Enter weekly prediction (before Tuesday)
        - View my comulative points
        - View list of all the players and their cumulative point total so far

*/

            //write nominations in CSV
            try {
            BufferedWriter createCSV = new BufferedWriter(new FileWriter("Fantasy GBBO.csv", true));
            createCSV.newLine();
            createCSV.write(nominations);
            createCSV.close();
            } catch (IOException ex) {
            System.out.println("The nominations file may not be accessible");
            }
            
            //Read file with results (week 1)
            try   
            {  
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader("week1.csv"));  
            while ((line = br.readLine()) != null) 
            {  
            String[] var = line.split(splitBy);    // use comma as separator  
            best_baker_result = var[1];
            baker_to_leave_result = var[2];
            technical_winner_result = var[3];
            }  
            }   
            catch (IOException e) {  
            System.out.println("The results file may not have been provided yet");
            }  

            weeks_1_to_9_results w1r = new weeks_1_to_9_results(best_baker_nomination, baker_to_leave_nomination, technical_winner_nomination, best_baker_result, baker_to_leave_result, technical_winner_result); 
            int weekPoints = w1r.sum_points();
            
            //write points won
            try {
            BufferedWriter createCSV2 = new BufferedWriter(new FileWriter("Fantasy GBBO.csv", true));
            createCSV2.write(weekPoints);
            createCSV2.close();
            } catch (IOException ex) {
            System.out.println("Points may not have been recorded");
            }
            
            player_points points_test = new player_points(player_name, total_points);
            int totalPoints = points_test.total_points();
            System.out.println("This player total points: " + totalPoints);
    }
}