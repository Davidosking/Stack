package Stack;

/**
 *
 * @author David Jennings
 */
public class ListStack<T> {

    private static ListStack top;

    private static int numItems;
    private ListStack next;
    private T data;

    ListStack(ListStack next, T data) {
        top = next;
        numItems = 0;
        this.data = data;
        this.next = next;
    }

    ListStack(ListStack next) {
        top = next;
        numItems = 0;
        this.data = null;
        this.next = next;
    }
    
    ListStack() {
        top = null;
        numItems = 0;
        this.data = null;
        this.next = null;
    }

    public void push(ListStack pop) {
        ListStack temp = top;
        top = pop;
        top.setNext(temp);
        numItems++;

    }

    public ListStack pop() {

        if (isEmpty()) {
            System.out.println("Nothing to pop from the stack. The stack is empty.");
            return null;
        }
        ListStack temp = top;
        top = top.next;
        numItems--;
        return temp;

    }

    public ListStack peek() {

        return top;
    }

    public boolean isEmpty() {
        if(numItems == 0)
        return true;
        
        else return false;
    }
    
    public int size(){
        return this.numItems;
    }

    /**
     * @return the top
     */
    public static ListStack getTop() {
        return top;
    }

    /**
     * @param aTop the top to set
     */
    public static void setTop(ListStack aTop) {
        top = aTop;
    }

    /**
     * @return the next
     */
    public ListStack getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(ListStack next) {
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

    /**
     * @return the numItems
     */
    public int getNumItems() {
        return numItems;
    }

    /**
     * @param numItems the numItems to set
     */
    public void setNumItems(int numItems) {
        this.numItems = numItems;
    }
    
//        public static void main(String args[]){
//        ListStack<Integer> s = new ListStack();
//        System.out.println(s.isEmpty());
//        
//        s.pop();
//        
//        s.push(new ListStack(null, 1));
//        System.out.println(s.peek().data);
//        System.out.println(s.isEmpty());
//        s.pop();
//        System.out.println(s.isEmpty());
//        s.push(new ListStack(null, 2));
//        s.push(new ListStack(null, 3));
//        s.push(new ListStack(null, 4));
//        System.out.println(s.peek().data);
//        
//    }
}
