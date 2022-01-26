import java.util.*;
public class A705{

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			String str = "";
			for (int i=1;i<=n;i++) {
				if(i%2==0){
					str +="I love that ";
				}else{
					str += "I hate that ";
				}
			}
			str = str.substring(0,str.length()-5).trim();
			System.out.print(str+" it");
		}
	}
}