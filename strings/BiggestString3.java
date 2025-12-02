package strings;

import java.util.Arrays;
import java.util.Scanner;

public class BiggestString3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String sa[]=s.split(" ");
		String s1 = null;
		int h=Integer.MIN_VALUE;
		for(int i=0;i<sa.length;i++) {
			if(sa[i].length()<h) {
				h=sa[i].length();
				System.out.println(h+" ");
				s1=sa[i];
			}
		}
		System.out.println(s1+" ");
		System.out.println(Arrays.toString(sa));
		
	}
}
