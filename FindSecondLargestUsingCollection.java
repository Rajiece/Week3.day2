package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

////Here is the input
//		int[] data = {3,2,11,4,6,7};
		

public class FindSecondLargestUsingCollection {
	
	public static void main(String[] args) {
	
		Integer[] data = {3,2,11,4,6,7};
		List <Integer> asList = Arrays.asList(data);
		Collections.sort(asList);
		System.out.println(asList);
		int size = asList.size()-2;
		System.out.println(asList.get(size));

	}

}
