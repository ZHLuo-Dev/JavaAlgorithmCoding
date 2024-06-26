package array;

import java.util.Arrays;

public class Q204_CountPrimes_1 {
	//O(nlog⁡log⁡n), O(n)
	class Solution {
	    public int countPrimes(int n) {
	        int[] isPrime = new int[n];
	        Arrays.fill(isPrime, 1);
	        int ans = 0;
	        for (int i = 2; i < n; ++i) {
	            if (isPrime[i] == 1) {
	                ans += 1;
	                if ((long) i * i < n) {
	                    for (int j = i * i; j < n; j += i) {
	                        isPrime[j] = 0;
	                    }
	                }
	            }
	        }
	        return ans;
	    }
	}
}
