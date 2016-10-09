package ceping.baidu;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by corly on 2016/9/29.
 */
public class Main3 {

    public static void main(String[] args) {
        int[] arrival = {0,1,4};
        int[] run = {5,2,3};
        int q = 3;
        System.out.println(waitingTimeRobin(arrival, run, q));
    }

    public static float waitingTimeRobin(int[] arrival, int[] run, int q)
    {
        // INSERT YOUR CODE HERE
        Queue<Integer> queue = new LinkedList<>();
        int i,j;
        queue.offer(0);
        int currT = 0;
        int allTime = 0;
        int[] waitTime = new int[arrival.length];

        int allTask = 0;
        for(i=0; i<run.length; i++) {
            allTask += run[i];
        }
        j=1;
        while (allTime<allTask) {
            if (queue.peek() == null) {
                allTime += arrival[j];
                for(int k=j+1;k<arrival.length; k++ ) {
                    waitTime[k] = arrival[j];
                }
                queue.offer(j++);
            }
            currT = queue.poll();
            if (run[currT] > q) {
                for(i=0; i<run.length; i++) {
                    if(i!=currT && run[i]>0)
                        waitTime[i] += q;
                }
                run[currT] -= q;
                allTime += q;
                if (j < arrival.length && arrival[j] <= allTime) {
                    queue.offer(j++);
                }
                queue.offer(currT);
            }else {
                for (i = 0; i < run.length; i++) {
                    if(i!=currT && run[i]>0)
                        waitTime[i] += run[currT];
                }
                allTime += run[currT];
                run[currT] = 0;
                if (j < arrival.length && arrival[j] <= allTime) {
                    queue.offer(j++);
                }
            }
        }
        System.out.println(Arrays.toString(waitTime));
        allTime = 0;
        for(i=0; i<waitTime.length; i++) {
            allTime += waitTime[i] - arrival[i];
        }
        return (float)((float)allTime/arrival.length);

    }
}
