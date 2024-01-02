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
    
    int points = 0;
    String player_name;
    String week;
    String best_baker_nomination;
    String baker_to_leave_nomination;
    String technical_winner_nomination;
    String best_baker_result;
    String baker_to_leave_result;
    String technical_winner_result;
    String overall_winner_nomination;
    String finalist1_nomination;
    String finalist2_nomination;
    String overall_winner_result;
    String finalist1_result;
    String finalist2_result;
    String final_episode_winner_nomination;
    String final_episode_winner_result;
        
        public boolean check_best_baker(String best_baker_result) {
        return (best_baker_nomination == best_baker_result);
        }
        
        public int best_baker_points(String best_baker_result) {
        if (check_best_baker(best_baker_result)) {
        } return points += 4;
        }

        public boolean check_fail_best_baker(String baker_to_leave_result) {
        return (best_baker_nomination == baker_to_leave_result);
        }
        
        public int fail_best_baker_points(String baker_to_leave_result) {
        if (check_fail_best_baker(baker_to_leave_result)) {
        } return points -= 1;
        }
 
        public boolean check_baker_to_leave(String baker_to_leave_result) {
        return (baker_to_leave_nomination == baker_to_leave_result);
        }
        
        public int baker_to_leave_points(String baker_to_leave_result) {
        if (check_baker_to_leave(baker_to_leave_result)) {
        } return points += 3;
        }

        public boolean check_fail_baker_to_leave(String best_baker_result) {
        return (baker_to_leave_nomination == best_baker_result);
        }
        
        public int fail_baker_to_leave_points(String best_baker_result) {
        if (check_fail_baker_to_leave(best_baker_result)) {
        } return points -= 1;
        } 
        
        public boolean check_technical_winner(String technical_winner_result) {
        return (technical_winner_nomination == technical_winner_result);
        }
        
        public int technical_winner_points(String technical_winner_result) {
        if (check_technical_winner(technical_winner_result)) {
        } return points += 2;
        }
        
        public boolean check_overall_winner(String overall_winner_result) {
        return (overall_winner_nomination == overall_winner_result);
        }
        
        public int overall_winner_points(String overall_winner_result) {
        if (check_overall_winner(overall_winner_result)) {
        } return points += 7;
        }

        public boolean check_finalist1(String finalist1_result) {
        return (finalist1_nomination == finalist1_result);
        }
        
        public int finalist1_points(String finalist1_result) {
        if (check_finalist1(finalist1_result)) {
        } return points += 2;
        }
        
        public boolean check_finalist2(String finalist2_result) {
        return (finalist2_nomination == finalist2_result);
        }
        
        public int finalist2_points(String finalist2_result) {
        if (check_finalist2(finalist2_result)) {
        } return points += 2;
        }
        
        public boolean check_final_episode_winner(String final_episode_winner_result) {
        return (final_episode_winner_nomination == final_episode_winner_result);
        }
        
        public int final_episode_winner_points(String final_episode_winner_result) {
        if (check_final_episode_winner(final_episode_winner_result)) {
        } return points += 4;
        }
        
        
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
        
          public static void main(String[] args) {
       
get_user_input obj = new get_user_input();
String player_name = obj.askUser("Introduce your name");
String week = obj.askUser("Introduce the game's week");
String best_baker_nomination = obj.askUser("Nominate Best Baker");
String baker_to_leave_nomination = obj.askUser("Nominate Baker to Leave");
String technical_winner_nomination = obj.askUser("Nominate winner of the technical round");

weeks_1_to_9_nominations player1_w19n = new weeks_1_to_9_nominations();

System.out.println(player_name);

//weeks_1_to_9_nominations week1_nominations = new weeks_1_to_9_nomination();
        
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
        
        object creation / use
        
        scanner - interactions
        
        import static java.lang.System.in;
import java.util.Scanner;

public class UserInputMethod {
    
            public static void main(String[] args) {

        String userName = askUser("What is your name?");
    }
    
    static String askUser (String prompt) {
        
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
    
    
}
*/      
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
        
        object creation / use
        
        scanner - interactions
        
        import static java.lang.System.in;
import java.util.Scanner;

public class UserInputMethod {
    
            public static void main(String[] args) {

        String userName = askUser("What is your name?");
    }
    
    static String askUser (String prompt) {
        
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
    
    
}
*/
       

    

