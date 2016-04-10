package BinaryTraversals;

import Nodes.BinaryNode;
import java.util.ArrayList;

/**
 *
 * @author David Jennings This class implements a pre order traversal of a binary
 * tree.
 */
public class PreOrder<T> {

    private BinaryNode root;

    public PreOrder(BinaryNode root) {
        this.root = root;
    }

    public void printAll() {
        printAll(this.getRoot());
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
        return find(this.getRoot(), key);
    }

    private boolean find(BinaryNode root, T key) {
        if (root.getData().equals(key)) {

            return true;
        }
        if (root.getLeftChild() != null) {
            if (find(root.getLeftChild(), key)) {
                return true;
            }
        }
        if (root.getRightChild() != null) {
            if (find(root.getRightChild(), key)) {
                return true;
            }
        }

        return false;
    }

    /**
     * @return the root
     */
    public BinaryNode getRoot() {
        return root;
    }

    /**
     * @param root the root to set
     */
    public void setRoot(BinaryNode root) {
        this.root = root;
    }

   

}
