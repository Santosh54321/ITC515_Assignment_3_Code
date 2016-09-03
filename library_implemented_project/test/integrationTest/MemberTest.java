package library.test.integrationTest;

import static org.junit.Assert.*;

import org.junit.Test;
import library.interfaces.entities.IMember;
import library.Main;
import library.interfaces.daos.IMemberDAO;

public class MemberTest {

	@Test
	public void test() {
		Main m=new Main();
		m.addmemberTest();
		String s=m.nm1;					//Checking for a  member with maxed out loans
		assertEquals("Test Fails","fname3",s);
}
}
