import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String[] strArr = new String[n];
            for (int i = 0; i < n; i++) {
                strArr[i] = sc.next();
            }
            int temp = 0;
            for (int i = 0; i < strArr.length - 1; i++) {
                if (strArr[i].equals(strArr[i + 1])) {
                    temp++;
                }
            }
            System.out.println(temp);
        }
    }
}