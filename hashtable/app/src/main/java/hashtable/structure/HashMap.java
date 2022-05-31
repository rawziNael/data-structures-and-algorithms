package hashtable.structure;

import hashtable.data.HashNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HashMap<K , V> {
    private ArrayList<HashNode<K , V>> bucketArray;
    private int numBucket;
    private int size;

    public HashMap() {
        bucketArray = new ArrayList<>();
        numBucket = 10;
        size = 0;

        for (int index = 0; index < numBucket; index++) {
            bucketArray.add(null);
        }
    }

    private int hashCode(K key) {
        return Objects.hashCode(key);
    }

    private int getBucketIndex(K key) {
        int hashCode = hashCode(key);
        int index = hashCode % numBucket;
        return Math.abs(index);
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public void add(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        HashNode<K ,V> head = bucketArray.get(bucketIndex);

        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode() == hashCode) {
                head.setValue(value);
                return;
            }
            head = head.getNext();
        }
        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<K , V> newNode = new HashNode<K ,V>(key, value, hashCode);
        newNode.setNext(head);
        bucketArray.set(bucketIndex, newNode);
        resize();
    }

    private void resize() {
        if ((1.0 * size) / numBucket >= 0.7) {
            ArrayList<HashNode<K ,V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            numBucket *=  2;
            size = 0;
            for (int index = 0; index < numBucket; index++) {
                bucketArray.add(null);
            }
            for (int i = 0; i < temp.size(); i++) {
                HashNode<K ,V> headNode = temp.get(i);
                while (headNode != null) {
                    add(headNode.getKey(), headNode.getValue());
                    headNode = headNode.getNext();
                }
            }

        }
    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K , V> head = bucketArray.get(bucketIndex);

        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode() == hashCode) {
                return head.getValue();
            }
            head = head.getNext();
        }
        return null;
    }

    public boolean contains(K key) {
        return get(key) != null;
    }

    public ArrayList<K> keys() {
        ArrayList<K> arrOfKeys = new ArrayList<>();
        for (int i = 0; i < bucketArray.size(); i++) {
            HashNode<K, V> head = bucketArray.get(i);
            while(head != null){
                arrOfKeys.add(head.getKey());
                head = head.getNext();
            }
        }
        return arrOfKeys;
    }
}
