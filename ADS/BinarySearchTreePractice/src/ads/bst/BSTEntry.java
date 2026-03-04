package ads.bst;

import java.util.LinkedList;
import java.util.List;

public class BSTEntry {
	public static void min(String[] args) {
		
		BinarySearchTreeClass bst = new BinarySearchTreeClass();
		
		bst.insert(bst.root, 10);
		bst.insert(bst.root, 10);

		
		List<Integer> list = new LinkedList<>();
		
		bst.inorderTraversal(bst.root, list);
		
		System.out.println(list);
		
		
	}
}
