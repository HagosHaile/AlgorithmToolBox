package ds.queue.impl;

class Queue {
	int items[];
	int front, rear;
	int capacity;

	Queue(int size) {
		items = new int[size];
		front = -1;
		rear = -1;
		capacity = size;
	}

	boolean isFull() {
		return (front == 0 && rear == capacity - 1) ? true : false;
		/*if (front == 0 && rear == SIZE - 1) {
			return true;
		}
		return false;*/
	}

	boolean isEmpty() {
		if (front == -1)
			return true;
		else
			return false;
	}

	void enQueue(int element) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			if (front == -1)
				front = 0;
			rear++;
			items[rear] = element;
			System.out.println("Inserted " + element);
		}
	}

	int deQueue() {
		int element;
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return (-1);
		} else {
			element = items[front];
			if (front >= rear) {
				front = -1;
				rear = -1;
			} /* Q has only one element, so we reset the queue after deleting it. */
			else {
				front++;
			}
			System.out.println("Deleted -> " + element);
			return (element);
		}
	}

	void display() {
		/* Function to display elements of Queue */
		int i;
		if (isEmpty()) {
			System.out.println("Empty Queue");
		} else {
			System.out.println("\nFront index-> " + front);
			System.out.println("Items -> ");
			for (i = front; i <= rear; i++)
				System.out.print(items[i] + "  ");

			System.out.println("\nRear index-> " + rear);
		}
	}

}
