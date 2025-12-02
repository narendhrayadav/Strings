package strings;

import java.util.Arrays;
import java.util.Scanner;
public class Sorting50 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char ch[]=s1.toCharArray();
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char ch1=ch[i];
					ch[i]=ch[j];
					ch[j]=ch1;
				}
			}
		}
		System.out.println(Arrays.toString(ch));
		
	}
}
