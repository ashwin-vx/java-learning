package au.com.learn.controller;
import au.com.learn.PrimeRange;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {


	/**
	 * Create a REST endpoint (POST METHOD) and use the request body to enter the prime range
	 * @param range
	 * @return
	 */
	public ResponseEntity<List<Integer>> findPrimes(@RequestBody PrimeRange range) {
		return null;


	}

	/**
	 * Create a REST endpoint (POST METHOD) and use the request body to the string to be reversed
	 * @param inputString
	 * @return  reversed string
	 */

}
