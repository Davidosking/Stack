
package Stack;

/**
 *
 * @author David Jennings
 * This class implements a stack.
 */
public class ArrayStack<T> {
    final int SIZE;
    int count;
    T[] stack;
    
    public ArrayStack(int size){
        this.SIZE = size;
        count = 0;
        stack = (T[]) new Object[SIZE];
    }
    
    public void push(T item){
       if(!isFull()){
           stack[count] = item;
           count++;
           return;
       }
       
       else System.out.println("The stack is full. Nothing was added to the stack.");
    }
    
    public T pop(){
        if(!isEmpty()){
            count--;
            T temp = stack[(count)];
            stack[count] = null;
            return temp;
        }
        System.out.println("The stack is empty. Nothing was popped from the stack");
        return null;
        
    }
    
    public int size(){
        
        return count;
        
    }
    
    public boolean isEmpty(){
        if(count == 0)
            return true;
        else
        return false;
        
    }
    
    public boolean isFull(){
        if(count == SIZE)
            return true;
        else
        return false;
        
    }
    
    public T peek(){
        return stack[count-1];
        
    }
    
//    public static void main(String args[]){
//        ArrayStack<Integer> s = new ArrayStack(5);
//        System.out.println(s.isEmpty());
//        System.out.println(s.isFull());
//        s.pop();
//        s.push(1);
//        System.out.println(s.peek().toString());
//        System.out.println(s.isEmpty());
//        s.pop();
//        System.out.println(s.isEmpty());
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        System.out.println(s.peek());
//        
//    }
}
