package basics;

public class FunsDemo {

	public static boolean isEven(int n) {
		return  n % 2 == 0;
	}
	
	public static void print(int ... values) {
		
		 for(int n : values)
			 System.out.println(n);
	}
	
	public static void main(String[] args) {
		  
		//System.out.println(isEven(10));
		
		print(10, 10);
		print(1,2,3,4);
		
	}

}
