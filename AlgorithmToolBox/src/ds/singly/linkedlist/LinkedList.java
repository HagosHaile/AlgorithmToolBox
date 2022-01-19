package ds.singly.linkedlist;

//Java program to implement
//a Singly Linked List
public class LinkedList {
	Node head;
	public void append(int data) {
		if(head == null) {
			head = new Node(data);
			return;
		}
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
	}
	
	public void prepend(int data) {
		Node newHead = new Node(data);
		newHead.next=head;
		head = newHead;
	}
	
	public void insert(int index, int data) {
		int i=0;
		Node current = head;
		while(i<index-1) {
			current = current.next;
			i++;
			
		}
		Node newNode= new Node(data);
		newNode.next = current.next;
		current.next = newNode;
		
	}
	
	public void deleteWithValue(int data) {
		if(head == null) return;
		if(head.data == data) {
			head = head.next;
			return;
		}
		Node current = head;
		while(current.next != null) {
			if(current.next.data==data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
		
	}
	 public static void printList(LinkedList list)
	    {
	        Node currNode = list.head;
	    
	        System.out.print("LinkedList: ");
	    
	        // Traverse through the LinkedList
	        while (currNode != null) {
	            // Print the data at current node
	            System.out.print(currNode.data + " ");
	    
	            // Go to next node
	            currNode = currNode.next;
	        }
	    }
	
}