package Set;

public class TreeSet<E> implements Set<E>{
	Node<E> mainNode;
	
	@Override
	public boolean add(E e) {
		if(mainNode == null){
			mainNode = new Node<E>();
			mainNode.setValue(e);
		}
		else {
			Node<E> nowNode = mainNode;
			Node<E> subNode = new Node<E>();
			Node<E> newNode = null;
			int tmp = 0;
			while(!(subNode == null)){
				tmp = e.toString().compareTo(nowNode.getValue().toString());
				if(tmp == 0){
					return false;
				}
				else if(tmp == 1){
					subNode = nowNode.getRight();
				}
				else if(tmp == -1){
					subNode = nowNode.getLeft();
				}
				if(subNode != null)
					nowNode = subNode;
			}
			if(tmp == 1){
				nowNode.setRight(new Node<E>(e));
			}
			else if(tmp == -1){
				nowNode.setLeft(new Node<E>(e));
			}
		}
		return false;
	}

	E ceiling (E e){
		
		return e;
	}
	
	@Override
	public void clear() {
		mainNode = null;
	}

	@Override
	public boolean contains(Object o) {
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class Node<E> {
	private Node left;
	private Node Right;
	E value;
	
	public Node() {
		
	}
	public Node(E e){
		value = e;
	}
	
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	
	public Node getRight() {
		return Right;
	}
	public void setRight(Node right) {
		Right = right;
	}
	 	
	public E getValue(){
		return value;
	}
	public void setValue(E value) {
		this.value = value;
	}
}
