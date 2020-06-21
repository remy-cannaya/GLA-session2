package gla_ratrap;

import java.time.LocalDateTime;


public interface ShowDAO {

	/* GET */
	
    //retrieval of a show's beginning
    LocalDateTime getBegin (int user_id, int show_id);
    //retrieval of a show's ending
    LocalDateTime getEnd (int user_id, int show_id);
    //retrieval of a show's name
    String getName (int user_id, int show_id);
    //retrieval of a show's ID
    String getID (int user_id, int show_id);

    
    /* POST */
    
    //set a beginning to a movie
    void setBegin (int user_id, int show_id, int year, int month, int dayOfMonth, int hour, int minute);
    //set an ending to a movie
    void setEnd (int user_id, int show_id, int year, int month, int dayOfMonth, int hour, int minute);
    //set a show's name  
    void setName (int user_id, int show_id, String name);
    
    /* PUT */
    
    //add a movie's name
    String addName (int user_id, int show_id);
    //add a show's begin time
    LocalDateTime addBegin (int user_id, int show_id);
    //add a show's end time 
    LocalDateTime addEnd (int user_id, int show_id);
    
    
    /* DELETE */
    
    //remove a show's name
    void removeName(int user_id, int show_id);
    //remove a show's begin time
    void removeBegin(int user_id, int show_id);
    //remove a show's end time
    void removeEnd(int user_id, int show_id);
    
}
