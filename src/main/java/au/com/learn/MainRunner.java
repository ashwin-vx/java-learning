package au.com.learn;

import java.util.Arrays;
import java.util.List;

public class MainRunner {

	public static void main(String[] args) {
		StringUtilityService one = new StringUtilityService();
		CommonService two = new CommonService();

		List<Integer> l = two.returnPrimes(100, 200);
		System.out.println(l.size());
	}
}
