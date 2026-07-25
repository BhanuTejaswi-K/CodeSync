import java.util.*;

class Solution {
    public int maxProduct(int n) {
        List<Integer> arr = new ArrayList<>();

        while (n > 0) {
            arr.add(n % 10);
            n = n / 10;
        }

        Collections.sort(arr);

        int max = arr.get(arr.size() - 1);
        int secmax = arr.get(arr.size() - 2);

        return max * secmax;
    }
}