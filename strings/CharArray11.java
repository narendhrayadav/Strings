package strings;
import java.util.Arrays;
import java.util.Scanner;
public class CharArray11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ca[]=s.toCharArray();
		System.out.print(Arrays.toString(ca));
	}
}
