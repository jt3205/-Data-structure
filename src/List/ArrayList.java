package List;

public class ArrayList<E> implements List<E>{
	Object arr[];
	
	public ArrayList() {
		
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
			if(o.equals(arr[i]) || o == arr[i]){
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
		int tmp = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals(o) || arr[i] == o){
				tmp = i;
			}
		}
		return true;
	}
	
	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object[] expansion(Object o[]){
		Object arr[] = new Object[o.length*2];
		for (int i = 0; i < o.length; i++) {
			arr[i] = o[i];
		}
		return arr;
	}
	
}
