package neeraj.tree;

public class BinaryTree {
	
	private Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	
	public void add(int data) {
		if(root == null) {
			root = new Node(data);
		}else {
			addRecursive(root, data);
		}
	}
	
	private void  addRecursive(Node current, int data) {
		
		if(data <= current.getData()) {
			
			if(current.getLeft() == null) {
				current.setLeft(new Node(data));
			}else {
				addRecursive(current.getLeft(), data);
			}
			
		}else {
			
			if(current.getRight() == null){
				current.setRight(new Node(data));
			}else {
				addRecursive(current.getRight(), data);
			}
		}
	}
	
	public void traverseInOrder(Node node) {
		if(node != null) {
			traverseInOrder(node.getLeft());
			System.out.println("=> " + node.getData());
			traverseInOrder(node.getRight());
		}
	}

}
