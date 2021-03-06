import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	
	RomanNumerals numerals = new RomanNumerals();

	@Test
	public void test_ConvertToIntegerValueI() {
		assertRomanValue(1, "I");
	}
	
	@Test
	public void test_ConvertToIntegerValueII() {
		assertRomanValue(2, "II");
	}
	
	@Test
	public void test_ConvertToIntegerValueIII() {
		assertRomanValue(3, "III");
	}
	
	@Test
	public void test_ConvertToIntegerValueV() {
		assertRomanValue(5, "V");
	}
	
	@Test
	public void test_ConvertToIntegerValueIV() {
		assertRomanValue(4, "IV");
	}
	
	@Test
	public void test_ConvertToIntegerValueX() {
		assertRomanValue(10, "X");
	}
	
	@Test
	public void test_ConvertToIntegerValueXI() {
		assertRomanValue(11, "XI");
	}
	
	@Test
	public void test_ConvertToIntegerValueXIII() {
		assertRomanValue(13, "XIII");
	}
	
	@Test
	public void test_ConvertToIntegerValueXV() {
		assertRomanValue(15, "XV");
	}
	
	@Test
	public void test_ConvertToIntegerValueL() {
		assertRomanValue(50, "L");
	}
	
	@Test
	public void test_ConvertToIntegerValueC() {
		assertRomanValue(100, "C");
	}
	
	@Test
	public void test_ConvertToIntegerValueD() {
		assertRomanValue(500, "D");
	}
	
	@Test
	public void test_ConvertToIntegerValueM() {
		assertRomanValue(1000, "M");
	}
	
	@Test
	public void test_ConvertToIntegerValueIX() {
		assertRomanValue(9, "IX");
	}
	
	@Test
	public void test_ConvertToIntegerValueMCMLXXXIV() {
		assertRomanValue(1984, "MCMLXXXIV");
	}
	
	@Test
	public void test_ConvertToIntegerInvalidRomanNumberABC() {
		assertRomanValue(-1, "ABC");
	}
	
	@Test
	public void test_ConvertToIntegerValueMMXIV() {
		assertRomanValue(2014, "MMXIV");
	}
	
	@Test
	public void test_ConvertToIntegerInvalidRomanNumberMMMM() {
		assertRomanValue(-1, "MMMM");
	}
	
	@Test
	public void test_ConvertToIntegerInvalidRomanNumberVVI() {
		assertRomanValue(-1, "VVI");
	}
	
	@Test
	public void test_ConvertToIntegerLowerCaseValueMCMLXXXIV() {
		assertRomanValue(1984, "mcmlxxxiv");
	}
	
	@Test
	public void test_ConvertToIntegerInvalidSubstractionXXC() {
		assertRomanValue(-1, "XXC");
	}
	
	private void assertRomanValue(int expected, String testValue) {
		int value = numerals.convertToInteger(testValue);
		assertEquals(expected, value);
	}

}
