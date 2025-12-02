package strings;
import java.util.Scanner;
public class CountOfWord37 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String sa[]=s1.split("\\s+");
		for(int i=0;i<sa.length;i++) {
			int t=0;
			for(int j=0;j<sa.length;j++) {
				if(sa[i].equals(sa[j])) {
					t++;
				}
			}
			System.out.println(sa[i]+"--->"+t);
		}
	}
}
