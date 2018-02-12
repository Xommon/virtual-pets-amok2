
public abstract class VirtualPet {
	int health = 100;
	int happiness = 100;
	int boredom = 0;
	String name;

	public int getHappiness() {
		return happiness;
	}

	public int getHealth() {
		return health;
	}

	public int getBoredom() {
		return boredom;
	}

	public String getName() {
		return name;
	}

	public void play() {
		boredom -= 30;
	}

	public abstract void capAll();

	public abstract void tick();
}
