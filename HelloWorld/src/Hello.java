import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by jacindazhong on 11/22/15.
 */
public class Hello {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Item 1");
        arrayList.add("Item 2");
        arrayList.add("Item 3");
        arrayList.add("Item 4");
        arrayList.add("Item 5");

        Iterator<String> iterator = arrayList.iterator();

        while(iterator.hasNext()) {
            System.out.println("\nThis is the iterator: " + iterator);
            System.out.println("i.next(): " + i.next() + "\n");
        }
    }
}
