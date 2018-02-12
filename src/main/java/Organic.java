
public abstract class Organic extends VirtualPet {
	String name;
	String description;
	int hunger;
	int thirst;
	int potty;
	int boredom;
	int happiness;

	public Organic(String name, String description) {
		this.name = name;
		this.description = description;
		this.hunger = 0;
		this.thirst = 0;
		this.potty = 0;
		this.boredom = 0;
		this.happiness = 100;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getPotty() {
		return potty;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getHappiness() {
		return happiness;
	}

	public void feed() {
		hunger -= 30;
	}

	public void water() {
		thirst -= 30;
	}

	public void capAll() {
		if (hunger >= 100) {
			hunger = 100;
		} else if (hunger <= 0) {
			hunger = 0;
		}
		if (thirst >= 100) {
			thirst = 100;
		} else if (thirst <= 0) {
			thirst = 0;
		}
		if (potty >= 100) {
			potty = 100;
		} else if (potty <= 0) {
			potty = 0;
		}
		if (boredom >= 100) {
			boredom = 100;
		} else if (boredom <= 0) {
			boredom = 0;
		}
		if (happiness >= 100) {
			happiness = 100;
		} else if (happiness <= 0) {
			happiness = 0;
		}
		if (health >= 100) {
			health = 100;
		} else if (health <= 0) {
			health = 0;
		}
	}

	@Override
	public String toString() {
		return String.format("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s", name, description, health, happiness, boredom,
				hunger, thirst, potty);
	}

}
