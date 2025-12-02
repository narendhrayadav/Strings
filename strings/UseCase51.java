package strings;
import java.util.Scanner;
public class UseCase51 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String split1[]=s1.split("\\s+");
		String s2=sc.nextLine();
		String split2[]=s2.split("\\s+");
		for(int i=0;i<split1.length;i++) {
			int t=0,il=0;
			for(int j=0;j<split2.length;j++) {
				if(split1[i].equals(split2[j])) {
					t++;
				}
			}
			for(int j=0;j<=i;j++) {
				if(split1[i].equals(split1[j])) {
					il++;
				}
			}
			if(il<=t) {
				System.out.println(split1[i]);
			}
		}
	}
}
