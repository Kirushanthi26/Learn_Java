package basicJava;

public class WrapperExample_2 {

	public static void main(String[] args) {
		
		// Primitive to Wrapper
		int a=20;  
		Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
		  
		System.out.println(a+" "+i+" "+j);

		
		//Wrapper to Primitive
		Integer b = 3;    
		int k= b.intValue();//converting Integer to int explicitly  
		int z= b;//unboxing, now compiler will write a.intValue() internally    
		    
		System.out.println(b+" "+k+" "+z);    
	}

}
