package August_21_HashMapStackQueues.HashMap;
import java.util.*;

public class HashMap_Sorted_By_KEY {
    static class MyHashMap <K extends Comparable<K>, V> {

        class Node implements Comparable<Node> {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }

            public K getKey() {
                return key;
            }

            @Override
            public int compareTo(Node other) {
                return this.key.compareTo(other.key);
            }
        }

    private static final float DEFAULT_LOAD_FACTOR = 0.75f;
        private static final int INITIAL_CAPACITY = 4;
        static int size = 0;

        LinkedList<Node>[] bucket;

        private void initBucket(int N) {
            bucket = new LinkedList[N];
            for (int i = 0; i < bucket.length; i++) {
                bucket[i] = new LinkedList<>();
            }
        }
        MyHashMap(){
            initBucket(INITIAL_CAPACITY);
        }

        private int hashFunction(K key) {
            int hashedKey = Math.abs(key.hashCode() % bucket.length);
            return hashedKey;
        }

        private int searchInBucket(K key, LinkedList<Node> currBucket) {
            for (int i = 0; i < currBucket.size(); i++) {
                if (currBucket.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }
        public void put(K key, V value){
            int hashedKey = hashFunction(key);
            LinkedList<Node> currBucket = bucket[hashedKey];
            int contains = searchInBucket(key, currBucket);
            if (contains == -1) {
                Node temp = new Node(key, value);
                bucket[hashedKey].add(temp);
            }
            else {
                currBucket.get(contains).value = value;
            }
            size++;
        }
        public V get(K key) {
            int hashedKey = hashFunction(key);
            LinkedList<Node> currBucket = bucket[hashedKey];
            int contains = searchInBucket(key, currBucket);
            if (contains != -1) {
                Node temp = currBucket.get(contains);
                return temp.value;
            }
            else return null;
        }

        public boolean containsKey(K key) {
            int hashedKey = hashFunction(key);
            LinkedList<Node> currBucket = bucket[hashedKey];
            int contains = searchInBucket(key, currBucket);
            if (contains == -1) {
                return false;
            }
            else return true;
        }
        public V remove(K key) {
            int hashedKey = hashFunction(key);
            LinkedList<Node> currBucket = bucket[hashedKey];
            int contains = searchInBucket(key, currBucket);
            if (contains == -1) {
                return null;
            }
            else {
                Node temp = currBucket.remove(contains);
                size--;
                return temp.value;
            }
        }

        public LinkedList<Node> getSortedEntries() {
            LinkedList<Node> currBucket = new LinkedList<>();
            for (LinkedList<Node> itr : bucket) {
                currBucket.addAll(itr);
            }
            Collections.sort(currBucket);
            return currBucket;
        }




}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyHashMap<Integer, String> myHashMap = new MyHashMap();
        while (true) {
            System.out.print("Enter the key value: ");
            int key = sc.nextInt();
            sc.nextLine();
            System.out.println();
            System.out.print("Enter the value: ");
            String value = sc.nextLine();
            myHashMap.put(key, value);
            System.out.print("Do you want to enter more key value pairs: " + "true || false");
            boolean ans = sc.nextBoolean();

            if (!ans) {
                break;
            }

        }




        LinkedList<MyHashMap<Integer, String>.Node> sortedEntries = myHashMap.getSortedEntries();
        for (MyHashMap.Node entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.value);
        }


    }
}
