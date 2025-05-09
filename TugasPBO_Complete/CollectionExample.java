import java.util.ArrayList;
import java.util.ArrayDeque;

public class CollectionExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Budi");
        list.add("Citra");

        System.out.println("ArrayList:");
        for (String name : list) {
            System.out.println(name);
        }

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.addFirst(0);
        deque.addLast(2);

        System.out.println("\nArrayDeque:");
        for (Integer num : deque) {
            System.out.println(num);
        }
    }
}