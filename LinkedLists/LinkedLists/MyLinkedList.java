package LinkedLists;

public class MyLinkedList<T> {

	private ListNode<T> head; // Reference to the first list node. Without writing a constructor for it, head
								// is set to null.
	private int size; // Size of the linked list and without constructor, set to 0.

	public int size() {
		return size;
	}

	public T get(int index) { // Iterates through the linked list and gets the data in the last node by
								// current.getData().
		ListNode<T> current = head; // current references the same node head references to.
		for (int i = 0; i < index; i++) {
			current = current.getNext(); // current references the next node.
		}
		return current.getData(); // Looks at the data in the last node.
	}

	public void add(int index, T data) {
		if (index == 0) {
			ListNode<T> node = new ListNode<T>(data, head);
			head = node;
		} else {
			ListNode<T> current = head;
			for (int i = 0; i < index - 1; i++) {
				current = current.getNext();
			}
			ListNode<T> node = new ListNode<T>(data, current.getNext());
			current.setNext(node);
		}
		size++;
	}

	public void set(int index, T newData) {
		ListNode<T> current = head;
		for (int i = 0; i < index; i++) {
			current = current.getNext();
		}
		current.setData(newData);
	}

	public void remove(int index) {
		if (index == 0) {
			head = head.getNext();
		} else {
			ListNode<T> current = head;
			for (int i = 0; i < index - 1; i++) {
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());
		}
		size--;
	}

	public void addToEnd(T data) {
		ListNode<T> current = head;
		for (int i = 0; i < size - 1; i++) {
			current = current.getNext();
			if (i == size - 1) {
				ListNode<T> end = new ListNode<T>(data, current.getNext());
				current.setNext(end);
			}
		}
	}

	public String toString() {
		ListNode<T> current = head;
		String out = "[";
		while (current != null) {
			out += current.getData();
			if (current.getNext() != null) {
				out += ", ";
			}
			current = current.getNext();
		}
		out += "]";
		return out;
	}

}
