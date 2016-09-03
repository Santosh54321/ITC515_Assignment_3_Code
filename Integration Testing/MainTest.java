package library.test.integrationTest;
import library.Main;
import library.daos.BookDAO;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
	
	
	@Test
	
	public void test() {
		
					// setTestData2 is called here from the test method
		
		// Now creating the object of BookDAO
		Main m=new Main();
		m.setTestData2();
		m.bookda.getBookByID(2);
		String title=m.bookda.title1;
		assertEquals("The test fails"," titleQ",title);
		
	}
}

		