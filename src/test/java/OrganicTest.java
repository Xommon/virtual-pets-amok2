import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrganicTest {
	Organic testPet = new Cat("Test", "Cat");

	@Test
	public void shouldReturnName() {
		String check = testPet.getName();
		assertEquals(check, "Test");
	}

	@Test
	public void shouldReturnDescription() {
		String check = testPet.getDescription();
		assertEquals(check, "Cat");
	}

	@Test
	public void shouldReturnHunger() {
		int check = testPet.getHunger();
		assertEquals(check, 0);
	}

	@Test
	public void shouldReturnThirst() {
		int check = testPet.getThirst();
		assertEquals(check, 0);
	}

	@Test
	public void shouldReturnPotty() {
		int check = testPet.getPotty();
		assertEquals(check, 0);
	}

	@Test
	public void shouldReturnBoredom() {
		int check = testPet.getBoredom();
		assertEquals(check, 0);
	}

	@Test
	public void shouldReturnHappiness() {
		int check = testPet.getHappiness();
		assertEquals(check, 100);
	}

	@Test
	public void shouldFeetPet() {
		testPet.feed();
		int check = testPet.getHunger();
		assertEquals(check, -30);
	}

	@Test
	public void shouldWaterPet() {
		testPet.water();
		int check = testPet.getThirst();
		assertEquals(check, -30);
	}

	@Test
	public void shouldPlayWithPet() {
		testPet.play();
		int check = testPet.getBoredom();
		assertEquals(check, -30);
	}

}
