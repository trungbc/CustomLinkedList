package customLinkedList;

public class ListNode {

	private Object element;

	private ListNode next;

	public ListNode(Object theElement) {
		this(theElement, null);
	}

	public ListNode(Object theElement, ListNode n) {
		element = theElement;
		next = n;
	}

	public Object getElement() {
		return element;
	}

	public void setElement(Object element) {
		this.element = element;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

}
