package strings;
import java.util.Scanner;
public class CountOfCharacters38 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char[] ca=s1.toCharArray();
		for(int i=0;i<ca.length;i++) {
			int t=0;
			for(int j=0;j<ca.length;j++) {
				if(ca[i]==ca[j]) {
					t++;
				}
			}
			System.out.println(ca[i]+"---->"+t);
		}
	}
}
