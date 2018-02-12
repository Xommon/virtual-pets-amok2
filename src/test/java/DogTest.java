import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DogTest {
	Dog testPet = new Dog("Test", "Dog");

	@Test
	public void shouldReturnCageCleanliness() {
		testPet.poopCage();
		boolean check = testPet.getCageClean();
		assertEquals(false, check);
	}

	@Test
	public void shouldPoopCage() {
		testPet.poopCage();
		boolean check = testPet.getCageClean();
		assertEquals(false, check);
	}

	@Test
	public void shouldTickDog() {
		testPet.tick();
		int check = testPet.getBoredom();
		assertEquals(1, check);
	}

	@Test
	public void shouldGetName() {
		testPet.getName();
		String check = testPet.getName();
		assertEquals("Test", check);
	}
}
