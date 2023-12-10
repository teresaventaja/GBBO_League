/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gbbo_league;

/**
 *
 * @author User
 */
public class GBBO_League {
    
        int points = 0;
        String best_baker_nomination;
        String baker_to_leave_nomination;
        String best_baker_result;
        
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
        

        
}


       
    public static void main(String[] args) {
        
        

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
        
        Weekly points awarded up to and including episode nine:
        SELECTIONS: BEST BAKER, BAKER TO LEAVE, WINNER OF THAT WEEK'S TECHNICAL ROUND
    Correct nomination of the Best Baker = 4 points
    If your nominated Best Baker is eliminated, then 1 point will be deducted from your total
    Correct weekly nomination of baker to leave = 3 points
    If your nominated baker to leave is the Best Baker 1 point will be deducted from your total.
    Correct nomination of the winner of that week’s technical round = 2 points
 
Points awarded at the end of the final episode of the series:
        SELECTIONS: OVERALL WINNER, 2 FINALISTS, WINNER FINAL EPISODE
    Overall winner chosen after episode one and before episode two = 7 points
    The other two finalists chosen after episode one and before episode two = 2 points each
    Winner of the final episode, chosen after episode nine = 4 points
    No technical round or elimination nominations for the final episode
        
        
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

    

