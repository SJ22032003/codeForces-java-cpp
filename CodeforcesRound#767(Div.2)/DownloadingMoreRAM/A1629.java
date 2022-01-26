import java.util.*;
public class A1629{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int t = sc.nextInt();
			while(t-- >0){
				int n = sc.nextInt(), k = sc.nextInt();
				int[] a = new int[n]; int[] b = new int[n];int[] newA = new int[n]; 
				for (int i=0;i<n;i++) {
					a[i] = sc.nextInt();
					newA[i] = a[i]; 
				}
				for (int i=0;i<n;i++) {
					b[i] = sc.nextInt();
				}
				Arrays.sort(newA);
				for(int i=0;i<n;i++){
					if(k>=newA[i]){
						int v =	Arrays.asList(a).indexOf(newA[i]);
						k += b[v];
					}
				}
				System.out.println(k);
			}
		}
	}
}