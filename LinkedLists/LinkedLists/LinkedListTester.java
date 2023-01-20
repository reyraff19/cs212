package LinkedLists;

public class LinkedListTester {

	public static void main(String[] args) {
		MyLinkedList<String> list = new MyLinkedList<String>();
		list.add(0, "sample string");
		System.out.println(list);
		list.add(1, "ending string");
		System.out.println(list);
		list.add(0, "before string");
		System.out.println(list);
		list.add(2, "inbetween string");
		System.out.println(list);
		list.set(1, "changed string");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		list.addToEnd("end string");
		System.out.println(list);
	}

}
