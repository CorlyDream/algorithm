package corly.algorithm.wap;

import java.util.Scanner;

/**
 * Created by corly on 2016/10/24.
 * Works Application
 */
public class MagicCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int p = in.nextInt();
        int[][][] big = new int[m][m][m];
        int i,j,z;
        for(i=0; i<m; i++) {
            for (j=0; j<m; j++) {
                for (z=0; z<m; z++) {
                    big[i][j][z] = in.nextInt();
                }
            }
        }
        Small[] smalls = new Small[n];
        for(i=0; i<n; i++) {
            int t = in.nextInt();
            int[][][] v = new int[t][t][t];
            for(i=0; i<t; i++) {
                for (j=0; j<t; j++) {
                    for (z=0; z<t; z++) {
                        v[i][j][z] = in.nextInt();
                    }
                }
            }
            smalls[i].v = v;
        }


    }

    private static class Small{
        public int[][][] v;
        boolean valid;
        Small next;

        public Small() {
            valid = true;
            next = null;
        }
    }
    static class SmallHead{
        Small head;
        public void insert(Small node) {
            if (head == null) {
                head = node;
            }else {
                int newLen = node.v.length;
                Small q = head,p = q;
                while (q != null && q.v.length > newLen) {
                    p = q;
                    q = q.next;
                }
                p.next = node;
                node.next = q;
            }
        }
    }
}
