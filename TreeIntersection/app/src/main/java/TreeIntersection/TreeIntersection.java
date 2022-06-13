package TreeIntersection;

import java.util.ArrayList;

public class TreeIntersection<T extends Comparable<T>> {

    public ArrayList<Integer> IntersectionTwoTrees(BinaryTree tree1, BinaryTree tree2) {

        HashTable<Integer, Integer> hashTable = new HashTable<Integer, Integer>();
        System.out.println("Tree1 " + tree1.arr1 + "\n");
        System.out.println("Tree2 " + tree2.arr2 + "\n");

        for (Object obj : tree2.arr2) {
            if (tree1.arr1.contains(obj)) {
                hashTable.set((Integer) obj, 1);
            }
        }
        return hashTable.keys();
    }

}
