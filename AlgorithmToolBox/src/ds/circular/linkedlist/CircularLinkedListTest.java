package ds.circular.linkedlist;

public class CircularLinkedListTest {

	public static void main(String[] args) {
		CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insert(5);
        circularLinkedList.insert(10);
        circularLinkedList.insert(15);
        circularLinkedList.insert(20);
        circularLinkedList.insert(25);
        circularLinkedList.insert(30);

        System.out.println("Going to traverse the list");
        circularLinkedList.traverse();
        System.out.println();

        System.out.println("Delete 15 from the list");
        circularLinkedList.delete(15);

        System.out.println("Going to traverse the list after deletion ");
        circularLinkedList.traverse();
        System.out.println();

        System.out.println("Going to search 20 in the list");
        System.out.print(circularLinkedList.search(20));

	}

}
