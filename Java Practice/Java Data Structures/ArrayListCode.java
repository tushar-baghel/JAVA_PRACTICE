import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCode {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        System.out.println(cars);

        Iterator<String> it = cars.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());            
        }

    }
    
}
