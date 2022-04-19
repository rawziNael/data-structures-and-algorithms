package tree;

public class SecondNode<T> {
    public int value;
    public SecondNode left;
    public SecondNode right;

    public SecondNode(int value) {
        this.value = value;
    }

    public SecondNode(int value, SecondNode left, SecondNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
