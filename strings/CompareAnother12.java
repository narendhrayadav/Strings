package strings;

import java.util.Scanner;

public class CompareAnother12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.nextLine();
		System.out.println(s.contains(s1));
		System.out.println(s.contentEquals(s1));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
	}
}
