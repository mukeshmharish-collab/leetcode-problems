import java.util.*;

class Solution {
    public int[] findEvenNumbers(int[] digits) {

        Set<Integer> set = new TreeSet<>();

        int n = digits.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {

                    // Same index cannot be used twice
                    if (i == j || j == k || i == k)
                        continue;

                    // First digit cannot be zero
                    if (digits[i] == 0)
                        continue;

                    // Last digit must be even
                    if (digits[k] % 2 != 0)
                        continue;

                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    set.add(num);
                }
            }
        }

        int[] ans = new int[set.size()];
        int index = 0;

        for (int num : set) {
            ans[index++] = num;
        }

        return ans;
    }
}
