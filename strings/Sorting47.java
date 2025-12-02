package strings;
import java.util.Arrays;
import java.util.Scanner;
public class Sorting47 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String sa[]=s1.split("\\s+");
		for(int i=0;i<sa.length;i++) {
			for(int j=i+1;j<sa.length;j++) {
				if(sa[i].length()<sa[j].length()) {
					String str=sa[j];
					sa[j]=sa[i];
					sa[i]=str;
				}
			}
		}
		System.out.println(Arrays.toString(sa));
	}
}
