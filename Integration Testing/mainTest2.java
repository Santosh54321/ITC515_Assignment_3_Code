package library.test.integrationTest;

import static org.junit.Assert.*;

import org.junit.Test;

import library.Main;

public class mainTest2 {

	@Test
	public void test() {

		// setTestData2 is called here from the test method

// Now creating the object of BookDAO
Main m=new Main();
m.setTestData2();
m.bookda.getBookByID(0);
String title=m.bookda.title1;
assertEquals("The test fails","title1",title);

}
	

}
