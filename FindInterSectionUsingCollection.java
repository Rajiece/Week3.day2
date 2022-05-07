package week3.day2;

import java.util.HashSet;

///*
// * Pseudo Code
//
// * a) Declare An array for {3,2,11,4,6,7};	 
// * b) Declare another array for {1,2,8,4,9,7};
// * c) Declare for loop iterator from 0 to array length
// * d) Declare a nested for another array from 0 to array length
// * e) Compare Both the arrays using a condition statement
// 
// *  f) Print the first array (should match item in both arrays)

public class FindInterSectionUsingCollection 
        {

	public static void main(String[] args) 
	    {
        HashSet<Integer> set1 = new HashSet<Integer>();
        
        HashSet<Integer> set2 = new HashSet<Integer>();
        
        set1.add(3);
        set1.add(2);
        set1.add(11);
        set1.add(4);
        set1.add(6);
        set1.add(7);
        
        set2.add(1);
        set2.add(2);
        set2.add(8);
        set2.add(4);
        set2.add(9);
        set2.add(7);
        set1.retainAll(set2);
        System.out.println(set1);
        	
	}
	
	    }
	    
