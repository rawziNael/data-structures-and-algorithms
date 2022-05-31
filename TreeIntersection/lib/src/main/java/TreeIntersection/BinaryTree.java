package TreeIntersection;

import java.util.ArrayList;

public class BinaryTree<T extends Comparable<T>> {

    public Node<T> root;
    ArrayList<T> arrOfPre =new ArrayList<>();
    ArrayList<T> arrOfIn =new ArrayList<>();

    public BinaryTree() {
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }


    public ArrayList<T> preOrder(Node<T> root){
        if(root == null)
            return  arrOfPre;
        arrOfPre.add(root.value);
        if(root.getLeft() !=null){
            preOrder(root.getLeft());
        }
        if(root.getRight()!=null){
            preOrder(root.getRight());
        }

        return arrOfPre;
    }
    public ArrayList<T> InOrder(Node<T> root){
        if(root == null)
            return  arrOfIn;
        if(root.getLeft() !=null){
            InOrder(root.getLeft());
        }
        arrOfIn.add(root.value);

        if(root.getRight()!=null){
            InOrder(root.getRight());
        }

        return arrOfIn;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
