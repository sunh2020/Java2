
public class ProjectTest {
	public static void main(String[] args) {
		Project p = new Project();
		p.setName("Niki");
		p.setDescription("Hohoho");
		Project p2 = new Project("Jane", "Hi");
		
		
		Project p3 = new Project("Hello Java", "Welcome");
		p.elevatorPitch();
		p2.elevatorPitch();
		p3.elevatorPitch();
	}
}
