package basicJava;

import java.util.Arrays;

public class MathClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ctrl+shift+t
		//ctrl+o
		
		System.out.println(Math.PI);
		System.out.println(Math.max(25, 66));
		System.out.println(Math.sqrt(4));
		System.out.println((int)(Math.random()*100)+100); //100-200
		System.out.println();
		int a = 5+5; 
		//int a = 5+5;  - statement 
		//5+5 - expression
		
		Integer i = 128;
		Integer i2 = 128;
		System.out.println("i == i2: " + (i == i2));// false
		//you get same reference if value is between (-128 to 127 -> true) and (>127) -> false 
		System.out.println("i.equals(i2): " + i.equals(i2));
		System.out.println();
		
		Integer i3 = 127;
		Integer i4 = 127;
		System.out.println("i3 == i4: " + (i3 == i4));	// true
		//you get same reference if value is between (-128 to 127 -> true) - Integer pool
		System.out.println();
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};
		System.out.println("Arrays.equals(arr1, arr2): " + Arrays.equals(arr1, arr2));
	}

}
