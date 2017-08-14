package Interface;

public interface Collection<E> {
	boolean add(E e);	//�� �ڿ� �߰�
	void clear();		//��� ��� ����
	boolean contains(Object o);	//o�� ������ true
	@Override
	boolean equals(Object obj); //������
	boolean isEmpty();			//����ֳ�?
	boolean	remove(Object o);	//�����
	int	size();
}
