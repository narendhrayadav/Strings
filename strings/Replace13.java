package strings;
import java.util.Scanner;

public class Replace13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=s.replace(',', ' ');
		System.out.println(s1);
	}
}
