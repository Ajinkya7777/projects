
package linkedlist;

public class DoublyLinkedList {
	public Node head;

	public static void main(String[] args) {

		DoublyLinkedList dl = new DoublyLinkedList();
		dl.insertAtBeg(1);
		dl.insertAtBeg(2);
		dl.insertAtEnd(4);
		dl.insertInBet(5, 4);
		 dl.insertAtBeg(0);

		 dl.deleteNode(2);
		dl.printList();

	}

	public void insertAtBeg(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}

	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			this.insertAtBeg(data);
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
		}

	}

	public void insertInBet(int data, int value) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.data != value && temp != null) {
				temp = temp.next;
			}

			newNode.next = temp.next;
			newNode.prev = temp;
			temp.next = newNode;
			if (newNode.next != null)
				temp.next.prev = newNode;

		}

	}

	public void deleteNode(int data) {
		if (head == null) {
			System.out.print("list is empty");
			return;
		} else {
			Node temp = head;
			while (temp.data != data && temp != null) {
				temp = temp.next;
			}
			if (temp == head) {
				temp.next.prev = null;
				head = temp.next;
			}
			temp.prev.next = temp.next;
			if (temp.next != null)
				temp.next.prev = temp.prev;
		}

	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	private class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}

	}

}