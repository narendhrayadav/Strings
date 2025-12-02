package strings;
import java.util.Scanner;
public class MostRepeatedCharWord39 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String sa[]=s1.split("\\s+");
		int f=0; String str="";
		for(int i=0;i<sa.length;i++) {
			int t=0;
			for(int j=0;j<sa.length;j++) {
				if(sa[i].equals(sa[j])) {
					t++;
				}
			}
			if(t>f) {
				f=t;
				str=sa[i];
			}
		}
		System.out.println(str+"--->"+f);
		f=0;char ch=0;
		for(int i=0;i<s1.length();i++) {
			int t=0;
			for(int j=0;j<s1.length();j++) {
				if(s1.charAt(i)==s1.charAt(j)) {
					t++;
				}
			}
			if(t>f) {
				f=t;
				ch=s1.charAt(i);
			}
		}
		System.out.println(ch+"---->"+f);
	}
}
