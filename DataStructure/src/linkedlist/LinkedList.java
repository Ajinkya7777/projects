package linkedlist;

public class LinkedList {

	private Node head;
	private Node tail;
	private int length;

	public LinkedList(Object obj) {
		Node newNode = new Node(obj);
		head = newNode;
		tail = newNode;
		length++;

	}

	public LinkedList() {

	}

	class Node {
		Object value;
		Node next;

		public Node(Object value) {
			this.value = value;
		}
	}

	public void append(Object obj) {
		Node newNode = new Node(obj);
		Node temp = head;
		if (head == null) {
			head = newNode;
			tail = newNode;
			length++;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			temp = newNode;
			tail = temp;
			length++;
		}

	}

	public void prePend(Object obj) {
		Node newNode = new Node(obj);
		Node temp = head;
		if (head == null) {
			head = newNode;
			tail = newNode;
			length++;
		} else {
			newNode.next = head;
			head = newNode;
			length++;
		}
	}

	public Node removeFirst() {
		Node temp = head;
		if (head == null) {
			return null;
		} else if (length == 1) {
			head = null;
			tail = null;
			length--;
			return temp;
		} else {
			head = head.next;
			length--;
			return temp;
		}
	}

	public Node removeLast() {
		Node temp = head;
		Node pre = head;
		if (head == null) {
			return null;
		} else if (head.next == null) {
			head = null;
			tail = null;
			length--;
			return temp;
		} else {
			while (temp.next != null) {
				pre = temp;
				temp = temp.next;
			}
			tail = pre;
			tail.next = null;
			length--;
			return temp;

		}
	}

	public Node get(Object index) {
		Node temp = head;
		int in = (int) index;
		if (in <= 0 || in > length) {
			return null;
		} else {

			for (int i = 1; i <= length; i++) {
				if (i == in) {
					return temp;
				} else {
					temp = temp.next;
				}
			}
			return null;
		}

	}

	public boolean set(Object index, Object value) {

		int in = (int) index;
		if (in < 0 || in > length) {
			return false;
		} else {

			Node node = this.get(index);
			node.value = value;
			return true;
		}

	}

	public void reverse() { // imp
		if (head == null) {
			System.out.println("Empty List ");
		} else if (head.next == null) {
			System.out.println(head.value);
		} else {
			Node temp = head;
			head = tail;
			tail = temp;
			Node before = null;
			Node after = temp.next;
			for (int i = 1; i <= length; i++) {

				after = temp.next;
				temp.next = before;
				before = temp;
				temp = after;

			}
		}

	}

	public void insert(Object obj, Object index) {
		int in = (int) index;
		Node temp = head;
		Node newNode = new Node(obj);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			for (int i = 1; i <= length; i++) {
				if (in == i) {
					Node temp1 = temp.next;
					temp.next = newNode;
					newNode.next = temp1;
				}
				temp = temp.next;
			}
		}
		length++;
	}

	public Node remove(Object index) {

		if ((int) index <= 0 || (int) index > length)
			return null;
		if ((int) index == 1)
			return removeFirst();
		if ((int) index == length)
			return removeLast();

		Node prev = this.get((int) index - 1);
		Node temp = prev.next;

		prev.next = temp.next;
		temp.next = null;
		length--;
		return temp;

	}

	public void print() {
		Node temp = head;
		if (head == null) {
			System.out.println("Linked List is empty");
		} else {
			while (temp.next != null) {
				System.out.println(temp.value);
				temp = temp.next;
			}
			System.out.println(temp.value);
		}
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList(1);
//			LinkedList ll = new LinkedList();
		ll.append(2);
		ll.append(3);
		ll.prePend(0);
		ll.print();

		System.out.println("--------");

		// System.out.println("Removed first element :" + ll.removeFirst().value);

		System.out.println("--------");

		// System.out.println("Removed last element :" + ll.removeLast().value);

		System.out.println("--------");

		System.out.println("Get the element  :" + ll.get(4).value);

		System.out.println("--------");

		System.out.println("Set the element  :" + ll.set(4, 50));

		System.out.println("--------");
		System.out.println("--------");

		ll.reverse();
		System.out.println("After reverse :");
		ll.print();

		System.out.println("--------");

		ll.insert(60, 3);
		ll.print();
		System.out.println("--------");

		System.out.println("Removed element  :" + ll.remove(1).value);

		System.out.println("--------");
		System.out.println("Head :" + ll.head.value);
		System.out.println("Tail :" + ll.tail.value);
		System.out.println("Length:" + ll.length);

	}
}
