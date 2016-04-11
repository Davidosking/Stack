
package BinaryTraversals;

import Nodes.BinaryNode;

/**
 *
 * @author David Jennings
 * This class implements an in order search on a binary tree.
 */
public class InOrder <T>{
    
     private BinaryNode root;

    public InOrder(BinaryNode root) {
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
        
        System.out.println(root.getData());
        
        if(root.getRightChild() != null){
            printAll(root.getRightChild());
        }
        
        
        
        
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
        
        if(root.getData().equals(key)){
            return true;
        }
        
        if(root.getRightChild() != null){
           if( find(root.getRightChild(), key))
           return true;
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
    
//        public static void main(String args[]) {
//        BinaryNode<String> node = new BinaryNode("a", null, null, null);
//        BinaryNode<String> node1 = new BinaryNode("b", node, null, null);
//        BinaryNode<String> node2 = new BinaryNode("c", node, null, null);
//            BinaryNode<String> node3 = new BinaryNode("d", node1, null, null);
//            BinaryNode<String> node4 = new BinaryNode("e", node2, null, null);
//            BinaryNode<String> node5 = new BinaryNode("f", node2, null, null);
//            BinaryNode<String> node6 = new BinaryNode("g", node4, null, null);
//            BinaryNode<String> node7 = new BinaryNode("h", node5, null, null);
//            BinaryNode<String> node8 = new BinaryNode("i", node5, null, null);
//
//        node.setLeftChild(node1);
//        node.setRightChild(node2);
//        node1.setLeftChild(node3);
//        node2.setLeftChild(node4);
//        node2.setRightChild(node5);
//        node4.setRightChild(node6);
//        node5.setLeftChild(node7);
//        node5.setRightChild(node8);
//
//        InOrder<String> od = new InOrder(node);
//        od.printAll();
//        System.out.println(od.find("b"));
//        
//    }
}
