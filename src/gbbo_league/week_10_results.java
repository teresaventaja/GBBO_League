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
    String week;
   String final_episode_winner_result;
    String finalist1_result;
    String finalist2_result;
    
    
    //constructor for week 10 results
        public week_10_results(String player_name, String final_episode_winner_result) {
        
        this.player_name = player_name; 
        week = "10";     
        this.final_episode_winner_result = final_episode_winner_result;

    }
        
        //constructor for week 2 results
        public week_10_results(String player_name, String final_episode_winner_result, String finalist1_result, String finalist2_result) {
        
        this.player_name = player_name; 
        week = "2";  
        this.final_episode_winner_result = final_episode_winner_result;
        this.finalist1_result = finalist1_result;
        this.finalist2_result = finalist2_result;
    }
                        int points;
        
}
