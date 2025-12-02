package strings;
import java.util.Scanner;
public class PanCard22 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String pan=sc.nextLine();
		String name=sc.nextLine();
		int c=0;
		char nc=name.charAt(name.lastIndexOf(' ')+1);
		nc=Character.toUpperCase(nc);
		if(pan.length()==10) {
			char ch;
			for(int i=0;i<=2;i++) {
				ch=pan.charAt(i);
				if(Character.isUpperCase(ch)) {
					c++;
				}
			}
			ch=pan.charAt(3);
			if(ch=='P'||ch=='C'||ch=='F'||ch=='A'||ch=='H'||ch=='T') {
				c++;
			}
			ch=pan.charAt(4);
			if(nc==ch) {
				c++;
			}
			for(int i=5;i<=8;i++) {
				ch=pan.charAt(i);
				if(Character.isDigit(ch)) {
					c++;
				}
			}
			if(Character.isUpperCase(pan.charAt(9))) {
				c++;
			}
		}
		if(c==10) {
			System.out.println("Valid Pan Number");
		}
		else {
			System.out.println("Invalid Pan Number");
		}
	}
}
