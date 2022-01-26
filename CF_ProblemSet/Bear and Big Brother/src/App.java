import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            String str = sc.next();
            String[] strArray = str.split("");
            strArray[0] = strArray[0].toUpperCase();
            String result = "";
            for (int i = 0; i < strArray.length; i++) {
                result += ""+strArray[i];
            }
            System.out.print(result);

        }
    }
}
