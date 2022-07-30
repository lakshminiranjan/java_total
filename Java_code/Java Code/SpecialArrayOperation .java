import java.util.*;

public class SpecialArrayOperation {
	public static void main(String args[]) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Comparator.reverseOrder());
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            int ele = in.nextInt();
            minPq.add(ele); //add() method Adds an element into priority queue
            maxPq.add(ele);
            totalSum += ele;
        }
        int[] arK = new int[q];
        int maxK = 0;
        for (int i = 0; i < q; i++) {
            arK[i] = in.nextInt();
            maxK = Math.max(maxK, arK[i]);
        }
        Map<Integer, Long> map = new HashMap<>();
        map.put(0,totalSum);
        for (int j = 0; j < maxK; j++) {
            int max = maxPq.poll(); //poll() method retrieves and remove head element from priority queue
            int min = minPq.poll();
            maxPq.add(max - min);
            minPq.add(max - min);
            totalSum -= (2* min);
            map.put(j + 1, totalSum);
        }
        for (int i = 0; i < q; i++){
            System.out.println(map.get(arK[i]));
        }
    }
}
