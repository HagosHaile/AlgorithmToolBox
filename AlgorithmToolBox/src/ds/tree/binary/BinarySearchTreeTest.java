package ds.tree.binary;

public class BinarySearchTreeTest {

	public static void main(String[] args) {
		Node node = new Node(2);
		node.insert(1);
		node.insert(3);
		
		System.out.println("In order traverse");
		node.printInOrderTraverse();
		
		System.out.println();
		System.out.println("pre order traverse");
		node.printPreOrderTraverse();
		
		System.out.println();
		System.out.println("Post order traverse");
		node.printPostOrderTraverse();
		

	}

}
