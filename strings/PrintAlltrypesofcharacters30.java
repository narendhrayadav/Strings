package strings;
import java.util.Scanner;
public class PrintAlltrypesofcharacters30 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String uc="",lc="",dc="",spc="";
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(Character.isUpperCase(ch)) {
				uc+=ch;
			}
			else if(Character.isLowerCase(ch)) {
				lc+=ch;
			}
			else if(Character.isDigit(ch)) {
				dc+=ch;
			}
			else {
				spc+=ch;
			}
		}
		System.out.println(lc+" "+uc+" "+dc+" "+spc+" ");
	}
}
