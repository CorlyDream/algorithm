package nowcoder.microsoft;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by corly on 2017/4/8.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][2];
        int i, j;
        int all = 0;
        for (i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
            all += arr[i][0] + arr[i][1];
        }
        int avg = all / (2 * n);
        int res = 0;
        Queue<Point> queue = new LinkedList<>();
        for (i = 0; i < n; i++) {
            int[] line = arr[i];
            Point p = null;
            if (line[0] > avg) {
                p = new Point(i);
                p.val1 = line[0] - avg;

            } else if (line[0] < avg) {
                while (queue.size() > 0) {
                    Point top = queue.peek();
                    if (top.val1 > 0) {
                        if (top.val1 + line[0] > avg) {
                            res += (i - top.line) * (avg - line[0]);
                            top.val1 += line[0] - avg;
                            break;
                        } else {
                            res += (i - top.line) * top.val1;
                            line[0] += top.val1;
                            top.val1 = 0;
                        }
                    }
                    if (line[0] < avg && top.val2 > 0) {
                        if (top.val2 + line[0] > avg) {
                            res += (i - top.line + 1) * (avg - line[0]);
                            top.val2 += line[0] - avg;
                            break;
                        } else {
                            res += (i - top.line + 1) * top.val2;
                            line[0] += top.val2;
                            top.val2 = 0;
                        }
                    }

                    if (top.isPop()) {
                        queue.poll();
                    }
                }

                // queue中无法满足
                if (line[0] < avg) {
                    // 先向左边借
                    if (line[1] > avg) {
                        if (line[1] - avg + line[0] > avg) {
                            res += avg - line[0];
                            Point p1 = new Point(i);
                            p1.val2 = line[1] - avg - avg + line[0];
                            queue.offer(p1);
                            line[0] = avg;
                            continue;
                        } else {
                            res += line[1] - avg;
                            line[0] += line[1] - avg;
                        }
                    }
                    //左边无法满足
                    if (line[0] < avg) {
                        for (j = i + 1; j < n; j++) {
                            if (arr[j][0] > avg) {
                                if (arr[j][0] - avg + line[0] >= avg) {
                                    res += (j - i) * (avg - line[0]);
                                    arr[j][0] -= avg - line[0];
                                    line[0] = avg;
                                } else {
                                    res += (j - i) * (arr[j][0] - avg);
                                    line[0] += arr[j][0] - avg;
                                }
                            }
                            if (line[0] < avg && arr[j][1] > avg) {
                                if (arr[j][1] - avg + line[0] >= avg) {
                                    res += (j - i + 1) * (avg - line[0]);
                                    arr[j][1] -= avg - line[0];
                                    line[0] = avg;
                                } else {
                                    res += (j - i + 1) * (arr[j][1] - avg);
                                    line[0] += arr[j][1] - avg;
                                }
                            }
                            if (line[0] >= avg) {
                                break;
                            }
                        }
                    }


                }

            }


            if (line[0] > avg) {
                p = new Point(i);
                p.val1 = line[0] - avg;

            } else if (line[0] < avg) {
                while (queue.size() > 0) {
                    Point top = queue.peek();
                    if (top.val1 > 0) {
                        if (top.val1 + line[0] > avg) {
                            res += (i - top.line) * (avg - line[0]);
                            top.val1 += line[0] - avg;
                            break;
                        } else {
                            res += (i - top.line) * top.val1;
                            line[0] += top.val1;
                            top.val1 = 0;
                        }
                    }
                    if (line[0] < avg && top.val2 > 0) {
                        if (top.val2 + line[0] > avg) {
                            res += (i - top.line + 1) * (avg - line[0]);
                            top.val2 += line[0] - avg;
                            break;
                        } else {
                            res += (i - top.line + 1) * top.val1;
                            line[0] += top.val2;
                            top.val2 = 0;
                        }
                    }

                    if (top.isPop()) {
                        queue.poll();
                    }
                }

                // queue中无法满足
                if (line[0] < avg) {
                    // 先向左边借
                    if (line[1] > avg) {
                        if (line[1] - avg + line[0] > avg) {
                            res += avg - line[0];
                            Point p1 = new Point(i);
                            p1.val2 = line[1] - avg - avg + line[0];
                            queue.offer(p1);
                            line[0] = avg;
                            continue;
                        } else {
                            res += line[1] - avg;
                            line[0] += line[1] - avg;
                        }
                    }
                    //左边无法满足
                    if (line[0] < avg) {
                        for (j = i + 1; j < n; j++) {
                            if (arr[j][0] > avg) {
                                if (arr[j][0] - avg + line[0] >= avg) {
                                    res += (j - i) * (avg - line[0]);
                                    arr[j][0] -= avg - line[0];
                                    line[0] = avg;
                                } else {
                                    res += (j - i) * (arr[j][0] - avg);
                                    line[0] += arr[j][0] - avg;
                                }
                            }
                            if (line[0] < avg && arr[j][1] > avg) {
                                if (arr[j][1] - avg + line[0] >= avg) {
                                    res += (j - i + 1) * (avg - line[0]);
                                    arr[j][1] -= avg - line[0];
                                    line[0] = avg;
                                } else {
                                    res += (j - i + 1) * (arr[j][1] - avg);
                                    line[0] += arr[j][1] - avg;
                                }
                            }
                            if (line[0] >= avg) {
                                break;
                            }
                        }
                    }


                }

            }

            // 开始 右边
            if (line[1] > avg) {
                if (p == null) {
                    p = new Point(i);
                }
                p.val2 = line[1] - avg;

            } else if (line[1] < avg) {
                while (queue.size() > 0) {
                    Point top = queue.peek();
                    if (top.val2 > 0) {
                        if (top.val2 + line[1] > avg) {
                            res += (i - top.line) * (avg - line[1]);
                            top.val2 += line[1] - avg;
                            break;
                        } else {
                            res += (i - top.line) * top.val2;
                            line[1] += top.val2;
                            top.val2 = 0;
                        }
                    }
                    if (line[1] < avg && top.val1 > 0) {
                        if (top.val1 + line[1] > avg) {
                            res += (i - top.line + 1) * (avg - line[1]);
                            top.val1 += line[1] - avg;
                            break;
                        } else {
                            res += (i - top.line + 1) * top.val1;
                            line[1] += top.val1;
                            top.val1 = 0;
                        }
                    }


                    if (top.isPop()) {
                        queue.poll();
                    }
                }

                // queue中无法满足
                if (line[1] < avg) {

                    //左边无法满足
                    for (j = i + 1; j < n; j++) {
                        if ( arr[j][1] > avg) {
                            if (arr[j][1] - avg + line[1] >= avg) {
                                res += (j - i ) * (avg - line[1]);
                                arr[j][1] -= avg - line[1];
                                line[1] = avg;
                            } else {
                                res += (j - i ) * (arr[j][1] - avg);
                                line[1] += arr[j][1] - avg;
                            }
                        }
                        if (line[1] < avg &&arr[j][0] > avg) {
                            if (arr[j][0] - avg + line[1] >= avg) {
                                res += (j - i + 1) * (avg - line[1]);
                                arr[j][0] -= avg - line[1];
                                line[1] = avg;
                            } else {
                                res += (j - i+1) * (arr[j][0] - avg);
                                line[1] += arr[j][0] - avg;
                            }
                        }

                        if (line[0] >= avg) {
                            break;
                        }
                    }
                }

            }

            if (p != null) {
                queue.offer(p);
            }
        }

    }

    public static class Point {
        public int line;
        public int val1;
        public int val2;

        public Point(int line) {
            this.line = line;
        }

        public boolean isPop() {
            return val1 == 0 && val2 == 0;
        }
    }

}
