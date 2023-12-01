import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeBookTest {
	
    //create at least two objects of Gradebook to hold 5 scores.
	GradeBook gradeBookOne = new GradeBook(5);
	GradeBook gradeBookTwo = new GradeBook(5);
	
    //Then call the addScore method for each of the Gradebook objects at least twice
	@BeforeEach
	public void setUp() {
		gradeBookOne.addScore(55);
		gradeBookOne.addScore(80);
		gradeBookTwo.addScore(74);
		gradeBookTwo.addScore(92);		
	}

	//set the two objects of Gradebook to null
	@AfterEach
	public void tearDown() {
		gradeBookOne = null;
		gradeBookTwo = null;
	}

	//comparing the contents of what is in the scores array vs. what is expected to be in the scores array assertTrue
	//Comparing the scoreSize to the expected number of scores entered, using assertEquals
	@Test
	public void testAddScore() 
	{
		assertEquals("55.0 80.0", gradeBookOne.toString());
		assertEquals("74.0 92.0", gradeBookTwo.toString());
	}
	
	//Comparing what is returned by sum() to the expected sum of the scores entered.
	@Test
	public void testSum() {
		assertEquals(135, gradeBookOne.sum(), .0001);
		assertEquals(166, gradeBookTwo.sum(), .0001);
	}
    
	//Comparing what is returned by minimum() to the expected minimum of the scores entered.
	@Test
	void testMinimum() {
		assertEquals(55, gradeBookOne.minimum(), .0001);
		assertEquals(74, gradeBookTwo.minimum(), .0001);
	}

	//Comparing what is returned by finalScore() to the expected finalScore of the scores entered
	@Test
	void testFinalScore() {
		assertEquals(80, gradeBookOne.finalScore(), .0001);
		assertEquals(92, gradeBookTwo.finalScore(), .0001);
	}


}
