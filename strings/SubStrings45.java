package strings;
import java.util.Scanner;
public class SubStrings45 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		for(int i=0;i<s1.length();i++) {
			for(int j=i;j<s1.length();j++) {
				String str="";
				for(int k=i;k<=j;k++) {
					str+=s1.charAt(k);
				}
//				String ss=s1.substring(i, j+1);
				System.out.println(str+" ");
			}
		}
		
	}
	
}
