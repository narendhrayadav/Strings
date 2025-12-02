package strings;
import java.util.Scanner;
public class AllIndexes7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char ch=sc.next().charAt(0);
		for(int i=0;i<s1.length();i++) {
			i=s1.indexOf(ch,i);
			if(i==1) {
				break;
			}
			System.out.println(i);
		}
	
	}
}
