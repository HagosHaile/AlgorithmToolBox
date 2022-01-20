package ds.queue.linkedlistimpl;

public class Queue {

	Node last;
	Node first;
	int size;

	public Queue() {
		last = null;
		// front = null;
		size = 0;
	}

	public void enqueue(int data) {
		Node oldRear = last;
		last = new Node(data);
		last.next = null;
		if (isEmpty()) {
			first = last;
		} else {
			oldRear.next = last;
		}
		size++;
	}
	
	public void dequeue() {
		if(first == null) {
			System.out.println("Queue is empty");
			return;
		}
		
		Node current = first.next;
		first = current;
		size--;
		
	}

	public boolean isEmpty() {
		return size == 0;
	}
	
	public int peek() {
		return first.data;
	}

	public void displayAll() {
		if (first == null) {
			System.out.println("Queue is empty");
			return;
		} else {
			System.out.print("list of all queue elements is: ");
			Node current = first;
			// System.out.print(current.data + " ");
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
		}

	}
}
