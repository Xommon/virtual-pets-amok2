import java.util.Map;
import java.util.Collection;
import java.util.HashMap;

public class VirtualPetShelter {
	public Map<String, VirtualPet> pets = new HashMap<>();

	public int litter = 0;

	public int getLitter() {
		return litter;
	}

	public void cleanLitter() {
		litter = 0;
	}

	public void cleanCages() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Dog) {
				Dog dog = (Dog) pet;
				dog.cageClean = true;
			}
		}
	}

	public void tickAll() {
		for (VirtualPet pet : pets.values()) {
			pet.tick();
			if (pet instanceof Cat) {
				if (((Cat) pet).getPotty() >= 100) {
					litter += 10;
					((Cat) pet).potty = 0;
				}
				if (litter >= 100) {
					((Cat) pet).happiness -= 8;
				} else {
					((Cat) pet).happiness += 2;
				}
			}
			if (pet.health <= 0) {
				System.out.println(pet.getName() + " has died!");
				removePet(pet.getName());
			}
		}
	}

	public void capEveryAll() {
		for (VirtualPet pet : pets.values()) {
			pet.capAll();
		}
	}

	public Collection<VirtualPet> getAllNames() {
		return pets.values();
	}

	public boolean containsPet(String testPet) {
		for (VirtualPet name : pets.values()) {
			if (name.getName().equals(testPet)) {
				return true;
			}
		}
		return false;
	}

	public void addPet(String name, String description) {
		if (description.equals("Dog")) {
			Dog newDog = new Dog(name, "Dog");
			pets.put(newDog.getName(), newDog);
		} else if (description.equals("Cat")) {
			Cat newCat = new Cat(name, "Cat");
			pets.put(newCat.getName(), newCat);
		} else if (description.equals("Robot Dog")) {
			RobotDog newRobotDog = new RobotDog(name, "Robot Dog");
			pets.put(newRobotDog.getName(), newRobotDog);
		} else if (description.equals("Robot Cat")) {
			RobotCat newRobotCat = new RobotCat(name, "Robot Cat");
			pets.put(newRobotCat.getName(), newRobotCat);
		}
	}

	public void removePet(String name) {
		pets.remove(name);
	}

	public void feedAll() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Organic) {
				Organic organic = (Organic) pet;
				organic.feed();
			}
		}
	}

	public void waterAll() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Organic) {
				Organic organic = (Organic) pet;
				organic.water();
			}
		}
	}

	public void playWith(String name) {
		for (VirtualPet pet : pets.values()) {
			if (pet.getName().equals(name)) {
				pet.play();
			}
		}
	}

	public void oilAll() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Robotic) {
				Robotic robot = (Robotic) pet;
				robot.oil();
			}
		}
	}

	public void walkAll() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Dog) {
				Dog dog = (Dog) pet;
				dog.walk();
			} else if (pet instanceof RobotDog) {
				RobotDog robotDog = (RobotDog) pet;
				robotDog.walk();
			}
		}
	}

}
