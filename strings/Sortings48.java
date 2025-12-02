package strings;
import java.util.Arrays;
import java.util.Scanner;
public class Sortings48 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String sa[]=s1.split("\\s+");
		System.out.println(Arrays.toString(sa));
		for(int i=0;i<sa.length;i++) {
			for(int j=i+1;j<sa.length;j++) {
				int n=(sa[i].compareTo(sa[j]));
				if(n>0) {
					String str= sa[i];
					sa[i]=sa[j];
					sa[j]=str;
				}
			}
		}
		System.out.println(Arrays.toString(sa));
	}
}
