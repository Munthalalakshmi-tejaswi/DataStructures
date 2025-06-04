
import java.util.*;

public class Keycapacity {

    private final int capacity;
    private final Deque<Integer> deque;
    private final Map<Integer, Integer> map;

    public Keycapacity(int capacity) {
        this.capacity = capacity;
        this.deque = new LinkedList<>();
        this.map = new HashMap<>();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        deque.remove(key);
        deque.addFirst(key);
        return map.get(key);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            deque.remove(key);
        } else if (deque.size() == capacity) {
            int lru = deque.removeLast();
            map.remove(lru);
        }
        deque.addFirst(key);
        map.put(key, value);

    }

    public void printCache() {
        for (int key : deque) {
            System.out.print(key + "=" + map.get(key) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Keycapacity ch = new Keycapacity(3);
        ch.put(2, 100);
        ch.put(3, 200);
        ch.put(4, 400);
        ch.printCache();
        System.out.println("Get 1:" + ch.get(3));
    }
}
