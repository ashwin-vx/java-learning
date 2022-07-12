package au.com.learn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilityServiceUnitTest {

	StringUtilityService stringUtilityService;

	@BeforeEach
	void setup() {
		stringUtilityService = new StringUtilityService();
	}

	@Test
	@DisplayName("Reverse String of Simple String")
	void testReverse() {
		assertEquals("gnirtS", stringUtilityService.reverse("String"), "String should gnitrS on reverse");
	}


	@Test
	@DisplayName("Check Palindrom")
	void testPalindrome() {
		assertTrue(stringUtilityService.checkPalindrome("madam"), "Madam is a palindrome");
	}




}
