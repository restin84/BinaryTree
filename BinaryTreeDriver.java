
public class BinaryTreeDriver {

	public static void main(String[] args) {
		BinaryTree testTree = new BinaryTree(new IntNode(null, null, 25));
		testTree.insert(15);
		testTree.insert(10);
		testTree.insert(4);
		testTree.insert(12);
		testTree.insert(22);
		testTree.insert(18);
		testTree.insert(24);
		testTree.insert(50);
		testTree.insert(35);
		testTree.insert(31);
		testTree.insert(44);
		testTree.insert(70);
		testTree.insert(66);
		testTree.insert(90);
		testTree.InOrderPrint();
		System.out.println();
		testTree.PreOrderPrint();
	}

}
