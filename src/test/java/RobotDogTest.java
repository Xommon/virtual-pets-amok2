import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RobotDogTest {
	RobotDog testRobotDog = new RobotDog("Test", "Robot Dog");

	@Test
	public void shouldWalkRobotDog() {
		testRobotDog.walk();
		int check = testRobotDog.getBoredom();
		assertEquals(-25, check);
	}
}
