package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};

public class PrintDuplicatesInArray {
		
		public static void main(String[] args) {
			
			ArrayList <Integer> list = new ArrayList <Integer>();
			list.add(14);
			list.add(12);
			list.add(13);
			list.add(11);
			list.add(15);
			list.add(14);
			list.add(18);
			list.add(16);
			list.add(17);
			list.add(19);
			list.add(18);
			list.add(17);
			list.add(20);
			
			Set <Integer> s= new HashSet<Integer>();
			
			for (Integer arr:list) {
				
			if (s.add(arr) == false)

				System.out.println(arr+ " is duplicated");

	
				}
			}
			
	}


