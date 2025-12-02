package strings;
import java.util.Arrays;
import java.util.Scanner;
public class UseCase54 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s3=s1.concat(" "+s2);
		String sa[]=s3.split("\\s+");
		for(int i=0;i<sa.length;i++) {
			for(int j=i+1;j<sa.length;j++) {
				if(sa[i].length()>sa[j].length()) {
					String str=sa[i];
					sa[i]=sa[j];
					sa[j]=str;
				}
				else if(sa[i].length()==sa[j].length()) {
					int n=sa[i].compareTo(sa[j]);
					if(n>0) {
						String str=sa[i];
						sa[i]=sa[j];
						sa[j]=str;
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(sa));
		
	}
}
