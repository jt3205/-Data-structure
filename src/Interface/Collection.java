package Interface;

public interface Collection<E> {
	boolean add(E e);	//맨 뒤에 추가
	void clear();		//모든 요소 삭제
	boolean contains(Object o);	//o가 있으면 true
	@Override
	boolean equals(Object obj); //같은지
	boolean isEmpty();			//비어있나?
	boolean	remove(Object o);	//지우기
	int	size();
}
