import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	private GradeBook g1, g2;

	@BeforeEach
	void setUp() throws Exception {
		// create two Gradebook object
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);

		// add some random scores to the GradeBook objects
		g1.addScore(90.0);
		g1.addScore(98.0);
		g1.addScore(97.0);
		g1.addScore(96.0);
		g1.addScore(95.0);

		g2.addScore(99.0);
		g2.addScore(88.0);
		g2.addScore(77.0);
		g2.addScore(66.0);
		g2.addScore(55.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		// set the two objects of Gradebook to null.
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {

		// Use the toString method to compare the contents of the array
		assertTrue(g1.toString().equals("90.0 98.0 97.0 96.0 95.0"));
		assertTrue(g2.toString().equals("99.0 88.0 77.0 66.0 55.0"));

		// Compare the scoreSize to the expected number of scores
		assertTrue(g1.getScoresSize() == 5);
		assertTrue(g2.getScoresSize() == 5);
	}

	@Test
	void testSum() {
		// Compare what is returned by sum() to the expected sum
		assertTrue(g1.sum() == (90.0 + 98.0 + 97.0 + 96.0 + 95.0));
		assertTrue(g2.sum() == (99.0 + 88.0 + 77.0 + 66.0 + 55.0));
	}

	@Test
	void testMinimum() {
		// Compare what is returned by minimum() to the expected minimum
		assertTrue(g1.minimum() == 90.00);
		assertTrue(g2.minimum() == 55.00);
	}

	@Test
	void testFinalScore() {
		// Compare the number returned by finalScore() to the expected finalScore
		// since g1 has 3 scores and g2 has 2 score: the return value should be (sum -
		// minimum)
		double expectedFinal1 = (90.0 + 98.0 + 97.0 + 96.0 + 95.0) - 90.00;
		double expectedFinal2 = (99.0 + 88.0 + 77.0 + 66.0 + 55.0) - 55.00;
		assertTrue(g1.finalScore() == expectedFinal1);
		assertTrue(g2.finalScore() == expectedFinal2);
	}

	@Test
	void testGetScoresSize() {
	}

	@Test
	void testToString() {
	}

}
