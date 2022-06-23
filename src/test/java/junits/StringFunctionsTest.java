package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

public class StringFunctionsTest {
	
	@DisplayName("Positive Test")
	@Test
	public void Test1() {
		
		assertTrue(StringFunctions.isPalindrome("MADAM"));
	}
	
	@CustomAnnotation
	public void Test2() {
		
		assertFalse(StringFunctions.isPalindrome("Simran"));
	}
}
