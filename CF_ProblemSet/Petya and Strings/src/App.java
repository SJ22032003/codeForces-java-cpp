import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            String strA = sc.nextLine() , strB = sc.nextLine();
            int result = strA.compareToIgnoreCase(strB);
            System.out.println(result<0?-1:result>0?1:0);
        }
    }
}
