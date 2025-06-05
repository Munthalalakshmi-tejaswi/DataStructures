
import java.util.*;

class Subarrayindexs {

    public static void SubArray(int[] arr, int k) {
        int sum = 0, start = 0;
        boolean found = false;
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            while (sum > k && start < end) {
                sum -= arr[start++];
                System.out.println("Start " + start + "to " + end);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        SubArray(arr, k);
    }
}
