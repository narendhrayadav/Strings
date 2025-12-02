package strings;
import java.util.Scanner;
public class BikeNumberPlate23 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		String number=sc.nextLine();
		int c=0;
		for(int i=0;i<=1;i++) {
			char ch=number.charAt(i);
			if(Character.isUpperCase(ch)) {
				c++;
			}
		}
		for(int i1=2;i1<=3;i1++) {
			char ch=number.charAt(i1);
			if(Character.isDigit(ch)) {
				c++;
			}
		}
		for(int i2=4;i2<=5;i2++) {
			char ch=number.charAt(i2);
			if(Character.isUpperCase(ch)) {
				c++;
			}
		}
		for(int i3=6;i3<=9;i3++) {
			char ch=number.charAt(i3);
			if(Character.isDigit(ch)) {
				c++;
			}
		}
		if(c==10) {
			System.out.println("Valid Number Plate");
		}
		else {
			System.out.println("Invalid Number Plate");
		}
		
	}
}
