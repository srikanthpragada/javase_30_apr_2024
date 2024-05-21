package lib1;

public class SumOfNums {

	public static void main(String[] args) {
		 String data = "90-34-88-78";
		 
		 String nums[] = data.split("-");
		 
		 int total = 0;
		 
		 for(String n : nums) {
			 total += Integer.parseInt(n);
		 }
		 
		 System.out.println(total);

	}

}
