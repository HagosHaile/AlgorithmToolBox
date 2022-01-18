package ds.doubly.linkedlist;

public class LinkedList {
	Node head;
	Node tail;
	int size;
	
	public boolean isEmpty() {
		return head==null;
	}
	
	// used to insert a node at the start of linked list
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        newNode.prev=null;
        if(head!=null)
            head.prev=newNode;
        head = newNode;
        if(tail==null)
            tail=newNode;
        size++;
    }
    
 // used to delete node from start of Doubly linked list
    public Node deleteFirst() {
 
        if (size == 0) 
            throw new RuntimeException("Doubly linked list is already empty");
        Node temp = head;
        head = head.next;
        head.prev = null;
        size--;
        return temp;
    }
    
 // used to delete node from last of Doubly linked list
    public Node deleteLast() {
 
        Node temp = tail;
        tail = tail.prev;
        tail.next=null;
        size--;
        return temp;
    }
    
 // Use to delete node after particular node
    public void deleteAfter(Node after) {
        Node temp = head;
        while (temp.next != null && temp.data != after.data) {
            temp = temp.next;
        }
        if (temp.next != null)
            temp.next.next.prev=temp;
        temp.next = temp.next.next;
 
    }
    
 // For printing Doubly Linked List forward
    public void printLinkedListForward() {
        System.out.println("Printing Doubly LinkedList (head --> tail) ");
        Node current = head;
        while (current != null) {
            current.displayNodeData();
            current = current.next;
        }
        System.out.println();
    }
    
 // For printing Doubly Linked List forward
    public void printLinkedListBackward() {
        System.out.println("Printing Doubly LinkedList (tail --> head) ");
        Node current = tail;
        while (current != null) {
            current.displayNodeData();
            current = current.prev;
        }
        System.out.println();
    }
}
