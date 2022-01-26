import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            // int t = sc.nextInt();
            // String[] str = sc.next().split("");
            int z = ++x*++x*++x;
            System.out.println(x+"=n and z= "+z);
        }
    }
}