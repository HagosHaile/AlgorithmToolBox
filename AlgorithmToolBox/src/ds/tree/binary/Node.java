package ds.tree.binary;

public class Node {
	Node left, right;
	int data;
	
	public Node(int data) {
		this.data = data;
		
	}
	
	public void insert(int value) {
		if(value <= data) {
			if(left == null) {
				left = new Node(value);
			}
			
			else {
				left.insert(value);
			}
			
		}
		
		else {
			if(right==null) {
				right = new Node(value);
			}
			else {
				right.insert(value);
			}
		}
		
	}
	
	public void delete(int value) {
		
	}
	
	public boolean contains(int value) {
		if(value == data) {
			return true;
		}
		else if(value < data) {
			if(left == null) {
				return false;
			}
			else {
				return left.contains(value);
			}
		}
		else {
			if(right == null) {
				return false;
			}
			else {
				return left.contains(value);
			}
		}
		
	}
	
	public void printInOrderTraverse() {
		if(left != null) {
			left.printInOrderTraverse();
		}
		System.out.print(data + " ");
		if(right != null) {
			right.printInOrderTraverse();
		}
	}
	
	public void printPreOrderTraverse() {
		System.out.print(data + " ");
		if(left != null) {
			left.printInOrderTraverse();
		}
		if(right != null) {
			right.printInOrderTraverse();
		}
	}
	
	public void printPostOrderTraverse() {
		if(left != null) {
			left.printInOrderTraverse();
		}
		if(right != null) {
			right.printInOrderTraverse();
		}
		System.out.print(data + " ");
	}
	

}
