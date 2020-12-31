package udemy;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface {
	// Does not implement Collection interface
	// Key-Value pair

	/* The following sub-interface implements Map */
	// HashMap -> unsorted, unordered. Key's hashcode() is used, null values allowed
	// HashTable -> Synchronized(thread safe version, unsorted, unordered, key's
	// hashcode(), no null value
	// LinkedHashMap -> insertion order is maintained, slower insertion and
	// deletion, faster iteration
	// TreeMap -> sorted, ordered, implements navigableMap.
	interface Map<K, V> {
		int size();

		boolean isEmpty();

		boolean containsKey(Object paramObject);

		boolean containsValue(Object paramObject);

		V get(Object key);

		V put(K key, V value);

		V remove(Object key);

		void putAll(Map<? extends K, ? extends V> paramMap);

		void clear();

		Set<K> keyset();

		Collection<V> values();

		Set<Entry<K, V>> entrySet();

		@Override
		boolean equals(Object paramObject);
	}

	public static void main(String[] args) {

		/*
		 * | Welcome to JShell -- Version 12.0.1 | For an introduction type: /help intro
		 * 
		 * jshell> Map<String, Integer> map = Map.of("A", 3, "B", 4, "C", 5) map ==>
		 * {A=3, B=4, C=5}
		 * 
		 * jshell> map.get("A") $2 ==> 3
		 * 
		 * jshell> map.get("G") $3 ==> null
		 * 
		 * jshell> map.size() $4 ==> 3
		 * 
		 * jshell> map.isEmpty() $5 ==> false
		 * 
		 * jshell> mapcontainsKey("A") | Error: | cannot find symbol | symbol: method
		 * mapcontainsKey(java.lang.String) | mapcontainsKey("A") | ^------------^
		 * 
		 * jshell> map.containsKey("A") $6 ==> true
		 * 
		 * jshell> map.containsKey("G") $7 ==> false
		 * 
		 * jshell> map.containsValue(5) $8 ==> true
		 * 
		 * jshell> map.containsValue(9) $9 ==> false
		 * 
		 * jshell> map.keySet() $10 ==> [A, B, C]
		 * 
		 * jshell> map.valueSet() | Error: | cannot find symbol | symbol: method
		 * valueSet() | map.valueSet() | ^----------^
		 * 
		 * jshell> map.values() $11 ==> [3, 4, 5]
		 * 
		 * jshell> ap | Error: | cannot find symbol | symbol: variable ap | ap | ^^
		 * 
		 * jshell> map map ==> {A=3, B=4, C=5}
		 * 
		 * jshell> Map<String, Integer> hashmap = new HashMap<>(map) hashmap ==> {A=3,
		 * B=4, C=5}
		 * 
		 * jshell> hashmap.put("G", 12) $14 ==> null
		 * 
		 * jshell> hashmap hashmap ==> {A=3, B=4, C=5, G=12}
		 * 
		 * jshell> hashmap.values() $16 ==> [3, 4, 5, 12]
		 * 
		 * jshell> hashmap.keySet() $17 ==> [A, B, C, G]
		 * 
		 * jshell> hashmap.put("B", 11) $18 ==> 4
		 * 
		 * jshell> hashmap hashmap ==> {A=3, B=11, C=5, G=12}
		 */

	}

}
