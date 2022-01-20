package ds.queue.linkedlistimpl;

public class QueueLinkedListTest {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		System.out.println("peek value is "+ q.peek());
		q.dequeue();
		System.out.println("peek value is "+ q.peek());
		q.displayAll();

	}

}
