package strings;
import java.util.Scanner;
public class UseCases56 {
	public static int nextPrime(int a) {
		for(int i=a+1;true;i++) {
			boolean b=true;
			for(int j=2;j<=(int)Math.sqrt(i);j++) {
				if(i%j==0) {
					b=false;
					break;
				}
			}
			if(b&&i>1) {
				return i;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s=s1.replaceAll("\\s+","");
//		int c=0;
//		for(int i=0;i<s.length();i+=c) {
//			c++;
//			if(i+c<s.length()) {
//				System.out.println(s.substring(i,i+c));
//			}
//			else {
//				System.out.println(s.substring(i));
//			}
//		}
		int c=0;
		for(int i=0;i<s.length();i+=c) {
			c=nextPrime(c);
			System.out.print(c+" ");
			if(i+c<s.length()) {
				System.out.println(s.substring(i,i+c));
			}
			else {
				System.out.println(s.substring(i));
			}
		}
	}
}
