package strings;
import java.util.Scanner;
public class AlternativeConversion32 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String str="";
		int c=0;
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(Character.isLetter(ch)) {
				if(Character.isLowerCase(ch)) {
					c++;
					if(c%2==1) {
						ch=Character.toUpperCase(ch);
					}
				}
				else if(Character.isUpperCase(ch)) {
					c++;
					if(c%2==1) {
						ch=Character.toLowerCase(ch);
					}
				}
				
			}
			str+=ch;
		}
		System.out.println(str+" ");
	}
}
