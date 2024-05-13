package oop1;

class Stack {
	private int data[] = new int[5];
	private int pos = 0;

	public void push(int value) {
		this.data[this.pos] = value;
		this.pos++;
	}

	public int pop() {
		this.pos--;
		return this.data[this.pos];
	}

	public int peek() {
		return this.data[this.pos - 1];
	}

	public int length() {
		return this.pos;
	}
}

public class TestStack {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);

		System.out.println(s.length());
		System.out.println(s.peek());
		System.out.println(s.pop());

		System.out.println(s.length());
		System.out.println(s.pop());
	}

}
