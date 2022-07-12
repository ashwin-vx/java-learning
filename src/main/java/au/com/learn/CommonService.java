package au.com.learn;

import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Service
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
		IntStream s= IntStream.rangeClosed(start, end);
		primes = s.filter(CommonService::isPrime).boxed().collect(Collectors.toList());



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
