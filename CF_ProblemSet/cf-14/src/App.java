import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int temp = 1;
            for (int i = 0; i < a+b; i++) {
                a = a*3; b = b*2;
                if(a > b){
                    System.out.println(temp);
                    break;
                }else{
                    temp++;
                }
            }
        }
    }
}
