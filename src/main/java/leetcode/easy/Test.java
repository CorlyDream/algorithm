package leetcode.easy;

/**
 * Created by corly on 2016/9/29.
 */
public class Test {
    public static void main(String[] args) {
//        System.out.println(compareVersion("0.1","1.0"));
//        System.out.println(Integer.parseInt("    +01".trim()));
        System.out.println(Integer.toBinaryString(5));
        int[] a = {0b10, 0x3};

    }

        public static int compareVersion(String version1, String version2) {
            String[] ver1 = version1.split("\\.");
            String[] ver2 = version2.split("\\.");
            int i = 0;
            int j = 0;
            System.out.println(Integer.parseInt("   +0".trim()));
            while(i<ver1.length && j<ver2.length){
                int v1 = Integer.valueOf(ver1[i]);
                int v2 = Integer.valueOf(ver2[j]);

                if(v1>v2)
                    return 1;
                else if(v1<v2)
                    return -1;

                i++;
                j++;
            }
            if(i>j){
                return 1;
            }
            return i<j?-1:0;
    }
}
