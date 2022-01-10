package ds.circularqueue.impl;

public class CircularQueueImpl {
	/*
	 * The most common queue implementation is using arrays, 
	 * but it can also be
	 * implemented using lists.
	 */
	public static void main(String[] args) {
		CircularQueue q = new CircularQueue();

	    // Fails because front = -1
	    q.deQueue();

	    q.enQueue(1);
	    q.enQueue(2);
	    q.enQueue(3);
	    q.enQueue(4);
	    q.enQueue(5);

	    // Fails to enqueue because front == 0 && rear == SIZE - 1
	    q.enQueue(6);

	    q.display();

	    int elem = q.deQueue();

	    if (elem != -1) {
	      System.out.println("Deleted Element is " + elem);
	    }
	    q.display();

	    q.enQueue(7);

	    q.display();

	    // Fails to enqueue because front == rear + 1
	    q.enQueue(8);

	}

}
