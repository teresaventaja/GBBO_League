/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gbbo_league;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class GBBO_League {
    

        public static void main(String[] args) {
              
        int points = 0;
       
get_user_input obj = new get_user_input();
String player_name = obj.askUser("Introduce your name");
int week = obj.askInt("Introduce the game's week");
String best_baker_nomination = obj.askUser("Nominate Best Baker");
String baker_to_leave_nomination = obj.askUser("Nominate Baker to Leave");
String technical_winner_nomination = obj.askUser("Nominate winner of the technical round");
String final_winner_first_nomination = obj.askUser("Nominate winner of the final episode");
String final_winner_second_nomination = obj.askUser("Nominate winner of the final episode");
String finalist1_nomination = obj.askUser("Nominate one finalist who does not win the final episode");
String finalist2_nomination = obj.askUser("Nominate another finalist who does not win the final episode");


//include validation if we are between week 1-9
weeks_1_to_9_nominations player1_w19n = new weeks_1_to_9_nominations(player_name, week, best_baker_nomination, baker_to_leave_nomination, technical_winner_nomination);
weeks_1_to_9_nominations player1_w2n = new weeks_1_to_9_nominations(player_name, final_winner_first_nomination, finalist1_nomination, finalist2_nomination);
week_10_nominations player1_w10n = new week_10_nominations(player_name, final_winner_second_nomination);


System.out.println("Your final points are " + points);


/*
 try {
            BufferedWriter advancedTextFile = new BufferedWriter(new FileWriter("trades2.txt", false));
            advancedTextFile.write(dataInVariable);
            advancedTextFile.close();
            Scanner readAdvancedTrades = new Scanner(new FileReader("trades2.txt"));
            String readCommaTrades = readAdvancedTrades.nextLine();
            BufferedWriter createFile = new BufferedWriter(new FileWriter("trades.csv", false));
            createFile.write(readCommaTrades);
            createFile.close();
            } catch (Exception t) {
            System.out.println(t);
            System.out.println("The overrode .txt file may not be accessible");
            }
*/

    }
}
        

/*  Based on points. Each week, players choose three contestants - their fantasy team
Data and history stored in csv “Fantasy GBBO.csv”
        Players each week enter their predictions, actual results provided in csv file each week (player info and contest info)
        26 Sept, 3, 10, 17, 24, 31 Oct, 7, 14, 21, 28 Nov (2 episodes)
        Players options:
        - Select week
        - Enter weekly prediction (before Tuesday)
        - See weekly results (After Wednesday)- can be put into "see all results"
                - see a list of players and their cumulative point so far
                - See their own history of predictions and point scoring
        

        csv create, write, read
        

*/      

       

    

