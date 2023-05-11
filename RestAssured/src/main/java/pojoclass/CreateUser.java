package pojoclass;

public class CreateUser {

//step1 : declare the required variables globally
	String name;
	String job;
//step2 : create constructor to intialize values
	public CreateUser(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
//step3 : provide getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}	
}

