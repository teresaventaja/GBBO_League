/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gbbo_league;

/**
 *
 * @author User
 */
public class weeks_1_to_9_results {
    
    String best_baker_result;
    String baker_to_leave_result;
    String technical_winner_result;
    String best_baker_nomination;
    String baker_to_leave_nomination;
    String technical_winner_nomination;
    
    //constructor for weekly results, for weeks 1-9
    public weeks_1_to_9_results(String best_baker_nomination, String baker_to_leave_nomination, String technical_winner_nomination, String best_baker_result, String baker_to_leave_result, String technical_winner_result) {   

        this.best_baker_nomination = best_baker_nomination;
        this.baker_to_leave_nomination = baker_to_leave_nomination;
        this.technical_winner_nomination = technical_winner_nomination;
        this.best_baker_result = best_baker_result;
        this.baker_to_leave_result = baker_to_leave_result;
        this.technical_winner_result = technical_winner_result;
        }

    public int points;
    
        public boolean check_best_baker() {
        return (best_baker_nomination.equals(best_baker_result));
        }
        
        public int best_baker_points() {
        if (check_best_baker() == true) {
        points += 4;
        } else {
        points += 0;
        } 
        return points;
        } 

        public boolean check_fail_best_baker() {
        return (best_baker_nomination.equals(baker_to_leave_result));
        }
        
        public int fail_best_baker_points() {
        if (check_fail_best_baker() == true) {
        points -= 1;
        } else {
        points += 0;
        }
        return points;
        }
 
        public boolean check_baker_to_leave() {
        return (baker_to_leave_nomination.equals(baker_to_leave_result));
        }
        
        public int baker_to_leave_points() {
        if (check_baker_to_leave() == true) {
        points += 3;
        } 
        else {
        points += 0;
        }
        return points;
        }

        public boolean check_fail_baker_to_leave() {
        return (baker_to_leave_nomination.equals(best_baker_result));
        }
        
        public int fail_baker_to_leave_points() {
        if (check_fail_baker_to_leave() == true) {
        points -= 1;
        } else {
        points += 0;
        }
        return points;
        } 
        
        public boolean check_technical_winner() {
        return (technical_winner_nomination.equals(technical_winner_result));
        }
        
        public int technical_winner_points() {
        if (check_technical_winner() == true)  {
        points += 2;
        } else {
        points += 0;
        }
        return points;
        }

        public int sum_points() {
        return best_baker_points() + fail_best_baker_points() + technical_winner_points();
        } 
}
