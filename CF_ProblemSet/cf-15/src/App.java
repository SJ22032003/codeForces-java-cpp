import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int k = sc.nextInt();
            int n = sc.nextInt();
            int w = sc.nextInt();   
            int temp = 0;
            for (int i = 1; i <= w; i++) {
                temp += k*i;
            }
            if(temp>n){
                System.out.println(temp-n);
            }else{
                System.out.println(0);
            }
        }
    }
}
