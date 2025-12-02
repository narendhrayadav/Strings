package strings;
import java.util.Scanner;
public class CommonPrefix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String sa[]=new String[n];
		for(int i=0;i<n;i++) {
			sa[i]=sc.next();
		}
		String s=sa[0];String str="";
		loop:
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			str+=ch;
			for(int j=0;j<sa.length;j++) {
				if(!sa[j].startsWith(str)) {
					break loop;
				}
			}
		}
		System.out.println(str.substring(0,str.length()-1));
		
	}
}
