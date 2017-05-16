package customLinkedList;

public class LinkedList {

	// First element in list
	private ListNode head;
	// Size of list
	private int index = 0;

	/**
	 * Return Iterator to iterate elements in list
	 * @return
	 */
	public LinkedListIterator getIterator() {
		return new LinkedListIterator(head);
	}

	/**
	 * Add element in last position
	 * @param x
	 */
	public void add(Object x) {
		if (head == null) {
			head = new ListNode(x);
		}
		ListNode tempNode = new ListNode(x);
		ListNode currentNode = head;
		if (currentNode != null) {
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}

			currentNode.setNext(tempNode);
		}

		index++;
	}

	/**
	 * Remove all elements in list
	 */
	public void removeAll() {
		head.setElement(null);
		head.setNext(null);
	}

	/**
	 * Remove last element in list, return true if result is successful, otherwise is false
	 * @return
	 */
	public boolean removeLastElement() {
		if (head != null) {
			int count = 1;
			ListNode currentNode = head;
			while (head.getNext() != null) {
				currentNode = currentNode.getNext();
				if (count == (index - 1)) {
					currentNode.setNext(null);
					index--;

					return true;
				}

				count++;
			}
		}

		return false;
	}

}
