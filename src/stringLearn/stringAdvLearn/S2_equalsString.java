package stringLearn.stringAdvLearn;

public class S2_equalsString {

	public static void main(String[] args) {
		 // == vs equals 
		 
		 /*
		  * == -> primitive datatype value compare or obj ref address 
		  * equals() -> 2 obj value compare 
		  */
		
		String s1 = new String("Java"); //heap
		String s2 = "Java"; //SCP
		
		if(s1 == s2) {
			System.out.println("==");
		}else {
			System.out.println("not ==");
		}
		
		if(s1.equals(s2)) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");
		}
		
		System.out.println("--------------------------------------------------");
		String s3 = s1; //SCP
		
		if(s1 == s3) {
			System.out.println("==");
		}else {
			System.out.println("not ==");
		}
		
		if(s1.equals(s3)) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");
		}
		System.out.println("--------------------------------------------------");
	
	}

}
