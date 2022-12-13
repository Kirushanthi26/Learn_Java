package basicJava.moreExample;

public class LoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=========== for loop");
		for (int i = 0; i < 5; i++) {
			System.out.print(i + " ");

		}
		System.out.println();
		
		System.out.println("=========== do-while loop");
		int counter = 0;
		do {
			System.out.print(counter++ + " ");
		} while (counter < 5);
		
		System.out.println();
		
		System.out.println("=========== while loop");
		int counters = 0;
		while (counters < 5) {
			System.out.print( counters++ + " ");
		}
		
		
		System.out.println();
		System.out.println("=========== foreach loop");
		int[] arr = {1, 2, 3};
		int sum = 0;
		for (int number : arr) {
			sum += number;
			System.out.println("Number: " + number);
		}
		System.out.println("Sum: " + sum);
		
		System.out.println("-------------------------------------------------");
		System.out.println("=========== labels");
		loop1: for (int i = 0; i < 5; i++) {
				System.out.println("counter i: " + i);
			loop2: for (int j = 0; j < 5; j++) {
					System.out.println("counter j: " + j);
						if (j >= 0 && j < 3) {
							System.out.println("continue loop2");
							continue loop2;
						} else {
							System.out.println("break loop1");
							break loop1;
						}
					}
		}
	}

}
