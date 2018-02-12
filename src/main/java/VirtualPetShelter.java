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
		}
	}

//	public Collection<VirtualPet> getAllNames() {
//		for (VirtualPet pet : pets.values()) {
//			return pet;
//		}
//	}
	
//	public VirtualPet getAllNames() {
//		for (VirtualPet name : pets.values()) {
//				return name;
//		}
//		return null;
//	}
	
	public Collection<VirtualPet> getAllNames() {
        return pets.values();
	}
	
	public void addPet(String name, String description) {
		if (description.equals("Dog")) {
			pets.put(name, Dog);
		}
		
	}
	
}
