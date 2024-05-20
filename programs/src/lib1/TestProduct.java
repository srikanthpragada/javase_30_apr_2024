package lib1;

class Product {
	private String title;
	private int price;
	
	public Product(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	
}
public class TestProduct {

	public static void main(String[] args) {
		Product p1 = new Product("iPad Air", 50000);
		Product p2 = new Product("iPad Air", 50000);
		
		
		System.out.println(p1.toString());
		System.out.println(p1.equals(p2));

	}

}
