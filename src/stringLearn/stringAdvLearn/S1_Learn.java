package stringLearn.stringAdvLearn;

public class S1_Learn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("kiru"); // store in heap 
		
		String s2 = "kiru"; // store in SCP (inside of heap contains SCP)
		//literal values stores in SCP 
		
		
		//Immutable String
		String k1 = "kiru";
		 k1 = "kirushanthi";
		 /*
		  * kiru is not replace or edit by kirushanthi. 
		  * kirushanthi obj create new and k1 point out that obj 
		  * kiru is stay in the memory 
		  * garbage collector will remove that kiru obj in the future 
		  */
		 
	}

}
