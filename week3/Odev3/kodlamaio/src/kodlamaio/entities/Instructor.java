package kodlamaio.entities;

public class Instructor {
	private String Firstname;
	private String Lastname;
	private int id;

	public Instructor(String firstname, String lastname, int id) {
		Firstname = firstname;
		Lastname = lastname;
		this.id = id;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
