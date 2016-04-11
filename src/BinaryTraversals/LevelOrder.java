package BinaryTraversals;

import Nodes.BinaryNode;
import Queue.DataQueue;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author David Jennings This class implements a level order traversal on a
 * binary tree.
 */
public class LevelOrder<T> {

    DataQueue<BinaryNode> queue;

    BinaryNode root;

    public LevelOrder(BinaryNode root) {
        this.root = root;
        queue = new DataQueue();

    }

    public void printAll() {
        queue.enqueue(root);
        while (!queue.isEmpty()) {
            BinaryNode node = queue.dequeue();
            System.out.println(node.getData());
            ArrayList<BinaryNode> list = this.getChildren(node);
            Iterator iter = list.iterator();
            while (iter.hasNext()) {
                queue.enqueue((BinaryNode) iter.next());
            }
        }
    }

    public boolean find(T key) {
        queue.enqueue(root);
        while (!queue.isEmpty()) {
            BinaryNode node = queue.dequeue();
            if (node.getData().equals(key)) {
                return true;
            }
            ArrayList<BinaryNode> list = this.getChildren(node);
            Iterator iter = list.iterator();
            while (iter.hasNext()) {
                queue.enqueue((BinaryNode) iter.next());
            }
        }
        return false;
    }

    public ArrayList getChildren(BinaryNode node) {
        ArrayList<BinaryNode> temp = new ArrayList();
        if (node.getLeftChild() != null) {
            temp.add(node.getLeftChild());
        }
        if (node.getRightChild() != null) {
            temp.add(node.getRightChild());
        }
        return temp;

    }

//    public static void main(String args[]) {
//        BinaryNode<String> node = new BinaryNode("a", null, null, null);
//        BinaryNode<String> node1 = new BinaryNode("b", node, null, null);
//        BinaryNode<String> node2 = new BinaryNode("c", node, null, null);
//        BinaryNode<String> node3 = new BinaryNode("d", node1, null, null);
//        BinaryNode<String> node4 = new BinaryNode("e", node2, null, null);
//        BinaryNode<String> node5 = new BinaryNode("f", node2, null, null);
//        BinaryNode<String> node6 = new BinaryNode("g", node4, null, null);
//        BinaryNode<String> node7 = new BinaryNode("h", node5, null, null);
//        BinaryNode<String> node8 = new BinaryNode("i", node5, null, null);
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
//        LevelOrder<String> od = new LevelOrder(node);
//        od.printAll();
//        System.out.println(od.find("l"));
//    }

}
