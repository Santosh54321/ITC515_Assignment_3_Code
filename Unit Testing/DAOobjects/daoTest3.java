package library.test.unitTest.DAOobjects;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import library.daos.BookDAO;

public class daoTest3 {							//The test fails since the expected output is put as titleY but 
															// the real output was titleY11

	@Test
	public void test() {
		BookDAO bd = new BookDAO();
		bd.addBook("authorA","titleX11","0111");
		bd.addBook("authorB"," titleY11","0222");
		bd.addBook("authorC", "titleZ11", "0333");
		bd.findBooksByAuthor("authorB");
		String s=bd.book1;
		System.out.println(s);
		assertEquals("The test fails","titleY",s);			//if helper is not null then test succeeds
	
}
}
