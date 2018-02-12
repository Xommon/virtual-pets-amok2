
public class RobotDog extends Robotic implements Walkable {
	public RobotDog(String name, String description) {
		super(name, description);
	}

	public void walk() {
		boredom -= 25;
		oil -= 3;
	}

	@Override
	public void tick() {
		
	}

}
