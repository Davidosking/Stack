package BinaryTraversals;

import Nodes.BinaryNode;
import java.util.ArrayList;

/**
 *
 * @author David Jennings This class implements a in order traversal of a binary
 * tree.
 */
public class InOrder<T> {

    BinaryNode root;

    public InOrder(BinaryNode root) {
        this.root = root;
    }

    public void printAll() {
        printAll(this.root);
    }

    private void printAll(BinaryNode root) {
        System.out.println(root.getData());
        if (root.getLeftChild() != null) {
            printAll(root.getLeftChild());
        }
        if (root.getRightChild() != null) {
            printAll(root.getRightChild());
        }
        return;
    }

    public boolean find(T key) {
        return true;
    }

    public boolean find(BinaryNode root, T key) {
        if (root.getData().equals(key)) {
            return true;
        }
        if (root.getLeftChild() != null) {
            find(root.getLeftChild(), key);
        }
        if (root.getRightChild() != null) {
            find(root.getRightChild(), key);
        }

        return false;
    }

    
}
