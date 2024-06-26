package array;

public class Q268_MissingNumber_1 {
	    public int missingNumber(int[] nums) {
	        int xor = 0;
	        int n = nums.length;
	        for (int i = 0; i < n; i++) {
	            xor ^= nums[i];
	        }
	        for (int i = 0; i <= n; i++) {
	            xor ^= i;
	        }
	        return xor;
	    }
	}

