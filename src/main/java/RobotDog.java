
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
		boredom += 2;
		oil -= 2;
		if (oil <= 0) {
			health -= 10;
		}
	}

}
