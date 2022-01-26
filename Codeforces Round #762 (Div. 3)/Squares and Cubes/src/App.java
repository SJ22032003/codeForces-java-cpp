import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int t  = sc.nextInt() ,sq,cb,count = 1; 
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                for (int j = 2; j <= n/3; j++) {
                    if(j*j <= n){
                        count++;
                    }
                    if(j*j*j <= n){
                        count++;
                    }
                }
                System.out.println(count);
                count = 1 ;
            }
        }
    }
}