import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int number = sc.nextInt();
            int k = sc.nextInt();
                while(k>0){
                    if(number%10==0){
                        number=number/10;
                    }
                    else{
                        number-=1;
                    }

                    k--;
                }
            System.out.println(number);
        }
    }
}
