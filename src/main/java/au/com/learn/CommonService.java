package au.com.learn;

import java.util.ArrayList;
import java.util.List;

public class CommonService {

	/**
	 * GIVEN A LIST OF INTEGERS ONLY RETURN THE ONES THAT ARE EVEN
	 * @param numbers
	 * @return
	 */
	public List<Integer> returnEvens(List<Integer> numbers) {
		List<Integer> evens = new ArrayList<>();

		return evens;
	}


	/**
	 * GIVEN A RANGE (START AND END ONLY) FIND ALL THE PRIMES AND RETURN THE LIST
	 * NOTE: USE THE isPrime METHOD AT THE BOTTOM OF THIS CLASS
	 * @param start
	 * @param end
	 * @return
	 */
	public List<Integer> returnPrimes(Integer start, Integer end) {
		List<Integer> primes = new ArrayList<>();

		return primes;
	}

	/**
	 * PRIME HELPER METHOD
	 * @param number
	 * @return
	 */
	static boolean isPrime(Integer number) {
		if (number <= 1) return false;    //  1 is not prime and also not composite

		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
