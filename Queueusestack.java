
import java.util.*;

class Queueusestack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.isEmpty() ? -1 : q1.poll();
    }

    public int top() {
        return q1.isEmpty() ? -1 : q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        Queueusestack stack = new Queueusestack();
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Top " + stack.top());
        System.out.println("Pop " + stack.pop());
        System.out.println("Top " + stack.top());

    }
}
