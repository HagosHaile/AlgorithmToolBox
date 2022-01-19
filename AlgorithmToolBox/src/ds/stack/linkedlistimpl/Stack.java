package ds.stack.linkedlistimpl;

public class Stack {
	Node top;
	int size;
	
	public Stack() {
		top = null;
		size = 0;
	}
	
	public void push(int data) {
		if(top == null) {
			top = new Node(data);
			size++;
			return;
		}
		Node current = new Node(data);
		current.next = top;
		top = current;
		size++;	
	}
	
	public void pop() {
		if(top == null) {
			return;
		}
		
		top = top.next;
		
	}
	
	public void peek() {
		if(top == null) {
			System.out.println("there is no peek element as stack is empty");
			return;
		}
		System.out.println("Peak value is "+ top.data);
	}
	
	
	public void displayAll() {
		if(top==null) {
			System.out.println("stack is empty");
			return;
		}
		else {
			System.out.print("list of all stack elements is: ");
			Node current = top;
			//System.out.print(current.data +  " ");
			while(current != null) {
				System.out.print(current.data +  " ");
				current = current.next;
			}
		}
		
	}

}
