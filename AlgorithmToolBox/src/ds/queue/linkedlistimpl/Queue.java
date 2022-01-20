package ds.queue.linkedlistimpl;

public class Queue {

	Node rear;
	Node front;
	int size;

	public Queue() {
		rear = null;
		// front = null;
		size = 0;
	}

	public void enqueue(int data) {
		Node oldRear = rear;
		rear = new Node(data);
		rear.next = null;
		if (isEmpty()) {
			front = rear;
		} else {
			oldRear.next = rear;
		}
		size++;
	}
	
	public void dequeue() {
		if(front == null) {
			System.out.println("Queue is empty");
			return;
		}
		
		Node current = front.next;
		front = current;
		size--;
		
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void displayAll() {
		if (front == null) {
			System.out.println("Queue is empty");
			return;
		} else {
			System.out.print("list of all queue elements is: ");
			Node current = front;
			// System.out.print(current.data + " ");
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
		}

	}
}
