
public class Test {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.append(5);
		list.append(15);
		list.append(23);
		list.printList();
		
		list.removeTail();
		list.printList();
		
		list.append(58);
		list.append(1);
		list.append(2);
		list.removeTail();
		list.printList();
		
		list.removeNodesGreaterThan(4);
		list.printList();
		
		list.removeTail();
		list.printList();
	}

}
