package lib1;

record Time(int hours, int mins, int seconds) {
	public int getTotalSeconds() {
		return this.hours * 3600 + this.mins * 60 + this.seconds;
	}
}

public class TestTimeRecord {

	public static void main(String[] args) {
		var t1 = new Time(10, 20, 30);
		var t2 = new Time(10, 20, 30);
		System.out.println(t1);
		System.out.println(t1.equals(t2));
		System.out.println(t1.hours());
		
		System.out.println(t1.getTotalSeconds());

	}

}
