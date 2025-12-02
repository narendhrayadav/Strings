package strings;
import java.util.Scanner;
public class Check {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String str="";
		String rs="";
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(Character.isLetter(ch)) {
				rs=ch+rs;
			}
			else {
				str+=rs+" ";
				rs="";
			}
		}
		System.out.println(str);
	}
}
