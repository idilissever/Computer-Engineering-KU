package simulation;

public class Intern {
	private String name;
	private String ID;
	
//  two-argument constructor
	public Intern(String name, String iD) {
		this.name = name;
		ID = iD;
	}
	
	//no-argument constructor
	public Intern() {
		
	}
	//one argument constructor
	public Intern(String name) {
		this.name = name;	
	}

// getter/setter methods
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}


}
