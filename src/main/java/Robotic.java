
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

	public void play() {
		boredom -= 30;
	}

	@Override
	public String toString() {
		return String.format("%-17s%-17s%-17s%-17s%-17s%-17s", health, happiness, boredom, oil);
	}

}
