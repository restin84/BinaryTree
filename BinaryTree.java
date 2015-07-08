
public class BinaryTree {
	private IntNode root = null;
	
	public BinaryTree(IntNode root) {
		this.root = root;
	}
	
	public void insert(int newData) {
		Insert(root, newData);
	}
	
	public IntNode Insert(IntNode rootNode, int newData) {
		if(rootNode == null) {
			rootNode = new IntNode(null, null, newData);
			return rootNode;
		}
		else {
			if(newData <= rootNode.getData()) {
				rootNode.setLeftChild(Insert(rootNode.getLeftChild(),newData));
			}
			else {
				rootNode.setRightChild(Insert(rootNode.getRightChild(), newData));
			}
		}
		return rootNode;
	}
	
	public void InOrderPrint() {
		InOrderPrint(root);
	}
	
	public void InOrderPrint(IntNode rootNode) {
		if(rootNode != null) {
			InOrderPrint(rootNode.getLeftChild());
			System.out.println(rootNode.getData());
			InOrderPrint(rootNode.getRightChild());
		}
		return;
	}
	
	public void PreOrderPrint() {
		PreOrderPrint(root);
	}
	
	public void PreOrderPrint(IntNode rootNode) {
		if(rootNode != null) {
			System.out.println(rootNode.getData());
			PreOrderPrint(rootNode.getLeftChild());
			PreOrderPrint(rootNode.getRightChild());
		}
		return;
	}
	
	public void PostOrderPrint() {
		PostOrderPrint(root);
	}
	
	public void PostOrderPrint(IntNode rootNode) {
		if(rootNode != null) {
			PostOrderPrint(rootNode.getLeftChild());
			PostOrderPrint(rootNode.getRightChild());
			System.out.println();
		}
		return;
	}
}
