
public class Dog extends Organic implements Walkable {
	public Dog(String name, String description) {
		super(name, description);
	}

	int potty;
	int thirst;
	boolean cageClean = true;

	public void poopCage() {
		cageClean = false;
	}

	public boolean getCageClean() {
		return cageClean;
	}

	public void walk() {
		potty = 0;
		boredom -= 25;
		thirst += 5;
		hunger += 3;
	}

	public void tick() {
		hunger += 6;
		thirst += 2;
		potty += 3;
		boredom += 1;
		if (cageClean = false) {
			happiness -= 8;
		}
	}
}
