package program.beauty;

/**
 * Created by corly on 2016/10/24.
 */
public class Chess {
    public static void main(String[] args) {
        int c = 0;
        for (c=0; (c & 15) <9; c++) {
            for(c &= 15; ((c&240)>>>4)<9; c+=16) {
                if ((c & 15) % 3 != ((c & 240) >>> 4) % 3) {
                    System.out.println((c&15)+","+((c&240)>>>4));
                }
            }
        }
        System.out.println(c);
    }
}
