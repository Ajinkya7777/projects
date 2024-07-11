package stack;

import java.util.Arrays;

public class CustomStack {
	int[] stack;
	int first;
	int last;
	int index = 0;

	public CustomStack() {
		stack = new int[10];
	}

	public CustomStack(int size) {
		stack = new int[size];
	}

	public void push(int no) {
		if (index < stack.length && index >= 0) {
			stack[index] = no;
			index++;
		} else {
			stack = Arrays.copyOf(stack, stack.length + 1);
			stack[index] = no;
			index++;
		}
	}

	public int pop() throws Exception {
		if (index <	 0) {
			System.arraycopy(stack, 0, stack, first, stack.length - 1);
			return (int) stack[stack.length - 1];
		} else {
			throw new Exception("no element in stack");
		}
	}

	public void peek() {
		System.out.println(stack[stack.length - 1]);
	}

	public void print() {
		for (int i = 0; i < stack.length; i++) {
			System.out.println(i + "-" + stack[i]);
		}
	}

	public static void main(String[] args) {
		CustomStack custom = new CustomStack();
		custom.push(1);
		custom.push(30);
		custom.push(30);
		custom.push(30);
		custom.push(30);
		custom.push(30);
		custom.push(30);
		custom.push(30);
		custom.push(30);
		custom.push(30);
		custom.push(30);
		custom.push(40);
		custom.push(50);

		custom.print();
		System.out.println("---------------------");
		custom.peek();
		System.out.println("---------------------");

	}
}
