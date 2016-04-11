
package LinkedList;

/**
 *
 * @author David Jennings
 * This class implements a double linked list node.
 */
public class DoublyLinkedNode<T> {
    private LinkedNode next;
    private LinkedNode previous;
    private T data;
    
    DoublyLinkedNode(LinkedNode next, LinkedNode previous){
        this.next = next;
        this.previous = previous;
    }

    /**
     * @return the next
     */
    public LinkedNode getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(LinkedNode next) {
        this.next = next;
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }
}
