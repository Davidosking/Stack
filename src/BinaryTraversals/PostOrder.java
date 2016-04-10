
package BinaryTraversals;

import Nodes.BinaryNode;

/**
 *
 * @author David Jennings
 * This class implements a pre order traversal on a binary tree.
 */
public class PostOrder <T> {
    
     private BinaryNode root;

    public PostOrder(BinaryNode root) {
        this.root = root;
    }

    public void printAll() {
        printAll(this.getRoot());
    }

    private void printAll(BinaryNode root) {
        if(root.getLeftChild() == null && root.getRightChild() == null){
            System.out.println(root.getData());
            return;
        }
        
        if(root.getLeftChild() != null){
            printAll(root.getLeftChild());
        }
        
        if(root.getRightChild() != null){
            printAll(root.getRightChild());
        }
        
        System.out.println(root.getData());
        
        
    }

    public boolean find(T key) {
        return find(this.getRoot(), key);
    }

    private boolean find(BinaryNode root, T key) {
        if(root.getLeftChild() == null && root.getRightChild() == null){
            if(root.getData().equals(key))
            return true;
        }
        
        if(root.getLeftChild() != null){
            if(find(root.getLeftChild(), key))
            return true;
        }
        
        if(root.getRightChild() != null){
           if( find(root.getRightChild(), key))
           return true;
        }
        
        if(root.getData().equals(key)){
            return true;
        }
        else return false;
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
