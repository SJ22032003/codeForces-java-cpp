import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int max = 5 , temp = 0;
            for (int i = 1; i <= 1000000; i++) {
                if(max <= n && max != 0){
                    n = n - max;
                    temp++;
                }else if(n == 0){
                    System.out.println(temp);
                    break;
                }else{
                    max--;
                }
            }
        }
    }
}
