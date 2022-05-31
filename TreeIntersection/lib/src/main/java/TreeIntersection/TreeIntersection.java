package TreeIntersection;

import java.util.ArrayList;

public class TreeIntersection<T extends Comparable<T>> {

    public ArrayList<Integer> IntersectionTwoTrees(BinaryTree tree1, BinaryTree tree2) {
    System.out.println("**********************************\n");
    HashTable<Integer, Integer> hashTable = new HashTable<Integer, Integer>();
    BinaryTree<Integer> binraryTree = new BinaryTree<Integer>();
        System.out.println("tree1 in preOrder   " + tree1.arrOfPre + "\n");
        System.out.println("tree2 in InOrder  " + tree2.arrOfIn + "\n");

        for (Object t : tree2.arrOfIn) {
        if (tree1.arrOfPre.contains(t)) {
            hashTable.set((Integer) t, 1);
        }
    }


        return hashTable.keys();
}
}
