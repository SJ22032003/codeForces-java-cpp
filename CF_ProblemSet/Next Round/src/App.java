import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int player = sc.nextInt();
            int points = sc.nextInt();

            int[] score = new int[player];
            int temp = 0;
            for (int i = 0; i < player; i++) {
                score[i] = sc.nextInt(); 
            }
            for (int j = 0; j < player; j++) {
                if(score[j] >= score[points-1] && score[j]!=0){
                    temp++;
                } 
            }


            System.out.println(temp);
        }
    }
}
