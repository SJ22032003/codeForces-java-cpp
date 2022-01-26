import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int en, ex, curCap, maxCap;
            en = ex = curCap = maxCap = 0;
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                ex = sc.nextInt();
                en = sc.nextInt();
                curCap -= ex;
                curCap += en;
                if (curCap > maxCap) {
                    maxCap = curCap;
                }
            }
            System.out.println(maxCap);
        }
    }
}