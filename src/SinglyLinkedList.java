public class SinglyLinkedList {

	public Node head;
	
	public Node append(int d){
		Node n = new Node(d);
		
		if(head==null){
			head = n;
		} else {
			Node tmp = head;
			while(tmp.next != null){
				tmp = tmp.next;
			}
			tmp.next = n;
		}
		return head;
	}
	
	public Node removeTail(){
		if(head==null){
			return null;
		} else if(head.next==null){
			head = null;
		} else {
			Node tmp = head;
			while(tmp.next.next != null){
				tmp = tmp.next;
			}
			tmp.next = null;
		}
		return head;
	}
	
	public Node removeNodesGreaterThan(int x) {
		head=removeNodesGreaterThan(head,x);
		return head;
	}

	private Node removeNodesGreaterThan(Node h, int x) {
		if(h==null) 
			return null;
		h.next = removeNodesGreaterThan(h.next,x);
		return (h.data>x)?h.next:h;
	}
	
	public void printList() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		Node current = head;
		while(current!=null) {
			System.out.print(current.data +(current.next==null?"":"->")); 
			current =current.next;
		}
		System.out.println(); 
	}
}