package strings;
import java.util.Scanner;
public class UseCase55 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String sa=s1.replaceAll("\\s+","");
		System.out.println(sa);
		for(int i=0;i<sa.length();i+=3) {
			System.out.println(sa.substring(i,i+3));
		}
	}
}
