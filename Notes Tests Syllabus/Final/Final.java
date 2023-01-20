
public class Final {

    public void addToFront(T data) {
        ListNode<T> current = new ListNode(data, head);
        head = current;
        size++;
    }

    public boolean contains(T data) {
        ListNode<T> current = head;
        for (int i = 0; i < size; i++) {
            if (data.equals(current.getData())) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

}