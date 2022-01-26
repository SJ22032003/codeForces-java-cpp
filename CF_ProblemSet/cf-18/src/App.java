import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            String str = sc.next();
            int u = 0 , l = 0 ;
            String upperStr = str.toUpperCase();
            String lowerStr = str.toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                if(upperStr.toCharArray()[i] == str.toCharArray()[i]){
                    u++;
                }
                if(lowerStr.toCharArray()[i] == str.toCharArray()[i]){
                    l++;
                }
            }
            if(l > u || l == u){
                System.out.println(lowerStr);
            }else{
                System.out.println(upperStr);
            }
        }
    }
}
