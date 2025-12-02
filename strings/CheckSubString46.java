package strings;
import java.util.Scanner;
public class CheckSubString46 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String sub=sc.nextLine();
		boolean b=false;
		loop1:
		for(int i=0;i<s1.length();i++) {
			for(int j=i;j<s1.length();j++) {
				String ss=s1.substring(i,j+1);
				if(ss.equals(sub)) {
					b=true;
					break loop1;
				}
			}
		}
		if(b) {
			System.out.println("String present");
		}
		else {
			System.out.println("String not present");
		}
	}
}
