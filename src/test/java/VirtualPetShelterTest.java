import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.junit.Test;

public class VirtualPetShelterTest {
	VirtualPetShelter testShelter = new VirtualPetShelter();
	Dog testPet = new Dog("Test","Dog");
	
	@Test
	public void shouldGetLitterCleanliness() {
		int check = testShelter.getLitter();
		assertEquals(0, check);
	}
	
	@Test
	public void shouldCleanLitterBox() {
		testShelter.cleanLitter();
		int check = testShelter.getLitter();
		assertEquals(0,check);
	}
	
	@Test
	public void shouldCleanAllDogCage() {
		testShelter.pets.put(testPet.getName(),testPet);
		testPet.poopCage();
		testShelter.cleanCages();
		boolean check = testPet.getCageClean();
		assertEquals(true, check);
	}
	
//	@Test
//	public void shouldReturnAllPets() {
//		Cat testPet2 = new Cat("Test","Cat");
//		testShelter.pets.put(testPet.getName(), testPet);
//		testShelter.pets.put(testPet2.getName(), testPet2);
//		Virtualpet check = testShelter.getAllNames();
//		assertEquals(true,check);
//		
//	}
	
	@Test
	public void shouldAddPet() {
		testShelter.addPet("Danny","Dog");
	}
}
