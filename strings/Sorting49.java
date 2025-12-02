package strings;
import java.util.Scanner;
public class Sorting49 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int n=sc.nextInt();
		String sa[]=s1.split("\\s+");
		for(int i=0;i<sa.length;i++) {
			int t=0,ir=0;
			for(int j=0;j<sa.length;j++) {
				if(sa[i].equals(sa[j])) {
					t++;
				}
			}
			for(int j=i;j<sa.length;j++) {
				if(sa[i].equals(sa[j])) {
					ir++;
				}
			}
			if(t==ir&&t==n) {
				System.out.print(sa[i]+" ");
			}
		}
	}
}
