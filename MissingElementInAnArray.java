package week3.day2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//int[] arr = {1,2,3,4,7,6,8};

import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,7,6,8};
		List<Integer> list=new ArrayList<Integer>();
		list.addAll(Arrays.asList(arr));
		System.out.println(list);
		Collections.sort(list);
		for(int i=4; i<list.size()-1; i++) {
		if (list.get(i)!= i+1) {
		System.out.print(i+1);
		break;
		}
		

	}

}
	
}	
 