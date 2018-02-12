
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

	public void play() {
		boredom -= 30;
	}

	@Override
	public String toString() {
		return String.format("%-17s%-17s%-17s%-17s%-17s%-17s", health, happiness, boredom, hunger, thirst, potty);
	}

}
