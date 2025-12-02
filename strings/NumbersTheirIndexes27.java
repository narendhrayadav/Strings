package strings;
import java.util.Scanner;
public class NumbersTheirIndexes27 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(Character.isDigit(ch)) {
				System.out.println(i+" "+ch);
			}
		}
	}
}
