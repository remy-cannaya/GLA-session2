package gla_ratrap;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private int id;
    private static int numberOfExistingShow = 0;
    private String name;
    private String city;
    private List<Movie> movies;
    private List<Show> shows;

    
    public Theatre(){
        numberOfExistingShow++;
        this.id = numberOfExistingShow;
        this.name = "";
        this.city = "";
        this.movies = new ArrayList<>();
        this.shows = new ArrayList<>();
    }


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public List<Movie> getMovies() {
		return movies;
	}


	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}


	public List<Show> getShows() {
		return shows;
	}


	public void setShows(List<Show> shows) {
		this.shows = shows;
	} 
    
}