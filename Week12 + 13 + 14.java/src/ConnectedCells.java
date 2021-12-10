import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//class Cell {
//    public int r, c;
//    public Cell(int i, int j) {
//        r = i;
//        c = j;
//    }
//}

public class ConnectedCells {

    static int[][] grid;
    static boolean[][] visited;
    static int N, M;
    static int[] d = {0, -1, 1};


    static int count_connected(int row, int col) {
        int s = 1;
        visited[row][col] = true;

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++)
                if (check(row + d[i], col + d[j])) {
                    if (grid[row + d[i]][col + d[j]] == 1 && !visited[row + d[i]][col + d[j]])
                        s += count_connected(row + d[i], col + d[j]);
                }
        }

        return s;
    }

    public static boolean check(int row, int col) {
        if (row >= 0 && row < N && col >= 0 && col < M) return true;
        return false;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();

        grid = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                grid[i][j] = scanner.nextInt();
                visited[i][j] = false;
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == 0 || visited[i][j]) continue;
                int cnt = count_connected(i, j);
                if (max < cnt) max = cnt;
            }
        }

//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                System.out.print(grid[i][j]);
//            }
//            System.out.println();
//        }
         System.out.println(max);

    }
}