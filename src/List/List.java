package List;

import Interface.Collection;

public interface List<E> extends Collection<E> {
	void add(int index, E element);	//index 위치에 E를 추가
	E remove(int index);			//index 위치 요소를 삭제 | return 삭제된 요소;
	E set (int index, E element);	//index 위치에 있는 요소를 element로 대체 | return 원래 있던 요소;
}
