import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();

            int[][] choice = new int[n][3];
            for (int i = 0; i < choice.length; i++) {
                for (int j = 0; j < 3; j++) {
                    choice[i][j] = sc.nextInt();
                }
            }
            int sum = 0, temp = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    sum += choice[i][j];
                }
                if(sum > 1){
                    temp++;
                }
                sum = 0;
            }
            System.out.println(temp);
        }
    }
}