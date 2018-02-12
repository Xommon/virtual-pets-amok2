import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoboticTest {
	Robotic testPet = new RobotDog("Test", "Robot Dog");

	@Test
	public void shouldGetName() {
		String check = testPet.getName();
		assertEquals(check, "Test");
	}

	@Test
	public void shouldGetDescription() {
		String check = testPet.getDescription();
		assertEquals(check, "Robot Dog");
	}

	@Test
	public void shouldGetOil() {
		int check = testPet.getOil();
		assertEquals(100, check);
	}

	@Test
	public void shouldGetBoredom() {
		int check = testPet.getBoredom();
		assertEquals(0, check);
	}

	@Test
	public void shouldGetHappiness() {
		int check = testPet.getHappiness();
		assertEquals(100, check);
	}

	@Test
	public void shouldOilRobotPet() {
		testPet.oil();
		int check = testPet.getOil();
		assertEquals(150, check);
	}

	@Test
	public void shouldPlayWithPet() {
		testPet.play();
		int check = testPet.getBoredom();
		assertEquals(-30, check);
	}
}
