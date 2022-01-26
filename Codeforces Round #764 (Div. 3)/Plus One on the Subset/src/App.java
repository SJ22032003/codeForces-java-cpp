import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                long[] arr = new long[n];
                for (int j = 0; j < n; j++) {
                    arr[j] = sc.nextLong();
                }
                Arrays.sort(arr);
                System.out.println(arr[n-1] - arr[0]);
            }
        }
    }
}