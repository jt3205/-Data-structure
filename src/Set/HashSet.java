package Set;

public class HashSet<E> implements Set<E> {
	Object arr[];

	public HashSet() {
		arr = new Object[10];
	}

	public HashSet(int size) {
		arr = new Object[size];
	}

	@Override
	public boolean add(E e) {
		if (contains(e)) {
			return false;
		}
		arr[size()] = e;
		return true;
	}

	@Override
	public void clear() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = null;
		}
	}

	@Override
	public boolean contains(Object o) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(o) || arr[i] == o) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		for (int i = 0; i < arr.length; i++) {
			if (!(arr[i].equals(null) || arr[i] == null)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean remove(Object o) {
		if (!contains(o)) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(o) || arr[i] == o) {
				for (; i + 1 < arr.length; i++) {
					arr[i] = arr[i + 1];
				}
				arr[size() - 1] = null;
			}
		}
		return true;
	}

	@Override
	public int size() {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals(null) || arr[i] == null){
				return i+1;
			}
		}
		return -1;
	}

	@Override
	public Object[] toArray() {
		return arr;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		T t[] = (T[]) arr;
		return t;
	}

}
