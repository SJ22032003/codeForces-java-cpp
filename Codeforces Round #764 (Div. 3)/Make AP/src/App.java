import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                if (b - a == c - b || (a == b) && (b == c)) {
                    System.out.println("YES");
                } else if ((2 * b - c) % a == 0 && 2 * b - c > 0) {
                    System.out.println("YES");
                } else if ((2 * b - a) % c == 0 && 2 * b - a > 0) {
                    System.out.println("YES");
                } else if ((a + c) % (2 * b) == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}