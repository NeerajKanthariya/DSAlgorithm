package neeraj.tree;

import java.util.Random;

public class BinaryTreeMain {

	public static void main(String[] args) {
		
		BinaryTree bTree = new BinaryTree();
		Random random = new Random();
		
		for(int i = 0 ; i < 20 ; i++) {
			bTree.add(random.nextInt(200));
		}
		
		bTree.traverseInOrder(bTree.getRoot());

	}

}
