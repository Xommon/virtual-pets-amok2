
public class Cat extends Organic {
	public Cat(String name, String description) {
		super(name, description);
	}

	int potty = 0;

	public void tick() {
		hunger += 2;
		thirst += 4;
		potty += 7;
		boredom += 3;
		if (hunger >= 100 || thirst >= 100) {
			health -= 10;
		}
	}
}
