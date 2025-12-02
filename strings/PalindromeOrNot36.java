package strings;
import java.util.Scanner;
public class PalindromeOrNot36 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=s1.replace("\\S+","");
		String str="";
		System.out.println(s2);
		for(int i=0;i<s2.length();i++) {
			str=s2.charAt(i)+str;
		}
		if(s2.equalsIgnoreCase(str)) {
			System.out.println("given String is  palindrome");
		}
		else {
			System.out.println("given String is  not a palindrome");
		}
		
	}
}
