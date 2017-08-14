package List;

import Interface.Collection;

public interface List<E> extends Collection<E> {
	void add(int index, E element);	//index ��ġ�� E�� �߰�
	E remove(int index);			//index ��ġ ��Ҹ� ���� | return ������ ���;
	E set (int index, E element);	//index ��ġ�� �ִ� ��Ҹ� element�� ��ü | return ���� �ִ� ���;
}
