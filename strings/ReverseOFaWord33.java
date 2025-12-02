package strings;
import java.util.Scanner;
public class ReverseOFaWord33 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String str="";
		for(int i=0;i<s1.length();i++) {
			str=s1.charAt(i)+str;
		}
		System.out.println(str);
	}
	
}
