import java.util.Scanner;
import java.lang.Math;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            String str = sc.next();
            int temp = 0;
            for (int i = 0; i < str.length() - 1; i++) {
                for (int j = i; j < str.length(); j++) {
                    if(str.charAt(i) == str.charAt(j)){
                      temp++;  
                    }
                }
            }
            if(Math.abs(temp)%2==0){
                System.out.println("IGNORE HIM!");
            }else{
                System.out.println("CHAT WITH HER!");
            }
        }
    }
}
