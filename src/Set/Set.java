package Set;

import Interface.Collection;

public interface Set<E> extends Collection<E> {
	Object[] toArray();

	<T> T[] toArray(T[] a);
}
