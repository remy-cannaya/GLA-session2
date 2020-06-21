package gla_ratrap;

import java.time.LocalDateTime;
import java.util.List;
import javax.swing.ImageIcon;

public class Movie {
    private static int numberOfExistingMovie = 0;
    private int id;
    private String name;
    private String[] description;
    private String[] review;
    private float rate;
    private LocalDateTime release;
    private List<ImageIcon> photos;

    
    public Movie (){
        numberOfExistingMovie++;
        this.id = numberOfExistingMovie;
        this.name = "";
        this.release = LocalDateTime.now();
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


	public String[] getDescription() {
		return description;
	}


	public void setDescription(String[] description) {
		this.description = description;
	}


	public String[] getReview() {
		return review;
	}


	public void setReview(String[] review) {
		this.review = review;
	}


	public float getRate() {
		return rate;
	}


	public void setRate(float rate) {
		this.rate = rate;
	}


	public LocalDateTime getRelease() {
		return release;
	}


	public void setRelease(LocalDateTime release) {
		this.release = release;
	}


	public List<ImageIcon> getPhotos() {
		return photos;
	}


	public void setPhotos(List<ImageIcon> photos) {
		this.photos = photos;
	}
    
}
