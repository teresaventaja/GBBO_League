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
 String           bbr = null;
       String     blr= null;
        String    twr = null;



String player_name = obj.askUser("Introduce your name");
int week = obj.askInt("Introduce the game's week");
if ((week == 1) || (week == 3) || (week == 4) || (week == 5) || (week == 6) || (week == 7) || (week == 8) || (week == 9)) {
best_baker_nomination = obj.askUser("Nominate Best Baker");
baker_to_leave_nomination = obj.askUser("Nominate Baker to Leave");
technical_winner_nomination = obj.askUser("Nominate winner of the technical round");
nominations = (player_name+","+week+","+best_baker_nomination+","+baker_to_leave_nomination+","+technical_winner_nomination);
} else if (week == 2) {
best_baker_nomination = obj.askUser("Nominate Best Baker");
baker_to_leave_nomination = obj.askUser("Nominate Baker to Leave");
technical_winner_nomination = obj.askUser("Nominate winner of the technical round");
final_winner_first_nomination = obj.askUser("Nominate winner of the final episode");
finalist1_nomination = obj.askUser("Nominate one finalist who does not win the final episode");
finalist2_nomination = obj.askUser("Nominate another finalist who does not win the final episode");
nominations = (player_name+","+week+","+best_baker_nomination+","+baker_to_leave_nomination+","+technical_winner_nomination+","+final_winner_first_nomination+","+finalist1_nomination+","+finalist2_nomination);
} else {
final_winner_second_nomination = obj.askUser("Nominate winner of the final episode");
nominations = (player_name+","+week+","+""+","+""+","+""+","+""+","+""+","+""+","+final_winner_second_nomination);
}

/*
        create system to read files for other weeks
        create a system to append points to the csv file
        menu: a player should be able to see a list of all the players and their cumulative point total so far. 
        a player should be able to see their own history of predictions and point scoring.
        Players options:
        - Select week
        - Enter weekly prediction (before Tuesday)  
*/

            //write nominations in CSV
            try {
            BufferedWriter createCSV = new BufferedWriter(new FileWriter("Fantasy GBBO.csv", true));
            createCSV.newLine();
            createCSV.write(nominations);
            createCSV.close();
            } catch (IOException ex) {
            System.out.println(ex);
            System.out.println("The nominations file may not be accessible");
            }
            
            //Read file with results
            String line = "";  
            String splitBy = ",";  
            try   
            {  
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader("week1.csv"));  
            while ((line = br.readLine()) != null) 
            {  
            String[] var = line.split(splitBy);    // use comma as separator  
            bbr = var[1];
            blr = var[2];
            twr = var[3];
            }  
            }   
            catch (IOException e) {  
            System.out.println(e);
            System.out.println("The results file may not be accessible");
            }  


            weeks_1_to_9_results w19r = new weeks_1_to_9_results(); 
            System.out.println("Your final points are " + w19r.technical_winner_points(twr));

    }
}