import java.util.LinkedList;
import java.util.Queue; 


public class QueueExample {
    public static void main(String[] args){

        Queue<String>queue = new LinkedList<>();

        queue.offer("Element 1");
        queue.offer("Element 2");
        queue.offer("Element 3");
        
        System.out.println("Queue: " + queue);

        String removedElement = queue.poll();
        System.out.println("Removed Element:" + removedElement);

        System.out.println("Updated Queue"  + queue);

        String peekedElement = queue.peek();
        System.out.println("Peeked Element:" + peekedElement);


        System.out.println("Final Queue:" + queue);
    }
}
