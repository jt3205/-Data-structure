package List;

public class Stack<E> extends ArrayList<E> {

	public E peek() {
		return (E) arr[size()-1];
	}

	public E pop() {
		E e = (E) arr[size()-1];
		arr[size()-1] = null;
		return e;
	}
	
	public E push(E item) {
		add(item);
		return item;
	}
	
	public int search(Object o){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null){
				if(arr[i] == null || arr[i].equals(o)){
					return i+1;
				}
			}
		}
		return -1;
	}
}
