package strings;
import java.util.Scanner;
public class DuplicateCount44 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String sa[]=s1.split("\\s+");
		int dc=0;
		for(int i=0;i<sa.length;i++) {
			int r=0,t=0;
			for(int j=0;j<sa.length;j++) {
				if(sa[i].equals(sa[j])) {
					t++;
				}
			}
			for(int j=i+1;j<sa.length;j++) {
				if(sa[i].equals(sa[j])) {
					r++;
				}
			}
			if(r==1) {
				System.out.println(sa[i]+" "+t);;
				
			}
		}
		
				
	}
}
