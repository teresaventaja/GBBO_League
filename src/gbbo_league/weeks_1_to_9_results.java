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
    
    int week;
    String best_baker_result;
    String baker_to_leave_result;
    String technical_winner_result;
    String best_baker_nomination;
    String baker_to_leave_nomination;
    String technical_winner_nomination;
    
    //constructor for weekly results, for weeks 1-9
/*
    public weeks_1_to_9_results(int week, String best_baker_result, String baker_to_leave_result, String technical_winner_result) {   

        this.week = week;
        this.best_baker_result = best_baker_result;
        this.baker_to_leave_result = baker_to_leave_result;
        this.technical_winner_result = technical_winner_result;
        }
*/
    public int points;
    
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
    
}
