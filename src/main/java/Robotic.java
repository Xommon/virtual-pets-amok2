
public abstract class Robotic extends VirtualPet {
	String name;
	String description;
	int oil;
	int boredom;
	int happiness;

	public Robotic(String name, String description) {
		this.name = name;
		this.description = description;
		this.oil = 100;
		this.boredom = 0;
		this.happiness = 100;
	}

	public void capAll() {
		if (oil >= 100) {
			oil = 100;
		} else if (oil <= 0) {
			oil = 0;
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

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getOil() {
		return oil;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getHappiness() {
		return happiness;
	}

	public void oil() {
		oil += 50;
	}

	@Override
	public String toString() {
		return String.format("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s", name, description, health, happiness,
				boredom, "", "", "", oil);
	}

}
