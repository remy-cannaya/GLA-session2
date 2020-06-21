package gla_ratrap;

import java.util.List;

public interface TheatreDAO {
	
	/* GET */
	
    //retrieval of a theatre's name
    String getName (int user_id, int theatre_id);
    //retrieval of a theatre's city 
    String getCity (int user_id, int theatre_id);
    //retrieval of a theatre's movies 
    List<Movie> movies (int user_id, int theatre_id);
    //retrieval of a theatre's shows
    List<Show> shows (int user_id, int theatre_id);
    
    
    /* POST */
    
    //retrieval of a theatre's name
    String setName (int user_id, int theatre_id, String name);
    //retrieval of a theatre's city 
    String setCity (int user_id, int theatre_id, String city);

    /* PUT */
    
    //add a new movie
    int addMovies (int user_id, int theatre_id);
    //add a new show 
    void addShows (int user_id, int theatre_id);
    
    /* DELETE */
    
    //remove a movie
    void removeMovies (int user_id, int theatre_id, int movie_id);
    //remove a show
    void removeShows (int user_id, int theatre_id, int show_id);
    
}
