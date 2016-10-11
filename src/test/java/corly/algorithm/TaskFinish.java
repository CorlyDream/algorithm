package corly.algorithm;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by corly on 2016/10/10.
 */
public class TaskFinish {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stuNum = in.nextInt();
        int officNum = in.nextInt();
        int moveTime = in.nextInt();
        int i,j;
        Node[] nodes = new Node[stuNum];
        for(i=0; i<stuNum; i++) {
            int id = in.nextInt();
            int arriveTime = in.nextInt();
            int time = in.nextInt();
            int[] officeTime = new int[officNum];
            for(j=0; j<time; j++) {
                officeTime[in.nextInt()] = in.nextInt();
            }
            nodes[i] = new Node(id, arriveTime, officeTime);
        }
        int finished = 0;
        int[] finishedTime = new int[stuNum];
        while (finished < stuNum) {
            int mini = 0;
            int minTime = Integer.MAX_VALUE;
            for(i=0; i<stuNum; i++) {
                if (nodes[i].arriveTime>=0 && nodes[i].arriveTime<=minTime ) {
                    Stack<Node> s = new Stack<>();
                    s.peek();
                    minTime = nodes[i].arriveTime;
                    mini = i;
                }
            }

        }
    }

    static class Node{
        public int id;
        public int arriveTime;
        public int [] officeTime;

        public Node(int id, int arriveTime, int[] officeTime) {
            this.id = id;
            this.arriveTime = arriveTime;
            this.officeTime = officeTime;
        }
    }
}
