package strings;
import java.util.Scanner;
public class PrimesInString {
	public static boolean isPrime(int a) {
		if(a<=1) {
			return false;
		}
		for(int i=2;i<=(int)Math.sqrt(a);i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String str="";
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(Character.isDigit(ch)) {
				str+=ch;
			}
			else {
				
				if(!str.isEmpty()) {
				int n = Integer.parseInt(str);
					if(isPrime(n)) {
						System.out.println(n);
				}
				str="";
			}
			}
		}
		if(!str.isEmpty()) {
			int n = Integer.parseInt(str);
				if(isPrime(n)) {
					System.out.println(n);
			}
			str="";
		}
	}
}

