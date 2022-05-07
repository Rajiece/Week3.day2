package week3.day2;

import java.util.Arrays;
import java.util.List;

public class ClassroomActivity {

	public static void main(String[] args) {
		
//List<Integer> list = new ArrayList(); 
	List<Integer> list = Arrays.asList(1,2,1,4,5,1,6);
System.out.println(list);

int count=0;
int size=list.size();
System.out.println(size);

	for(int i=0;i<size;i++) {
    if (i==1) {
    	count++;
	
}
	}
	System.out.println("Count 1 is " + count);

	}}
