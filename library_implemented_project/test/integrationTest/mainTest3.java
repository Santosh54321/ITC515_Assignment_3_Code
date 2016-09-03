package library.test.integrationTest;

import static org.junit.Assert.*;

import org.junit.Test;

import library.Main;

public class mainTest3 {

	@Test
	public void test() {

		// setTestData2 is called here from the test method

// Now creating the object of BookDAO
Main m=new Main();
m.setTestData2();
m.bookda.findBooksByAuthor("authorX");
String title=m.bookda.book1;
assertEquals("The test fails","titleY",title);

}

}
