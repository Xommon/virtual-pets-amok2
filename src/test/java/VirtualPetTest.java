import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VirtualPetTest {
	VirtualPet testPet = new Dog("Test", "Dog");

	@Test
	public void shouldReturnHappiness() {
		int check = testPet.getHappiness();
		assertEquals(100, check);
	}

	@Test
	public void shouldReturnHealth() {
		int check = testPet.getHealth();
		assertEquals(100, check);
	}

	@Test
	public void shouldReturnBoredom() {
		int check = testPet.getBoredom();
		assertEquals(0, check);
	}

}
