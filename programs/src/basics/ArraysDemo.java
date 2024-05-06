package basics;



public class ArraysDemo {

	public static void main(String[] args) {
		 int a [] = {2,4,5,10,20,25};
		 
		 for(int i = 0; i < a.length; i ++)
			 System.out.println(a[i]);
		 
		 for(int n : a)
			 System.out.println(n);
	}

}
