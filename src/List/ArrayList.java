package List;

public class ArrayList<E> implements List<E>{
	Object arr[];
	
	public ArrayList() {
		arr = new Object[10];
	}
	
	public ArrayList(int length) {
		arr = new Object[length];
	}
	
	@Override
	public boolean add(Object e) {
		int last = 0;
		try {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == null){
					arr[i] = e;
					return true;
				}
			}
			last = arr.length;
			arr = expansion(arr);
			arr[last] = e;
		} catch (Exception e2) {
			System.out.println("ArrayList add ½ÇÆÐ");
			e2.printStackTrace();
			return false;
		}
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
			if(arr[i].equals(o) || arr[i] == o){
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		if(arr[0] == null)
			return true;
		return false;
	}

	@Override
	public boolean remove(Object o) {
		boolean result = false;
		boolean hasSame = false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null){
				if(arr[i].equals(o) || arr[i] == o){
					hasSame = true;
				}
				if(hasSame && i+1 < arr.length){
					arr[i] = arr[i+1];
				}
				else if(hasSame && i+1 == arr.length){
					arr[arr.length] = null;
				}
			}
		}
		
		return result;
	}
	
	@Override
	public E remove(int index) {
		E e = (E) arr[index];
		for (int i = index; i < arr.length; i++) {
			if(i+1 < arr.length){
				arr[i] = arr[i+1];
			}
			else if(i+1 == arr.length){
				arr[arr.length] = null;
			}
		}
		return e;
	}

	@Override
	public int size() {
		int size = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == null){
				size = i;
				break;
			}
		}
		return size;
	}

	@Override
	public void add(int index, Object element) {
		if(size() == arr.length + 1){
			arr = expansion(arr);
		}
		for (int i = size(); i > index; i--) {
			arr[i+1] = arr[i];
		}
		arr[index] = element;
	}

	@Override
	public E set(int index, Object element) {
		E e = (E) arr[index];
		arr[index] = element;
		return e;
	}

	@Override
	public String toString() {
		String result = "[";
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null)
				result += arr[i].toString()+" , ";
		}
		result += "]";
		return result;
	}
	
	private Object[] expansion(Object o[]){
		Object arr[] = new Object[o.length*2];
		for (int i = 0; i < o.length; i++) {
			arr[i] = o[i];
		}
		return arr;
	}
	
}
