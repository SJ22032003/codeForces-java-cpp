import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
           int row = 0 , col = 0 , resRow = 3 , resCol = 3;
           for (int i = 0; i < 5; i++) {
               String str = sc.nextLine().replace(" ", "");
               if(str.contains("1")){
                   row = i+1;
                   col = str.indexOf("1")+1;
                   break;
               }               
           }
           int ans = Math.abs(resRow - row) + Math.abs(resCol - col);
           System.out.println(ans);
        }
    }
}
