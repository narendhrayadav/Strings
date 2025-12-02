package strings;
import java.util.Scanner;
public class DictionaryOrder19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.nextLine();
		int n=s.compareTo(s1);
		int n1=s.compareToIgnoreCase(s1);
		if(n>0) {
			System.out.println(s1+" ");
		}
		else {
			System.out.println(s+" ");
		}
		if(n>0) {
			System.out.println(s1+" ");
		}
		else {
			System.out.println(s+" ");
		}
		System.out.println(n);
	}
}
