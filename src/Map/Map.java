package Map;

import java.util.Set;

public interface Map<K, V> {
	void clear();

	boolean containsKey(Object key);

	boolean containsValue(Object value);

	boolean equals(Object o);

	V get(Object key);

	V getOrDefault(Object key, V defaultValue);

	boolean isEmpty();

	Set<K> keySet();

	V put(K key, V value);

	V remove(Object key);

	V replace(K key, V value);
	
	boolean	replace (K key, V oldValue, V newValue);
	
	int	size ();
}
