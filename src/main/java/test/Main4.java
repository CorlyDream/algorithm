package test;

public class Main4 {

	public static void main(String[] args) {
	    String str = "abcdefg";
        System.out.println(str.hashCode());
        Integer a = new Integer(3);
        Integer b = 3; // 将3自动装箱成Integer类型
        int c = 3;
        System.out.println(a == b); // false 两个引用没有引用同一对象
        System.out.println(b == c); // true a自动拆箱成int类型再和c比较
    }
	public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        StringBuffer sb = new StringBuffer();
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
            i++;
        }
        return pre;
    }
}
