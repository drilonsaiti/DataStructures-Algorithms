package sample.Hash;

public class CBHT<K extends Comparable<K>, E> {

	// An object of class CBHT is a closed-bucket hash table, containing
// entries of class MapEntry.
	private SLLNode<MapEntry<K,E>>[] buckets;

	@SuppressWarnings("unchecked")
	public CBHT(int m) {
// Construct an empty CBHT with m buckets.
		buckets = (SLLNode<MapEntry<K,E>>[]) new SLLNode[m];
	}

	private int hash(K key) {
// Translate key to an index of the array buckets.
		return Math.abs(key.hashCode()) % buckets.length;
	}

	public SLLNode<MapEntry<K,E>> search(K targetKey) {
// Find which if any node of this CBHT contains an entry whose key is
// equal
// to targetKey. Return a link to that node (or null if there is none).
		int b = hash(targetKey);
		for (SLLNode<MapEntry<K,E>> curr = buckets[b]; curr != null; curr = curr.succ) {
			if (targetKey.equals(((MapEntry<K, E>) curr.element).key))
				return curr;
		}
		return null;
	}

	public void insert(K key, E val) { // Insert the entry <key, val> into this CBHT.
		MapEntry<K, E> newEntry = new MapEntry<K, E>(key, val);
		int b = hash(key);
		for (SLLNode<MapEntry<K,E>> curr = buckets[b]; curr != null; curr = curr.succ) {
			if (val.equals(((MapEntry<K, E>) curr.element).value)) {
// Make newEntry replace the existing entry ...
				curr.element = newEntry;
				return;
			}
		}
// Insert newEntry at the front of the 1WLL in bucket b ...
		if(buckets[b]==null)
			buckets[b] = new SLLNode<MapEntry<K,E>>(newEntry, buckets[b]);
		else
		{
			SLLNode<MapEntry<K,E>> dvizi = buckets[b];
			while(dvizi.succ!=null)
			{
				dvizi = dvizi.succ;
			}
			dvizi.succ = new SLLNode<MapEntry<K,E>> (newEntry,null);
		}
	}

	public void delete(K key) {
// Delete the entry (if any) whose key is equal to key from this CBHT.
		int b = hash(key);
		for (SLLNode<MapEntry<K,E>> pred = null, curr = buckets[b]; curr != null; pred = curr, curr = curr.succ) {
			if (key.equals(((MapEntry<K,E>) curr.element).key)) {
				if (pred == null)
					buckets[b] = curr.succ;
				else
					pred.succ = curr.succ;
				return;
			}
		}
	}

	public String toString() {
		String temp = "";
		for (int i = 0; i < buckets.length; i++) {
			temp += i + ":";
			for (SLLNode<MapEntry<K,E>> curr = buckets[i]; curr != null; curr = curr.succ) {
				temp += curr.element.toString() + " ";
			}
			temp += "\n";
		}
		return temp;
	}
	public String toStringCompany() {

		String temp = "";


		for(int i=0;i<buckets.length;i++) {

			for(SLLNode<MapEntry<K, E>> curr = buckets[i]; curr!=null; curr=curr.succ) {
				temp+=curr.element.key.toString() + " " + curr.element.value.toString()+" ";
			}
		}

		return temp;
	}

}