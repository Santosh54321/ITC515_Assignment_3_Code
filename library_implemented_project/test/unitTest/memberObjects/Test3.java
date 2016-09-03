package library.test.unitTest.memberObjects;

import static org.junit.Assert.*;

import org.junit.Test;

import library.Entities.Member;

public class Test3 {

	@Test
	public void test() {
		Member me=new Member("fName0","IName0","0001","email0");
		String phone=me.getContactPhone();
		
		assertEquals("The test case for the getContactPhone failed","0001",phone);
	}
	@Test
	public void test1() {
		Member me=new Member("fName0","IName0","0001","email0");
		String fn=me.getFirstName();
		
		assertEquals("The test case for the getFirstName() failed","fName1",fn);

	}
}
