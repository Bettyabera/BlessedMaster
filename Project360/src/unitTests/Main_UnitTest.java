package unitTests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Main;

class Main_UnitTest {

	/**
	 * Test that the version of the application is not NULL
	 * and is what it should be.
	 * 
	 * @author Christopher
	 */
	@Test
	void testAppVersion() {
		assertNotNull("Version String is Null", main.Main.VERSION);
		assertEquals("v0.3", main.Main.VERSION);
	}
	
	/**
	 * Test to ensure that all the dev's names are included
	 * in the applications about screen
	 * 
	 * @author Christopher
	 */
	@Test
	void testAboutDevs() {
		assertNotNull("AboutDevs String Array is Null", main.Main.aboutDevs);
		
		String test[] = {"  Alan Thompson",
				         "  Christopher Henderson",
				         "  Betelhem Bada",
				         "  Anthony Cabrera-Lara",
				         "  Anderew Lau"};
		
		assertTrue(main.Main.aboutDevs[0].equals(test[0]));
		assertTrue(main.Main.aboutDevs[1].equals(test[1]));
		assertTrue(main.Main.aboutDevs[2].equals(test[2]));
		assertTrue(main.Main.aboutDevs[3].equals(test[3]));
		assertTrue(main.Main.aboutDevs[4].equals(test[4]));
	}
	
	////// ^^^ OLD Tests /////
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
