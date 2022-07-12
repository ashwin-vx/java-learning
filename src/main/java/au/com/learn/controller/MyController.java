package au.com.learn.controller;
import au.com.learn.CommonService;
import au.com.learn.PrimeRange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

	@Autowired
	CommonService commonService;


	@PostMapping("/primes")
	public ResponseEntity<List<Integer>> findPrimes(@RequestBody PrimeRange range) {
		List<Integer> l = commonService.returnPrimes(range.getStart(), range.getEnd());
		return ResponseEntity.ok(l);


	}
}
