
public class RobotCat extends Robotic {
	public RobotCat(String name, String description) {
		super(name, description);
	}

	@Override
	public void tick() {
		boredom += 4;
		oil -= 1;
		if (oil <= 0) {
			health -= 10;
		}
	}

}
