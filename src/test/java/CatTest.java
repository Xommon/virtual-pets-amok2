import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CatTest {
	Cat testCat = new Cat("Test", "Cat");

	@Test
	public void shouldPoopCat() {
		testCat.poop();
		int check = testCat.getPotty();
		assertEquals(check, 0);
	}

	@Test
	public void shouldTickCat() {
		testCat.tick();
		int check = testCat.getHunger();
		assertEquals(2, check);
	}

}
