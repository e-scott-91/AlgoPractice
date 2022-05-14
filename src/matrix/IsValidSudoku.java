package matrix;

import java.util.HashSet;

public class IsValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        HashSet<String> checked = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char value = board[i][j];
                if (value != '.') {
                    if (!checked.add("" + value + " found in row " + i)) return false;
                    if (!checked.add("" + value + " found in col " + j)) return false;
                    if (!checked.add("" + value + " found in box " + i/3 + " " + j/3)) return false;
                }
            }
        }
        return true;
    }
}
