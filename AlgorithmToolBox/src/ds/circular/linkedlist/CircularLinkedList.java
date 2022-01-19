package ds.circular.linkedlist;

public class CircularLinkedList {
	Node head;
	Node tail;
	Node next;
	
	/*
	 * The insertion can be at head or tail. If the node to be inserted is the first
	 * node i.e. head is null then we make this node as head and tail node and it
	 * internally points to itself fulfilling the condition of a circular linked
	 * list.
	 * 
	 * Else, the new node is inserted just after the tail node and before the head
	 * node and this new node will point to the head node.
	 * time complexity is O(1)
	 */
	public void insert(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
		}
		else {
			tail.next = newNode;
		}
		
		tail = newNode;
		tail.next = head;
		
	}
	// time complexity is O(n)
	public boolean search(int data){
		if(head==null) {
			return false;
		}
		
		Node current = head;
		while(current.next != head) {
			if(current.data == data)
				return true;
			current = current.next;
		}
		return false;
		
	}
	
	/*
	 * Delete operation can be either deleting the head node or deleting any other
	 * nodes. The head node can be deleted by marking the next node of previous head
	 * node as current head node and replacing the next node of tail node with the
	 * current head node.
	 * time complexity is O(n)
	 */
	
	public void delete(int data) {
		Node current = head;
		if(head != null) {
			if(current.data == data) {
				head = current.next;
				tail = head.next;
			}
			else {
				while(current.next != head) {
					if(current.next.data == data) {
						current.next = current.next.next;
						tail.next = head;
						
						return;
						
					}
					
					current = current.next;
					
				}
			}
		}
		
	}
	
	
	public void traverse() {
		if(head == null) {
			System.out.println("linked list is empty");
			return;
		}
		
		if(head !=null) {
			Node current = head;
			int i = 0;
			System.out.println(i + ": "+ current.data);
			
			while(current.next != head) {
				current = current.next;
				i++;
				System.out.println(i+": "+ current.data);
			}
			
		}
		
		
	}
	
}
