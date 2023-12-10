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
    String player_name;
    int week;
    String overall_winner_result;
    String finalist1_result;
    String finalist2_result;
    
        public week_10_results(String player_name, int week, String overall_winner_result, String finalist1_result, String finalist2_result, String final_episode_winner_result) {
        
        this.player_name = player_name; 
        this.week = week;     
        this.overall_winner_result = overall_winner_result;
        this.finalist1_result = finalist1_result;
        this.finalist2_result = finalist2_result;
    }
}
