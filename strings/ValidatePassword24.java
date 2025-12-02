package strings;
import java.util.Scanner;
public class ValidatePassword24 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String password=sc.nextLine();
		boolean uc=false,lc=false,dc=false,sp=false,spec=true;
		for(int i=0;i<password.length();i++) {
			char ch=password.charAt(i);
			if(Character.isUpperCase(ch)) {
				uc=true;
			}
			else if(Character.isLowerCase(ch)) {
				lc=true;
			}
			else if(Character.isDigit(ch)) {
				dc=true;
			}
			else if(ch!=' ') {
				sp=true;
			}
			else {
				spec=false;
				break;
			}
		}
		if(uc&&lc&&dc&&sp&&spec&&password.length()==9) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password");
		}
	}
}
