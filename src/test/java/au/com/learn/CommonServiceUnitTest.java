package au.com.learn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommonServiceUnitTest {
	CommonService commonService;

	@BeforeEach
	void setup() {
		commonService = new CommonService();
	}

	@Test
	@DisplayName("Test Primes")
	void testPrimes() {
		assertTrue(commonService.returnPrimes(100, 200).size() == 21);
		assertTrue(commonService.returnPrimes(100, 200).contains(149));
		assertTrue(commonService.returnPrimes(100, 200).contains(167));
	}
}
