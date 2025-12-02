package strings;

import java.util.Scanner;
public class ValidParenthasis {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String str="";boolean b=true;
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch=='{'||ch=='['||ch=='(') {
				str+=ch;
			}
			else {
				if(str.isEmpty()) {
					b=false;
					break;
				}
				char x=str.charAt(str.length()-1);
				if(x=='{'&&ch=='}'||x=='['&&ch==']'||x=='('&&ch==')') {
					str=str.substring(0,str.length()-1);
				}
				else {
					b=false;
					break;
				}
			}
		}
		if(!str.isEmpty()) {
			b=false;
		}
		if(b) {
			System.out.println("Valid ");
		}
		else {
			System.out.println("Not Valid");
		}
	}
}
