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

    String final_winner_first_nomination;    
    String finalist1_nomination;
    String finalist2_nomination;
    String final_winner_second_nomination;
    String final_winner_result;
    String finalist1_result;
    String finalist2_result;

    //constructor for week 10 results    
    public week_10_results(String final_winner_first_nomination, String finalist1_nomination, String finalist2_nomination, String final_winner_second_nomination, String final_winner_result, String finalist1_result, String finalist2_result) {
        
        this.final_winner_first_nomination = final_winner_first_nomination;
        this.finalist1_nomination = finalist1_nomination;
        this.finalist2_nomination = finalist2_nomination;
        this.final_winner_second_nomination = final_winner_second_nomination;
        this.final_winner_result = final_winner_result;
        this.finalist1_result = finalist1_result;
        this.finalist2_result = finalist2_result;
    }

        public int points;
        
        public boolean check_winner_week2_nomination() {
        return (final_winner_first_nomination.equals(final_winner_result));
        }
        
        public int correct_nomination_week2_points() {
        if (check_winner_week2_nomination() == true) {
        points += 7;
        } else {
        points += 0;
        } 
        return points;
        } 
        
        public boolean check_winner_week10_nomination() {
        return (final_winner_second_nomination.equals(final_winner_result));
        }
        
        public int correct_nomination_week10_points() {
        if (check_winner_week2_nomination() == true) {
        points += 4;
        } else {
        points += 0;
        } 
        return points;
        } 

        public boolean check_finalist1() {
        return (finalist1_nomination.equals(finalist1_result));
        }
        
        public int finalist1_points() {
        if (check_finalist1() == true) {
        points += 2;
        } else {
        points += 0;
        } 
        return points;
        } 
        
        public boolean check_finalist2() {
        return (finalist2_nomination.equals(finalist2_result));
        }
        
        public int finalist2_points() {
        if (check_finalist2() == true) {
        points += 2;
        } else {
        points += 0;
        } 
        return points;
        } 
        
        public int sum_points() {
        return correct_nomination_week2_points() + correct_nomination_week10_points() + finalist1_points() + finalist2_points();
        } 
        
}
