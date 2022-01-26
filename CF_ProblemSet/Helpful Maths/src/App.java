import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            String str = sc.nextLine().replace("+", "");
            char[] arrStr = str.toCharArray();
            for (int i = 0; i < arrStr.length - 1; i++) {
                if((int)arrStr[i] > (int)arrStr[i+1]){
                    char temp = arrStr[i];
                    arrStr[i] = arrStr[i+1];
                    arrStr[i+1] = temp;
                }
            }
            for (char c : arrStr) {
                System.out.print(c + " ");
            }
        }
    }
}
