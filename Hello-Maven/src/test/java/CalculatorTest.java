import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator clsCalc = new Calculator();
		assertEquals(clsCalc.add(1,5),6);
		/*
		 * assertNotEquals(true, true);
		 * assertNull();
		 * assertNotNull();
		 * assertTrue();
		 * assertFalse(); 
		 * assertArrayEquals();
		 */
	}
		
	
	@Test
	void testSub() {
		Calculator clcCalc = new Calculator();
		if(clcCalc.subtract(4, 2) != 2) {
			fail("Subtract not work");
		}
	}
	@Test
	void testMulti() {
		Calculator clsCalc = new Calculator();
		assertEquals(clsCalc.multiply(.5, 2),1);
	}
	@Test
	void testDivide() {
		Calculator clsCalc = new Calculator();
		assertEquals(clsCalc.divide(9,2),4.5);
	}
	// @ BeforeEach @AfterEach @BeforeAll @BeforeAll
}
