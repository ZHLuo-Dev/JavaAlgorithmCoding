package string;

import java.util.ArrayList;
import java.util.List;

public class Q784_LetterCasePermutation_1 {

	    public List<String> letterCasePermutation(String s) {
	        List<String> ans = new ArrayList<String>();
	        dfs(s.toCharArray(), 0, ans);
	        return ans;
	    }

	    public void dfs(char[] arr, int pos, List<String> res) {
	        while (pos < arr.length && Character.isDigit(arr[pos])) {
	            pos++;
	        }
	        if (pos == arr.length) {
	            res.add(new String(arr));
	            return;
	        }
	        arr[pos] ^= 32;
	        dfs(arr, pos + 1, res);
	        arr[pos] ^= 32;
	        dfs(arr, pos + 1, res);
	    }
	}
