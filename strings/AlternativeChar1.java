package strings;

import java.util.Scanner;

public class AlternativeChar1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=0;
		for(int i=0;i<s.length();i++) {
			count++;
			if(count%2==1) {
				System.out.print(s.charAt(i));
			}
		}
	}
}
