
package musicplayer;
//import java.sql.Connection;
import java.sql.*;
public class MusicPlayer {

    
    public static void main(String[] args) {
        DataConnection dbcon = new DataConnection();
        dbcon.connectMusicDB();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });   
        
       java.awt.EventQueue.invokeLater(new Runnable(){
        
        public void run(){
           Login login = new Login();
       
          if(login.equals(true)){
          new HomePage().setVisible(true);
          }
          else{
          new HomePage().setVisible(false);
          }
        }
        });  
    }
    
}
