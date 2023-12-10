/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gbbo_league;

/**
 *
 * @author User
 */
public class week_10_nominations {

    String player_name;
    int week;
    String overall_winner_nomination;
    String finalist1_nomination;
    String finalist2_nomination;
    
        public week_10_nominations(String player_name, int week, String overall_winner_nomination, String finalist1_nomination, String finalist2_nomination, String final_episode_winner_nomination) {
        
        this.player_name = player_name; 
        this.week = week;     
        this.overall_winner_nomination = overall_winner_nomination;
        this.finalist1_nomination = finalist1_nomination;
        this.finalist2_nomination = finalist2_nomination;
    }
}
