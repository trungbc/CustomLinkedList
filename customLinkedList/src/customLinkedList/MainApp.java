package customLinkedList;

public class MainApp {

	public static void main(String[] args) {
		LinkedList theList = new LinkedList();
		for (int i = 0; i < 10; i++) {
			theList.add(new Integer(i));
		}
		//Print all elements in list
		printList(theList);
		//Remove last element in list
		theList.removeLastElement();
		printList(theList);
		//Remove all elements in list
		theList.removeAll();
		printList(theList);
	}

	/**
	 * Print elements in list
	 * @param theList
	 */
	private static void printList(LinkedList theList) {
		LinkedListIterator iterator = theList.getIterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		
		System.out.println("");
	}

}
