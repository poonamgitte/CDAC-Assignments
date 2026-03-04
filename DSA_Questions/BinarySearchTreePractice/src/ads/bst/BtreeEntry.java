package ads.bst;

public class BtreeEntry {
	public static void main(String[] args) {
		
		Btree bt = new Btree();
		
		bt.insert(10);
		bt.insert(20);

		bt.insert(30);

		bt.insert(40);

		bt.insert(50);

		
		bt.inorder(bt.root);
	}
}
