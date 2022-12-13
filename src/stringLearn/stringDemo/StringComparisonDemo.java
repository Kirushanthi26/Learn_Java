package stringLearn.stringDemo;

public class StringComparisonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " hello ";
		String s2 = " hello ";
		System.out.println("s == s2: " + (s == s2));// true - same obj ref address

		String s3 = new String(" hello "); //force the java to create new string ref address
		System.out.println("s == s3: " + (s == s3));// false
		System.out.println("s.equals(s3): " + s.equals(s3));// true - value check 
		
		System.out.println("s == s3.intern(): " + (s == s3.intern())); // true - SCP

		String firstName = "Kiru";
		String firstName2 = "kiru";
		System.out.println("firstName.equals(firstName2): " + firstName.equals(firstName2)); // false
		System.out.println("firstName.equalsIgnoreCase(firstName2): " + firstName.equalsIgnoreCase(firstName2));
	}

}
