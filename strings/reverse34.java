package strings;
import java.util.Scanner;
public class reverse34 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String sa[]=s1.split(" ");
		String str="";
		for(int i=0;i<sa.length;i++) {
			String rs="";
			for(int j=0;j<sa[i].length();j++) {
				rs=sa[i].charAt(j)+rs;
			}
			str+=rs+" ";
		}
		System.out.println(str);
		
	}
}
