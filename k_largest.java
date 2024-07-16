import java.util.*;

public class k_largest {
    public static void main(String args[]) {

        int arr[] = {1, 2, 6, 4, 5, 3};

        kth_Largest_MaxHeap(arr, 3);
    }

    public static void kth_Largest_MaxHeap(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int num : arr) {
            pq.add(num);
        }

        int f = k - 1;

        while (f > 0) {
            pq.remove();
            f--;
        }

        System.out.println("Kth Largest element: " + pq.peek());
    }


}

