package tree;

public class FizzBuzzTree{

    public static BinaryTree<Node> fizzBuzzTree(BinaryTree<Node> tree) {
        if (tree.root == null) {
            return tree;
        }
        recursive(tree.root);
        return tree;
    }

    public static Node recursive(Node node) {
        if (node == null) {
            return null;
        } else {
            fizzBuzz(node);
        }

        recursive(node.left);
        recursive(node.right);
        return node;
    }

    public static void fizzBuzz(Node node) {
        if ((int) node.value % 3 == 0 && (int) node.value % 5 == 0) {
            node.value = "FizzBuzz";
        } else if ((int) node.value % 3 == 0) {
            node.value = "Fizz";
        } else if ((int) node.value % 5 == 0) {
            node.value = "Buzz";
        }
    }
}
