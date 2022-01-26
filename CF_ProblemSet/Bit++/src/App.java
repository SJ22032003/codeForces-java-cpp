import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int n , x = 0 ;
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                String str = sc.next();
                if(str.charAt(1) == '+'){
                    ++x;
                }else{
                    --x;
                }
            }
            System.out.println(x);
        }
    }
}
