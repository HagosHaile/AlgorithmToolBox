package ds.stack.linkedlistimpl;

public class Stack {
	Node head;
	int size;
	
	public Stack() {
		head = null;
		size = 0;
	}
	
	public void push(int data) {
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
	
	public void pop() {
		if(head == null|| head.next == null) {
			head=null;
			return;
		}
		
		Node current = head;
		while(current.next != null) {
			if(current.next.next == null) {
				current.next = null;
				return;
			}
			current = current.next;
		}
		
	}
	
	public void peek() {
		if(head == null) {
			System.out.println("there is no peek element as stack is empty");
			return;
		}
		Node current = head;
		while(current.next != null) {
			if(current.next.next == null) {
				System.out.println("Peak value is "+ current.next.data);
				return;
			}
				
			current = current.next;
			
		}
		System.out.println("Peak value is "+ current.data);
	}
	
	
	public void displayAll() {
		if(head==null) {
			System.out.println("stack is empty");
			return;
		}
		else {
			System.out.print("list of all stack elements is: ");
			Node current = head;
			//System.out.print(current.data +  " ");
			while(current != null) {
				System.out.print(current.data +  " ");
				current = current.next;
			}
		}
		
	}

}
