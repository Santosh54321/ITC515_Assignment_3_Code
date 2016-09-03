package library.test.unitTest.memberObjects;

import static org.junit.Assert.*;



import org.junit.Test;

import library.Entities.Member;

public class MemberTest {

	@Test
	public void test() {
		Member me=new Member("FName1","IName1","002","email1");
		boolean test=me.hasOverDueLoans();
		assertTrue("The testing for the method hasOverDueLoans() was not successfull",test);
		
		
	}

}
