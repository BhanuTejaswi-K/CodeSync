class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int max = 0;
        for (int x : nums)
            max = Math.max(max, x);

        long[] freq = new long[max + 1];
        for (int x : nums)
            freq[x]++;

        long[] exact = new long[max + 1];

        // Count pairs having gcd exactly g
        for (int g = max; g >= 1; g--) {
            long cnt = 0;

            for (int m = g; m <= max; m += g) {
                cnt += freq[m];
            }

            exact[g] = cnt * (cnt - 1) / 2;

            for (int m = 2 * g; m <= max; m += g) {
                exact[g] -= exact[m];
            }
        }

        List<Long> prefix = new ArrayList<>();
        List<Integer> values = new ArrayList<>();

        long sum = 0;
        for (int g = 1; g <= max; g++) {
            if (exact[g] > 0) {
                sum += exact[g];
                prefix.add(sum);
                values.add(g);
            }
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            long target = queries[i] + 1;

            int idx = Collections.binarySearch(prefix, target);

            if (idx < 0)
                idx = -idx - 1;

            ans[i] = values.get(idx);
        }

        return ans;
    }
}