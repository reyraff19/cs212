package LinkedLists;

public class ListNode<T> {

	private T data;
	private ListNode<T> next;

	public ListNode(T data, ListNode<T> next) {
		this.data = data;
		this.next = next;
	}

	public void setData(T data) {
		this.data = data;
	}

	public T getData() { // The return type is T because the data is of type T.
		return data;
	}

	public void setNext(ListNode<T> next) { // The parameter is a node of type T.
		this.next = next;
	}

	public ListNode<T> getNext() { // Returns a List Node of type T.
		return next;
	}

}
