package strings;
import java.util.Scanner;
public class IndexValuesOfWord26 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String word=sc.nextLine();
		
		if(s1.contains(word)) {
			for(int i=0;i<word.length();i++) {
				System.out.println(s1.indexOf(word)+i);
			}
		}
		else {
			System.out.println("word not contains in a given string");
		}
	}
}
