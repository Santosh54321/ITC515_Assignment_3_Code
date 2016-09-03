package library.test.unitTest.memberObjects;

import static org.junit.Assert.*;

import org.junit.Test;

import library.Entities.Member;

public class test2 {

	@Test
	public void test() {
		Member me=new Member("FName3","IName003","004","email3");
		boolean test=me.hasReachedLoanLimit();
		assertTrue("The testing for the method hasReachedLoanLimit() was not successfull",test);
		
	}
	@Test
		public void test2(){
			Member me1=new Member("FName2","IName003","004","email3");
			boolean test1=me1.hasReachedLoanLimit();
			assertFalse("The testing for the method hasReachedLoanLimit() was not successfull for FName2",test1);
		}
}
