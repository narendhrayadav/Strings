package strings;

import java.util.Scanner;

public class Aadhar21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String number=sc.nextLine();
		int c=0;
		for(int i=0;i<number.length();i++) {
			char ch=number.charAt(i);
			if(Character.isDigit(ch)) {
				c++;
			}
			else if(i==4&&ch==' '&&number.charAt(9)==' '||number.charAt(4)==' '&&i==9&&ch==' ');
			else {
				c=-1;
				break;
			}
		}
		if(c==12) {
			System.out.println("Valid Aadhar Number");
		}
		else {
			System.out.println("Invalid Aadhar Number");
		}
	}
}
