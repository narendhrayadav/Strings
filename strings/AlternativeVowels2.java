package strings;
import java.util.Scanner;
public class AlternativeVowels2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String ch=s.toLowerCase();
		int count=0;
		for(int i=0;i<ch.length();i++) {
			char ch1=ch.charAt(i);
			if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u') {
				count++;
				if(count%2==1) {
					System.err.print(ch1+" ");
				}
			}
		}
		
	}
}