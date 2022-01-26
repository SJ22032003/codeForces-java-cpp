import java.util.*;
public class A228{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			HashSet<String> color = new HashSet<>();
			for (int i=0;i<4;i++) {
				String n = sc.next();
			 	color.add(n);
			 }
			 System.out.println(4-color.size()); 
		}
	}
}