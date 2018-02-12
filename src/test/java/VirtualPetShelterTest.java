import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.junit.Test;

public class VirtualPetShelterTest {
	VirtualPetShelter testShelter = new VirtualPetShelter();
	Dog testPet = new Dog("Test", "Dog");
	RobotDog testPet2 = new RobotDog("Test", "Robot Dog");

	@Test
	public void shouldGetLitterCleanliness() {
		int check = testShelter.getLitter();
		assertEquals(0, check);
	}

	@Test
	public void shouldCleanLitterBox() {
		testShelter.cleanLitter();
		int check = testShelter.getLitter();
		assertEquals(0, check);
	}

	@Test
	public void shouldCleanAllDogCage() {
		testShelter.pets.put(testPet.getName(), testPet);
		testPet.poopCage();
		testShelter.cleanCages();
		boolean check = testPet.getCageClean();
		assertEquals(true, check);
	}

	// @Test
	// public void shouldReturnAllPets() {
	// Cat testPet2 = new Cat("Test","Cat");
	// testShelter.pets.put(testPet.getName(), testPet);
	// testShelter.pets.put(testPet2.getName(), testPet2);
	// Virtualpet check = testShelter.getAllNames();
	// assertEquals(true,check);
	//
	// }

	@Test
	public void shouldPlayWithPet() {
		testShelter.pets.put(testPet.getName(), testPet);
		testShelter.playWith(testPet.getName());
		testPet.play();
		int check = testPet.getBoredom();
		assertEquals(-30, check);
	}

	@Test
	public void shouldOilAllPets() {
		testShelter.pets.put(testPet2.getName(), testPet2);
		testShelter.oilAll();
		int check = testPet2.getOil();
		assertEquals(150, check);
	}

}
