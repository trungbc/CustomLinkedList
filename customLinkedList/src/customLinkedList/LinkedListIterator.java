package customLinkedList;

public class LinkedListIterator {

	private ListNode current = new ListNode(null);

	LinkedListIterator(ListNode theNode) {
		current = theNode;
	}

	public boolean hasNext() {
		return current.getNext() != null;
	}

	public Object next() {
		if (hasNext()) {
			current = current.getNext();
		}

		return current.getElement();
	}

}
