/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gbbo_league;

/**
 *
 * @author User
 */
public class weeks_1_to_9_nominations {

    int week;
    String best_baker_nomination;
    String baker_to_leave_nomination;
    String technical_winner_nomination;
    String final_winner_first_nomination;
    String finalist1_nomination;
    String finalist2_nomination;
    
    
    //constructor for weekly nominations, for weeks 1-9
        public weeks_1_to_9_nominations(int week, String best_baker_nomination, String baker_to_leave_nomination, String technical_winner_nomination) {
        
        this.week = week; 
        this.best_baker_nomination = best_baker_nomination;
        this.baker_to_leave_nomination = baker_to_leave_nomination;
        this.technical_winner_nomination = technical_winner_nomination;
    }
        //constructor for week 2
        public weeks_1_to_9_nominations(String final_winner_first_nomination, String finalist1_nomination, String finalist2_nomination) {
        
        week = 2;  
        this.final_winner_first_nomination = final_winner_first_nomination;
        this.finalist1_nomination = finalist1_nomination;
        this.finalist2_nomination = finalist2_nomination;
    }
      
        
        
    weeks_1_to_9_nominations() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
        
}
