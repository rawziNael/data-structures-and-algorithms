package tree;

<<<<<<< HEAD
public class MaximumValue{
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
=======
public class MaximumValue extends BinaryTree{
    static Integer maxValue;

    public MaximumValue() {
    }

    public static Integer findMaximumValue(BinaryTree tree) {
        if (tree.root == null) {
            return null;
        }
        MaximumValue.maxValue = (Integer) tree.root.value;
        MaximumValue.recurSearch(tree.root);
        return maxValue;
    }

    public static void recurSearch(Node node) {
        if ((Integer) node.value > MaximumValue.maxValue) maxValue = (Integer) node.value;
        if (node.left != null) recurSearch(node.left);
        if (node.right != null) recurSearch(node.right);
    }
>>>>>>> main
}
