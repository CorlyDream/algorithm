package graph;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by corly on 2017/4/13.
 */
public class Main4 {
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
        HashSet<Integer> hashSet = new HashSet<>();
        for(i=0; i<m; i++) {
            hashSet.add(in.nextInt());

        }
        int res = 0;
        VNode vNode = graph.getHead();
        while (vNode != null) {
            if (hashSet.contains(vNode.data)) {
                vNode = vNode.next;
                continue;
            }
            res++;
            ANode aNode = vNode.getFirstArc();
            int count = 0;
            while (aNode != null && !hashSet.contains(aNode.adjvex)) {
                count++;
                aNode = aNode.next;
            }
            if (aNode == null) {
                res--;
            }else
                res += count;


            vNode = vNode.next;
        }
        System.out.println(res);

    }

/**
3
1 2
2 3
 3 4
1
1

 2
 1 2
 2 3
 2
 1
 2

 4
 1 2
 1 3
 3 4
 5 6
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
