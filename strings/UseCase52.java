package strings;
import java.util.Scanner;
public class UseCase52 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String split1[]=s1.split("\\s+");
		String s2=sc.nextLine();
		String split2[]=s2.split("\\s+");
		for(int i=0;i<split1.length;i++) {
			int t1=0,t2=0;
			for(int j=0;j<split1.length;j++) {
				if(split1[i].equals(split1[j])) {
					t1++;
				}
			}
			for(int j=0;j<split2.length;j++) {
				if(split1[i].equals(split2[j])) {
					t2++;
				}
			}
			if(t1==1&&t2==1) {
				System.out.println(split1[i]);
			}
		}
	}
}
