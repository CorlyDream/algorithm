package corly.algorithm.wap;

import java.util.Scanner;

/**
 * Created by corly on 2016/10/25.

 TEST CASE:

 3 5 3
 1 2 1 2 1 2 0 0 0 2 1 2 1 2 1 0 0 0 0 0 0 0 0 0 0 0 0
 2 1 2 2 1 2 1 1 2
 1 1
 1 1
 1 2
 1 2

 4 2 3
 2 1 1 1 2 2 2 2 0 0 0 0 0 0 0 0 2 2 2 2 2 1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 2 2 2 1 1 1 1 2 2
 2 1 2 1 1 1 1 1 2

 127a1d25-967b-4229-afab-a28d84874a1a
 */
public class MagicCube {

    static class Small{
        int[][][] v; // small cube number
        // the location of small cube
        int x,y,z;

        public Small(int[][][] v) {
            this.v = v;
        }
    }

    static int M;
    static int N;
    static int P;
    static boolean success;
    static int[][][] cube;
    static Small[] smalls;
    static boolean[][][] isUsed;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        M = in.nextInt();
        N = in.nextInt();
        P = in.nextInt();
        cube = new int[M][M][M];
        isUsed = new boolean[M][M][M];
        int i,j,z,k;
        for(i=0; i<M; i++)
            for (j=0; j<M; j++)
                for(z=0; z<M; z++)
                    cube[i][j][z] = in.nextInt();
        smalls = new Small[N];
        for (k=0; k<N; k++) {
            int s = in.nextInt();
            int[][][] v = new int[s][s][s];
            for(i=0; i<s; i++)
                for (j=0; j<s; j++)
                    for(z=0; z<s; z++)
                        v[i][j][z] = in.nextInt();
            smalls[k] = new Small(v);
        }
        for(i=0; i<M; i++)
            for (j=0; j<M; j++)
                for(z=0; z<M; z++)
                    dfs(i,j,z,0);

    }

    public static void dfs(int x, int y,int z, int no){
        if (no == N || success || !canPut(x,y,z,no) || checkUsed(x,y,z,no))
            return;
        Small small = smalls[no];
        int len = small.v.length;
        int i,j,k;
        for (i=x; i<x+len; i++)
            for(j=y; j<y+len; j++)
                for(k=z; k<z+len; k++)
                    if ((cube[i][j][k] + small.v[i - x][j - y][k - z]) % P != 0)
                        return;

        setIsUsedStatus(x, y, z, no, true);

        if (no == N - 1 && isSuccess()) {
            success = true;
            // print result
            for (i=0; i<N; i++){
                System.out.println(smalls[i].x+" "+smalls[i].y+" "+smalls[i].z);
            }
            return;
        }
        for(i=0; i<M; i++)
            for (j=0; j<M; j++)
                for(k=0; k<M; k++)
                    dfs(i,j,k,no + 1);
        setIsUsedStatus(x, y, z, no, false);

    }

    public static boolean canPut(int x, int y, int z, int no) {
        int len = smalls[no].v.length;
        if (x + len > M || y + len > M || z + len > M) {
            return false;
        }
        return true;
    }

    public static void setIsUsedStatus(int x, int y, int z, int no, boolean status){
        int len = smalls[no].v.length;
        int i,j,k;
        for (i=x; i<x+len; i++)
            for (j=y; j<y+len; j++)
                for (k=z; k<z+len; k++)
                    isUsed[i][j][k] = status;
        Small small = smalls[no];
        if (status){
            small.x = x;
            small.y = y;
            small.z = z;
        }else {
            small.x = -1;
            small.y = -1;
            small.z = -1;
        }
    }

    public static boolean checkUsed(int x, int y, int z, int no) {
        int len = smalls[no].v.length;
        int i,j,k;
        for (i=x; i<x+len; i++)
            for (j=y; j<y+len; j++)
                for (k=z; k<z+len; k++)
                    if (isUsed[i][j][k])
                        return true;
        return false;
    }

    public static boolean isSuccess(){
        int i,j,z;
        for(i=0; i<M; i++)
            for (j=0; j<M; j++)
                for(z=0; z<M; z++)
                    if( !(cube[i][j][z] == 0 || isUsed[i][j][z]))
                        return false;
        return true;
    }
}
