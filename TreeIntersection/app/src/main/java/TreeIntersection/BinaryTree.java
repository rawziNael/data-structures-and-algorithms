package TreeIntersection;
import java.util.ArrayList;

public class BinaryTree<T extends Comparable<T>>{

    public Node<T> root;
    ArrayList<T> arr1 =new ArrayList<>();
    ArrayList<T> arr2 =new ArrayList<>();

    public BinaryTree() {
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }


    public ArrayList<T> preOrder(Node <T> root){
        if(root == null)
            return arr1;
        arr1.add(root.value);
        if(root.getLeft() !=null){
            preOrder(root.getLeft());
        }
        if(root.getRight()!=null){
            preOrder(root.getRight());
        }

        return arr1;
    }
    public ArrayList<T> InOrder(Node <T> root){
        if(root == null)
            return arr2;
        if(root.getLeft() !=null){
            InOrder(root.getLeft());
        }
        arr2.add(root.value);

        if(root.getRight()!=null){
            InOrder(root.getRight());
        }

        return arr2;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
