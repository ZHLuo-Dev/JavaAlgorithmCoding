package matrix;

import java.util.HashSet;
import java.util.Set;

public class Q36_ValidSudoku_1 {
	    public boolean isValidSudoku(char[][] board) {
	        int[][] rows = new int[9][9];
	        int[][] columns = new int[9][9];
	        int[][][] subboxes = new int[3][3][9];
	        for (int i = 0; i < 9; i++) {
	            for (int j = 0; j < 9; j++) {
	                char c = board[i][j];
	                if (c != '.') {
	                    int index = c - '0' - 1;
	                    rows[i][index]++;
	                    columns[j][index]++;
	                    subboxes[i / 3][j / 3][index]++;
	                    if (rows[i][index] > 1 || columns[j][index] > 1 || subboxes[i / 3][j / 3][index] > 1) {
	                        return false;
	                    }
	                }
	            }
	        }
	        return true;
	    }
	

public boolean isValidSudoku2(char[][] board) {
    Set<String> seen = new HashSet<>();
    for (int i=0; i<9; ++i) {
        for (int j=0; j<9; ++j) {
            if (board[i][j] != '.') {
                String b = "(" + board[i][j] + ")";
                if(!seen.add(b+j)||!seen.add(i+b)||!seen.add(i/3+b+j/3)) return false;
                    return false;
            }
        }
    }
    return true;
}}