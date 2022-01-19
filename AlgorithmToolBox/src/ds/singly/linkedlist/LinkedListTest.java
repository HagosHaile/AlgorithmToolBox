package ds.singly.linkedlist;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		System.out.println("List after all elements appended");
		LinkedList.printList(list);
		list.insert(1, 9);
		System.out.println("\nList after 9 inserted at postion 1");
		LinkedList.printList(list);
		
	}

}
