
public class IntNode{
	private IntNode leftChild;
	private IntNode rightChild;
	private int data;
	
	public IntNode(IntNode leftChild, IntNode rightChild, int data) {
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.data = data;
	}
	
	public IntNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(IntNode leftChild) {
		this.leftChild = leftChild;
	}

	public IntNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(IntNode rightChild) {
		this.rightChild = rightChild;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
