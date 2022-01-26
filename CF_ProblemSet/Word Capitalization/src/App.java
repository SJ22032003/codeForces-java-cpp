import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            String str = sc.next();
            int count1 = 0 , count2 = 0 , count3 = 0;
            String result ="";
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '1'){
                    count1++;
                }else if(str.charAt(i) == '2'){
                    count2++;
                }else if(str.charAt(i) == '3'){
                    count3++;
                }
            }
            for (int j = 0; j < count1; j++) {
                result = result+"1+";
            }
            for (int j = 0; j < count2; j++) {
                result = result+"2+";
            }
            for (int j = 0; j < count3; j++) {
                result = result+"3+";
            }
            result = result.substring(0, result.length()-1);
            System.out.println(result);
        
        }
    }
}
