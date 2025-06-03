
import java.util.*;

class Generatenext {

    public static void FindNext(int[] arr) {
        Stack<Integer> sta = new Stack<>();
        int[] res = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!sta.isEmpty() && sta.peek() <= arr[i]) {
                sta.pop();
            }
            res[i] = sta.isEmpty() ? -1 : sta.peek();
            sta.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "->" + res[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        FindNext(arr);
    }
}
