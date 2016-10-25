package leetcode.midium;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by corly on 2016/10/22.
 */
public class BattleshipsInBoard {
    public static void main(String[] args) {
        int[][] board = {{'X','.','.','X'},{'.','.','.','X'}, {'.','.','.','X'}};
        int i,j,count=0;
        for(i=0; i<board.length; i++){
            for(j=0; j<board[i].length;j++){
                if(board[i][j]=='.') continue;
                if(i+1<board.length && board[i+1][j]=='X') continue;
                if(j+1<board[i].length && board[i][j+1]=='X') continue;
                count++;
            }
        }
        System.out.println(count);
        int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int res = o2[0] - o1[0];
                return res != 0 ? res:o1[1]-o2[1];
            }
        });
        int max = people[0][0];
        int tmp[];
        for(i=1; i<people.length; i++) {
            if (max == people[i][0]) {
                continue;
            }
            tmp = people[i];
            j = i;
            while (j > tmp[1]) {
                people[j] = people[j-1];
                j--;
            }
            people[j] = tmp;
        }
        for(i=0; i<people.length; i++)
            System.out.print(Arrays.toString(people[i])+',');
    }
}
