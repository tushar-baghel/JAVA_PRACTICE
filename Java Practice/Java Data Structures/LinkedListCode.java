import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCode { 
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<String>();
        fruits.add("ringo");
        fruits.add("Orenji");
        fruits.add("banana");
        System.out.println(fruits);

        Iterator<String> it = fruits.iterator(); // adding Iterator

        while (it.hasNext()) {
            System.out.println(it.next());            
        }

    }
    
}
