package stringLearn;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-------trim() ---------");
		String s1="  hello string   ";  
		System.out.println(s1+"javatpoint");//without trim()  
		System.out.println(s1.trim()+"javatpoint");//with trim()  
		
		System.out.println("-------split() ---------");
		String s2="java string split method by javatpoint";  
		String[] words=s2.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.println(w);  
		} 
		System.out.println("-------join() ---------");
		String joinString1=String.join("-","welcome","to","javatpoint");  
		System.out.println(joinString1); 
		
		System.out.println("-------valueOf() ---------");
		int value=30;  
		String s3=String.valueOf(value);  
		System.out.println(s3+10);
		
		System.out.println("------------compareTo()------------");
		String k1="hello";  
		String k2="";  
		String k3="me";  
		String k4 ="me";
		System.out.println(k1.compareTo(k2));  
		System.out.println(k2.compareTo(k3));  
		System.out.println(k3.compareTo(k4));  
		System.out.println("------------compareTo()------------");
		System.out.println("------------compareTo()------------");
		
	}

}
