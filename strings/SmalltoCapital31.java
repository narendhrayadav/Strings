package strings;
import java.util.Scanner;
public class SmalltoCapital31 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String str="";
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(Character.isUpperCase(ch)) {
				ch=Character.toLowerCase(ch);
			}
			else if(Character.isLowerCase(ch)) {
				ch=Character.toUpperCase(ch);
			}
			str+=ch;
		}
		System.out.println(str+" ");
	}
}
