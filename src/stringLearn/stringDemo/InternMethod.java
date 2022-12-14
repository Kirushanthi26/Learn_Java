package stringLearn.stringDemo;

public class InternMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// S1 refers to Object in the Heap Area
		String s1 = new String("GFG"); // Line-1

		// S2 refers to Object in String constant pool Area
		String s2 = s1.intern(); // Line-2

		// Comparing memory locations
		// s1 is in Heap
		// s2 is in SCP
		System.out.println(s1 == s2); // false (heap == SCP)

		// Comparing only values
		System.out.println(s1.equals(s2)); // true

		// S3 refers to Object in the String constant pool Area
		String s3 = "GFG"; // Line-3

		System.out.println(s2 == s3);

		/*
		 * Whenever we create a String Object, two objects will be created i.e. One in
		 * the Heap Area and One in the String constant pool and the String object
		 * reference always points to heap area object. When line-1 execute, it will
		 * create two objects and pointing to the heap area created object. Now when
		 * line-2 executes, it will refer to the object which is in the SCP. Again when
		 * line-3 executes, it refers to the same object which is in the SCP area
		 * because the content is already available in the SCP area. No need to create a
		 * new one object.
		 */
	}

}
