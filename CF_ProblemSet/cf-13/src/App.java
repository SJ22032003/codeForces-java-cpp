import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int input = sc.nextInt();
            boolean flag = false;
            int[] response = new int[input];
            for (int i = 0; i < response.length; i++) {
                response[i] = sc.nextInt();
            }
            for (int i : response) {
                if(i == 1){
                    System.out.println("HARD");
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                System.out.println("EASY");
            }
        }
    }
}
