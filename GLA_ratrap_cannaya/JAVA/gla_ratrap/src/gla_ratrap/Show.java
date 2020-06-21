package gla_ratrap;

import java.time.LocalDateTime;

public class Show {
    private int id;
    private static int numberOfExistingShow = 0;
    private String name;
    private LocalDateTime begin;
    private LocalDateTime end;
    
    public Show(){
        numberOfExistingShow++;
        this.id = numberOfExistingShow;
        this.name = "";
        this.begin = LocalDateTime.now();
        this.end = LocalDateTime.now();
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

	public LocalDateTime getBegin() {
		return begin;
	}

	public void setBegin(LocalDateTime begin) {
		this.begin = begin;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}

    
    
}