package Arrays;

import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        boolean expected = true;
        System.out.println("Expected: " + expected);
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        var set = new HashSet<Character>();

        // Validate columns
        for (int col = 0; col < board.length; col++) {
            set.clear();
            for (char[] row : board) {
                if (row[col] != '.' && !set.add(row[col])) {
                    return false;
                }
            }
        }

        // Validate rows
        for (char[] row : board) {
            set.clear();
            for (char c : row) {
                if (c != '.' && !set.add(c)) {
                    return false;
                }
            }
        }

        // Validate quadrants
        for (int k = 0; k < board.length; k += 3) {
            set.clear();
            for (int i = k; i < k + 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] != '.' && !set.add(board[i][j]))
                        return false;
                }
            }
            set.clear();
            for (int i = k; i < k + 3; i++) {
                for (int j = 3; j < 6; j++) {
                    if (board[i][j] != '.' && !set.add(board[i][j]))
                        return false;
                }
            }
            set.clear();
            for (int i = k; i < k + 3; i++) {
                for (int j = 6; j < 9; j++) {
                    if (board[i][j] != '.' && !set.add(board[i][j]))
                        return false;
                }
            }
        }

        return true;
    }
}
