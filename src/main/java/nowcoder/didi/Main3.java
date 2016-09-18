package nowcoder.didi;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by corly on 2016/9/18.
 */
public class Main3 {
    private static  int[][] move;
    private static int[][] maze;
    private static int p;
    private static StringBuilder sb = new StringBuilder();
    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int n = in.nextInt();
            int m = in.nextInt();
            maze = new int[n][m];
//        p = in.nextInt();
            p = 1000;
            int i,j;
            for(i=0; i<n; i++) {
                for(j=0; j<m; j++) {
                    maze[i][j] = (in.nextInt()+1)%2;
                }
            }

            move = new int[n][m];
            if (findPath(0, 0) && p > 0) {
                for (String str : list) {
                    System.out.println(str);
                }
                System.out.println("("+(n-1)+","+(m-1)+")");

            }
        }
//        for(i=0; i<n; i++) {
//            for(j=0; j<m; j++) {
//                System.out.print(move[i][j]+" ");
//            }
//            System.out.println();
//        }
    }

    public static boolean findPath(int x, int y) {
        if (maze[x][y] == 0 || move[x][y] == 1)
            return false;
        if (x == move.length-1 && y == move[0].length - 1) {
            return true;
        }

        move[x][y] = 1;

        String point = String.format("(%s,%s)",x,y);
        list.add(point);
        sb.append(point);

        if(x+1<move.length) {

            if (findPath(x + 1, y))
                return true;
        }
        if(y+1<move[0].length) {
            p--;

            if (findPath(x, y + 1))
                return true;

            p++;
        }
        if(y-1>=0) {
            p--;
            if (findPath(x, y - 1))
                return true;
            p++;
        }
        if (x-1>=0) {
            p -= 3;
            if (findPath(x - 1, y)) {
                return true;
            }
            p += 3;
        }
        move[x][y] = 0;

        maze[x][y] = 0;
        sb.delete(sb.length()-point.length(), sb.length()-1);
        list.remove(list.size() - 1);
        return false;
    }

}

