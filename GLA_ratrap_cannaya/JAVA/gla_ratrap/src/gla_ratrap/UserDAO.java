package gla_ratrap;



public interface UserDAO {
	
	/* GET */
	
    //retrieval of a username
    String getUsername (int user_id);
    //retrieval of a user's password 
    String getPassword (int user_id);
    //retrieval of a user's mail 
    String getMail (int user_id);
    //retrieval of a user's admin status 
    boolean isAdmin (int user_id);
    //retrieval of a user's planner status 
    boolean isPlanner (int user_id);
    //retrieval of a user's distributor status 
    boolean isDistributor (int user_id);
    
    /* POST */
    
    //set of a username
    void setUsername (int user_id, String username);
    //set of a user's password 
    void setPassword (int user_id, String password);
    //set of a user's mail 
    void setMail (int user_id, String mail);
    //set of a user's mail 
    void setAdmin (int user_id, boolean admin);
    //retrieval of a user's planner status 
    void setPlanner (int user_id, boolean planner);
    //retrieval of a user's distributor status 
    void setDistributor (int user_id, boolean distributor);
    
    
}