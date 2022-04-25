package tree;

public class MaximumValue {
    static Node root;

    static int findMax(Node node) {
        if (node == null)
            return Integer.MIN_VALUE;

        int result = (int) node.value;
        int left = findMax(node.left);
        int right = findMax(node.right);

        if (left > result)
            result = left;
        if (right > result)
            result = right;
        return result;
    }
}
