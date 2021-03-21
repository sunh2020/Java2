

public class Project {
	private String name;
	private String description;
	private double cost;

	public Project() {
		this.name = "";
		this.description = "";
		this.cost = 0.00;
	}

	public Project(String name, String description) {
		this.name = name;
		this.description = description;
		this.cost = 0.00;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	public void setDescription (String description) {
		this.description = description;
	}
	public void setCost (String projectCost) {
		this.cost = projectCost;
	}
	public void elevatorPitch () {
		System.out.println(this.name + this.description);
		
	}
}
