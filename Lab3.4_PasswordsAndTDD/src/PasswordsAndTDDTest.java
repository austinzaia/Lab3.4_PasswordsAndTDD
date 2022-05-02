import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasswordsAndTDDTest {

	@Test
	void testList1() {
		boolean expected = true;
		boolean actual = PasswordsAndTDD.passwordValidate("gOInmerry1");
		assertEquals(expected, actual);
	}
	@Test
	void testList2() {
		boolean expected = false;
		boolean actual = PasswordsAndTDD.passwordValidate("BUGGY55");
		assertEquals(expected, actual);
	}
	@Test
	void testLength1() {
		boolean expected = true;
		boolean actual = PasswordsAndTDD.passwordValidate("gOInmerry2");
		assertEquals(expected, actual);
	}
	@Test
	void testLength2() {
		boolean expected = false;
		boolean actual = PasswordsAndTDD.passwordValidate("gOOn12");
		assertEquals(expected, actual);
	}
	@Test
	void testNum1() {
		boolean expected = true;
		boolean actual = PasswordsAndTDD.passwordValidate("gOInmerry3");
		assertEquals(expected, actual);
	}
	@Test
	void testNum2() {
		boolean expected = false;
		boolean actual = PasswordsAndTDD.passwordValidate("pIrAteKIng6");
		assertEquals(expected, actual);
	}
	@Test
	void testSpace1() {
		boolean expected = true;
		boolean actual = PasswordsAndTDD.passwordValidate("gOInmerry4");
		assertEquals(expected, actual);
	}
	@Test
	void testSpace2() {
		boolean expected = false;
		boolean actual = PasswordsAndTDD.passwordValidate("pIratE king2");
		assertEquals(expected, actual);
	}
	@Test
	void testCapitalVowels1() {
		boolean expected = true;
		boolean actual = PasswordsAndTDD.passwordValidate("gOInmerry5");
		assertEquals(expected, actual);
	}
	@Test
	void testCapitalVowels2() {
		boolean expected = false;
		boolean actual = PasswordsAndTDD.passwordValidate("goinmerry0");
		assertEquals(expected, actual);
	}
	@Test
	void testAdminMod() {
		boolean expected = true;
		boolean actual = PasswordsAndTDD.passwordValidate("mod");
		assertEquals(expected, actual);
	}
	@Test
	void testAdminMod2() {
		boolean expected = false;
		boolean actual = PasswordsAndTDD.passwordValidate("admin");
		assertEquals(expected, actual);
	}
}
