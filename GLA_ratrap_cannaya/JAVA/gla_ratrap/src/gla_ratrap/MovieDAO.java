package gla_ratrap;

import java.time.LocalDateTime;
import java.util.List;

import javax.swing.ImageIcon;

public interface MovieDAO {

	/* GET */
	
    //retrieval of a movie's release date 
    LocalDateTime getRelease (int user_id, int movie_id);
    //retrieval of a movie's name
    String getName (int user_id, int movie_id);
    //retrieval of a movie's rate
    String getRate (int user_id, int movie_id);
    //retrieval of a movie's description
    String[] getDescription (int user_id, int movie_id);
    //retrieval of a movie's review
    String[] getReview (int user_id, int movie_id);
    //retrieval of a movie's photos
    List<ImageIcon> getPhotos (int user_id, int movie_id);
    
    /* POST */
    
    //set a release date to a movie
    void setRelease (int user_id, int movie_id, int year, int month, int dayOfMonth, int hour, int minute);
    //set a movie's name  
    void setName (int user_id, int movie_id, String name);
    //set a movie's description
    void setDescription (int user_id, int movie_id, String[] Description);
    //set a movie's review
    void setReview (int user_id, int movie_id, String[] review);
    //set a movie's rate
    void setRate (int user_id, int movie_id, float rate);
    //add movie's description some photos
    void setPhotos (int user_id, int movie_id, List<ImageIcon> photo);
    
    /* PUT */
    
    //add a movie's release date 
    LocalDateTime addRelease (int user_id, int movie_id);
    //add a movie's name
    String addName (int user_id, int movie_id);
    //add a movie's rate
    String addRate (int user_id, int movie_id);
    //add a movie's description
    String[] addDescription (int user_id, int movie_id);
    //add a movie's review
    String[] addReview (int user_id, int movie_id);
    //add movie's photos
    List<ImageIcon> addPhotos (int user_id, int movie_id);

}
