package forLoopPractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NameBackwardsTest {

	@Test
	void reverseInputTest() {
		assertEquals("efil", NameBackwards.reverseInput("Life"));
	}
	
	@Test
	void getInputTest() {
		assertNotNull(NameBackwards.getInput());
	}

}
