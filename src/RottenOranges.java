import java.util.HashSet;
import java.util.Set;

public class RottenOranges {
    public int orangesRotting(int[][] grid) {
        HashSet<String> rotten = new HashSet<>();
        HashSet<String> fresh = new HashSet<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    fresh.add("" + i + j);
                } else if (grid[i][j] == 2) {
                    rotten.add("" + i + j);
                }
            }
        }


        int count = 0;
        int[][] directions = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

        while (fresh.size() > 0) {
            Set<String> newRotten = new HashSet<>();
            for (String rot : rotten) {
                int row = rot.charAt(0) - '0';
                int col = rot.charAt(1) - '0';
                for (int[] direction : directions) {
                    int spreadRow = row + direction[0];
                    int spreadCol = col + direction[1];
                    if (fresh.contains("" + spreadRow + spreadCol)) {
                        fresh.remove("" + spreadRow + spreadCol);
                        newRotten.add("" + spreadRow + spreadCol);
                    }
                }
            }
            if (newRotten.isEmpty()) {
                return -1;
            } else {
                rotten.addAll(newRotten);
                count++;
            }
        }
        return count;
    }

}
