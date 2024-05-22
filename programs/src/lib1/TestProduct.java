package lib1;

class Product {
	private String title;
	private int price;

	public Product(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	@Override
	public String toString() {
		return this.title + " - " + this.price;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Product other) {
			return this.title.equals(other.title) && this.price == other.price;
		} else
			return false;
	}

	@Override
	public int hashCode() {
		return this.price;
	}
}

public class TestProduct {

	public static void main(String[] args) {
		Product p1 = new Product("iPad Air", 50000);
		Product p2 = new Product("iPad Air", 50000);

		System.out.println(p1.toString());
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals("Abc"));

	}

}
