package corly.algorithm.wap;

import java.util.Scanner;

/**
 * Created by corly on 2016/10/25.
 */
public class WirelessRouters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        Room[] rooms = new Room[N];
        int i,j;
        for (i=0; i<N; i++){
            rooms[i] = new Room(in.nextInt());
        }
        int a,b;
        for(i=0; i<N-1; i++) {
            a = in.nextInt()-1;
            b = in.nextInt()-1;
            rooms[a].setASide(b, rooms[b].point);
            rooms[b].setASide(a, rooms[a].point);
        }
        int[] sortPoints = sortByMaxPoint(rooms);
        if (M == 1) {
            System.out.println(rooms[sortPoints[0]].maxPoint);
            return;
        }

    }



    public static int[] sortByMaxPoint(Room[] rooms){
        int[] res = new int[rooms.length];
        int[] points = new int[rooms.length];
        int j;
        points[0] = rooms[0].maxPoint;
        for(int i=1; i<rooms.length; i++){
            j=i-1;
            while (j >= 0 && rooms[i].maxPoint > points[j]) {
                points[j+1] = points[j];
                res[j+1] = res[j];
                j--;
            }
            points[j+1] = rooms[i].maxPoint;
            res[j+1] = i;
        }
        return res;
    }

    static class Room{
        int point;
        int maxPoint;
        int[] side;
        int slen;// side nums
        boolean valid;

        public Room(int point) {
            valid = true;
            side = new int[3];
            slen = -1;
            this.point = point;
            maxPoint = point;
        }

        public void setASide(int s, int point){
            side[++slen] = s;
            maxPoint += point;
        }

    }
}
