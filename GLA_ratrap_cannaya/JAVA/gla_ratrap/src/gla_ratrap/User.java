package gla_ratrap;


public class User {
    private int id;
    private static int numberOfExistingUser = 0;
    private String username;
    private String password;
    private String mail;
    private boolean admin;
    private boolean distributor;
    private boolean planner;
    
    public User (){
        numberOfExistingUser++;
        this.id = numberOfExistingUser;
        this.username = "";
        this.password = "";
        this.mail = "";
        this.admin = false ;
        this.distributor = false;
        this.planner = false;
    }
    
    public User (String username, String password, boolean admin, boolean distributor, boolean planner){
        numberOfExistingUser++;
        this.id = numberOfExistingUser;
        this.username = username;
        this.password = password;
        this.admin = admin;
        this.distributor = distributor;
        this.planner = planner;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public boolean isDistributor() {
		return distributor;
	}

	public void setDistributor(boolean distributor) {
		this.distributor = distributor;
	}

	public boolean isPlanner() {
		return planner;
	}

	public void setPlanner(boolean planner) {
		this.planner = planner;
	}
    
}
