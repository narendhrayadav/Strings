package strings;
import java.util.Scanner;
public class EqualsIgnore18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.nextLine();
		boolean s2=s.equalsIgnoreCase(s1);
		System.out.println(s2);
	}
}
