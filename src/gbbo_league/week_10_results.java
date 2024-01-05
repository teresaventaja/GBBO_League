/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gbbo_league;

/**
 *
 * @author User
 */
public class week_10_results {
    int week;
    String finalist1_nomination;
    String finalist2_nomination;
    String finalist1_result;
    String finalist2_result;
    String final_winner_first_nomination;
    String final_winner_second_nomination;
    String final_winner_result;
    
    
    //constructor for week 10 results
        public week_10_results(String final_winner_result) {
        
        week = 10;     
        this.final_winner_result = final_winner_result;

    }
        
        //constructor for week 2 results
        public week_10_results(String final_winner_result, String finalist1_result, String finalist2_result) {
        
        week = 2;  
        this.final_winner_result = final_winner_result;
        this.finalist1_result = finalist1_result;
        this.finalist2_result = finalist2_result;
    }
        public int points;
        
        public boolean check_winner_week2_nomination(String final_winner_result) {
        return (final_winner_first_nomination.equals(final_winner_result));
        }
        
        public int correct_nomination_week2_points(String final_winner_result) {
        if (check_winner_week2_nomination(final_winner_result)) {
        } return points += 7;
        }
        
        public boolean check_winner_week10_nomination(String final_winner_result) {
        return (final_winner_second_nomination.equals(final_winner_result));
        }
        
        public int correct_nomination_week10_points(String final_winner_result) {
        if (check_winner_week2_nomination(final_winner_result)) {
        } return points += 4;
        }

        public boolean check_finalist1(String finalist1_result) {
        return (finalist1_nomination.equals(finalist1_result));
        }
        
        public int finalist1_points(String finalist1_result) {
        if (check_finalist1(finalist1_result)) {
        } return points += 2;
        }
        
        public boolean check_finalist2(String finalist2_result) {
        return (finalist2_nomination.equals(finalist2_result));
        }
        
        public int finalist2_points(String finalist2_result) {
        if (check_finalist2(finalist2_result)) {
        } return points += 2;
        }
       
        
}
