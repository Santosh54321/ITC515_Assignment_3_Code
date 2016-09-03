package library.test.unitTest.DAOobjects;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import library.daos.BookDAO;


public class daoTest2 {
	
	@Test
	public void test() {
		BookDAO bd = new BookDAO();
		bd.addBook("author4","titleX1","011");
		bd.addBook("author5","titleY1","022");
		bd.addBook("author6", "titleZ1", "033");
		bd.getBookByID(1);
		String s=bd.title1;
		System.out.println(s);
		assertEquals("The test fails","titleY1",s);					//if helper is not null then test succeeds

}
}
