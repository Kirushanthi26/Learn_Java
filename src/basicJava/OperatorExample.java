package basicJava;

public class OperatorExample {

	public static void main(String[] args) {

		int i = 10;
		int j = 20;

		int a = i++; // print then increase
		int b = ++j; // increase then print

		System.out.println(a + " " + b);

		System.out.println(10 % 5);// 0
		System.out.println(10 % 3);// 1

		int k = 12;
		System.out.println(k += 3); // k = k+3 = 15
		
		System.out.println(i<j); //true
		
		System.out.println(true && (2+2 == 4));
		
		System.out.println(2<4 ? "this is true" :"this is false");
		System.out.println("-------------------------------------------");
		
		System.out.println(10/3);
		System.out.println((double)10/3);
		
		System.out.println("-------------------------------------------");

	}

}
