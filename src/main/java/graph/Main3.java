package graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by corly on 2017/4/13.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ALGraph graph = new ALGraph();
        int i,j;
        for(i=0; i<n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph.insert(a,b);
            graph.insert(b,a);
        }
        int m = in.nextInt();
        
        for(i=0; i<m; i++) {
            int node = in.nextInt();
            VNode vNode = graph.getVNode(node);
            if (vNode == null) {
                System.out.println(-1);
                continue;
            }
            int res = 0;
            int len = 0;
            HashSet<Integer> hashSet = new HashSet<>();
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(node);
            hashSet.add(node);
            while (!queue.isEmpty()) {
                int size = queue.size();
                len++;
                for (j=0; j<size; j++) {
                    node = queue.poll();

                    VNode top = graph.getVNode(node);
                    ANode aNode = top.getFirstArc();

                    while (aNode != null){
                        if (hashSet.contains(aNode.adjvex)) {
                            aNode = aNode.next;
                            continue;
                        }
                        hashSet.add(aNode.adjvex);
                        queue.offer(aNode.adjvex);
                        res += len;
                        aNode = aNode.next;
                    }

                }
            }

            System.out.println(res);

        }

    }

/**
3
1 2
2 3
 3 4
1
1

 4
 1 2
 1 3
 3 4
 2 4
 1
 1
 */

    public static class ALGraph {


        private VNode head;

        public ALGraph() {
            head = null;
        }

        public void insert(int v, int a) {

            if (head == null) {
                VNode vNode = new VNode(v);
                ANode aNode = new ANode(a);
                vNode.insertANode(a);
                head = vNode;
            } else {
                VNode p = head, q;
                if (v < p.data) {
                    VNode vNode = new VNode(v);
                    vNode.insertANode(a);
                    vNode.next = p;
                    head = vNode;
                    return;
                } else if (v == p.data) {
                    //相等就直接插入边
                    p.insertANode(a);
                    return;
                }
                q = p.next;
                while (q != null) {
                    if (v < q.data) {
                        break;
                    } else if (v == q.data) {
                        q.insertANode(a);
                        return;
                    }
                    p = q;
                    q = q.next;
                }
                VNode vNode = new VNode(v);
                vNode.insertANode(a);
                p.next = vNode;
                vNode.next = q;
            }
        }


        public VNode getVNode(int value) {
            VNode p = head;
            while (p != null && p.data < value)
                p = p.next;
            if (p != null && p.data == value) {
                return p;
            }
            return null;
        }


        public VNode getHead() {
            return head;
        }

    }

    public static class VNode {
        public int data;
        private ANode firstArc;
        public VNode next;

        public VNode(int v) {
            data = v;
            setFirstArc(null);
        }

        public void insertANode(int a) {
            if (getFirstArc() == null) {
                setFirstArc(new ANode(a));
            } else {
                ANode p, q;
                p = getFirstArc();
                if (p.adjvex > a) {
                    setFirstArc(new ANode(a));
                    getFirstArc().next = p;
                    return;
                }
                q = p.next;
                while (q != null) {
                    if (q.adjvex > a) {
                        break;
                    }
                    p = q;
                    q = q.next;
                }
                ANode aNode = new ANode(a);
                aNode.next = q;
                p.next = aNode;
            }
        }

        public ANode getANode(int v) {
            ANode p = getFirstArc();
            while (p != null) {
                if (p.adjvex == v) {
                    return p;
                }
            }
            return null;
        }

        public ANode getFirstArc() {
            return firstArc;
        }

        public void setFirstArc(ANode firstArc) {
            this.firstArc = firstArc;
        }
    }

    public static class ANode {
        public int adjvex;
        public ANode next;

        public ANode(int a) {
            adjvex = a;
        }

        @Override
        public String toString() {
            return "ANode{" +
                    "adjvex=" + adjvex +
                    '}';
        }
    }
}
