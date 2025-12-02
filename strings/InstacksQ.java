package strings;
import java.util.Scanner;
public class InstacksQ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s3=s1.length()>s2.length()?s1:s2;
		String s4=s1.length()<s2.length()?s1:s2;
		int wc=0;
		for(int i=0;i<s3.length();i++) {
			int ir=0;
			for(int j=i;j<s3.length();j++) {
				if(s3.charAt(i)==s3.charAt(j)) {
					ir++;
				}
			}
			if(ir==1) {
				wc++;
			}
		}
		System.out.println(s3+" ");
		System.out.println(s4+" ");
		int c=0;
		int p=0;
		loop:
		for(int i=0;i<s3.length();i++) {
			p=0;
			char ch=s3.charAt(i);
			if(Character.isLetter(ch)) {
				for(int j=0;c<s4.length();j++) {
					char ch1=s4.charAt(j);
					if(Character.isLetter(ch1)) {
						if(ch==ch1) {
							c++;
							break;
						}
					}
					else {
						p=-1;
						break loop;
					}
				}
			}
			else {
				p=-1;
				break loop;
			}
		}
		System.out.println(c+" ");
		if(p==-1) {
			System.out.println("Invalid Inputs");
		}
		else if(s1.length()==s2.length()&&c!=wc) {
			System.out.println("No");
		}
		else if(c==s4.length()) {
				System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
