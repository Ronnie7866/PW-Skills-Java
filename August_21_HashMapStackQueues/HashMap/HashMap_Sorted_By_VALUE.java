package August_21_HashMapStackQueues.HashMap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HashMap_Sorted_By_VALUE {
    static class hashMap <K, V extends Comparable> {

        private static final float DEFALT_LOAD_FACTOR = 0.75f;
        private static final int INITIAL_CAPACITY = 4;
        static int size = 0;
        hashMap(){
            initBucket(INITIAL_CAPACITY);
        }
        LinkedList<Node>[] buckets;

        private void initBucket(int n) {
            buckets = new LinkedList[n];
            for (int i = 0; i < n; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int getHashedKey(K key) {
            int hashCode = Math.abs(key.hashCode() % buckets.length);
            return hashCode;
        }

        private int searchInBucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) return i;
            }
            return -1;
        }

        public void put(K key, V value) {
            int hashCode = getHashedKey(key);
            LinkedList<Node> currBucket = buckets[hashCode];
            int LLIDX = searchInBucket(currBucket, key);
            if (LLIDX == -1) {
                Node temp = new Node(key, value);
                currBucket.add(temp);
                size++;
            }
            else currBucket.get(LLIDX).value = value;
        }

        public V get(K key) {
            int hashCode = getHashedKey(key);
            LinkedList<Node> currBucket = buckets[hashCode];
            int LLIDX = searchInBucket(currBucket, key);
            if (LLIDX == -1) {
                return null;
            }
            return currBucket.get(LLIDX).value;
        }

        public V remove(K key) {
            int hashCode = getHashedKey(key);
            LinkedList<Node> currBucket = buckets[hashCode];
            int LLIDX = searchInBucket(currBucket, key);
            if (LLIDX == -1) {
                return null;
            }
            Node temp = currBucket.get(LLIDX);
            currBucket.remove(LLIDX);
            size--;
            return temp.value;
        }

        public LinkedList<Node> getSortedList() {
            LinkedList<Node> currBucket = new LinkedList<>();
            for (LinkedList<Node> itr : buckets) {
                currBucket.addAll(itr);
            }
            currBucket.sort(Comparator.naturalOrder());
            return currBucket;
        }
        class Node implements Comparable<Node> {
            K key;
            V value;
            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }

            public V getValue() {
                return value;
            }

            public K getKey() {
                return key;
            }

            public int compareTo(Node node) {
                return this.value.compareTo(node.value);
            }
        }
    }

    public static void main(String[] args) {
        hashMap<Integer, String> map = new hashMap<>();
        map.put(1,"Amir");
        map.put(3,"Adil");
        map.put(4,"Mustafa");
        map.put(2,"Aisha");
        map.put(6,"Raju");
        map.put(9,"Aamir");
        LinkedList<hashMap<Integer, String>.Node> sortedEntries = map.getSortedList();
        for (hashMap.Node entry : sortedEntries) {
            System.out.println("Key" + " = " + entry.getKey() + " , " + "Value" + " =" + entry.getValue());
        }
    }
}
