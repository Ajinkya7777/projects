package queue;

public class CustomQueue {
	private Node head;
	private Node tail;
	private int size;

	class Node {
		Node next;
		Object value;

		public Node(Object value) {
			this.value = value;
		}
	}

	public Object push(Object value) {
		Node newNode = new Node(value);
		Node temp = head;
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			while (temp != null) {
				temp = temp.next;
			}
			tail.next = newNode;
			tail = newNode;
		}
		size++;
		return tail.value;
	}

	public Object peek() {
		if (head == null) {
			return null;
		} else {
			return head.value;
		}
	}

	public Object poll() {
		Node temp = head;
		if (head == null) {
			return null;
		} else {
			head = head.next;
			Object obj = temp.value;
			temp = null;
			size--;
			return obj;
		}
	}

	public void print() {
		Node temp = head;
		while (temp.next != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println(temp.value);
	}

	public static void main(String[] args) {
		CustomQueue cq = new CustomQueue();
		cq.push(1);
		cq.push(2);
		cq.push(3);
		cq.push(4);
		cq.push(5);

		System.out.println("head=" + cq.head.value);
		System.out.println("tail=" + cq.tail.value);
		System.out.println("size=" + cq.size);
		System.out.println("------------------");

		cq.print();
		System.out.println("------------------");
		System.out.println("peek=" + cq.peek());
		cq.print();
		System.out.println("------------------");
		System.out.println("poll=" + cq.poll());
		System.out.println("size=" + cq.size);
		cq.print();
	}
}
