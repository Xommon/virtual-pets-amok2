
public class Cat extends Organic {
	public Cat(String name, String description) {
		super(name, description);
	}

	int potty = 0;

	public void poop() {
		potty = 0;
	}

	public void tick() {
		hunger += 2;
		thirst += 4;
		potty += 4;
		boredom += 3;
	}
}
