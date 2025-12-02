package strings;

import java.util.Scanner;

public class ReplaceString14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=s.replace(sc.next(),sc.next());
		System.out.println(s1);
	}
}
