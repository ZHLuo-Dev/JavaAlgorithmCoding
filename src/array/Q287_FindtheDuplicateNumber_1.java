package array;

public class Q287_FindtheDuplicateNumber_1 {
	//O(n), O(1)
	class Solution {
		public int findDuplicate(int[] nums) {
			int p1= 0,p2=0;
    	    do {
    	    	p1 = nums[p1];
	    	    p2 = nums[nums[p2]];
	    	    } while (p1 != p2);
    	    p1=0;
	    	while(p1!=p2){
	    	    p1= nums[p1];
	    	    p2=nums[p2];
	    	}
	    	return p1;
	    }
	}
}