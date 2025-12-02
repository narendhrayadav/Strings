package strings;
import java.util.Arrays;
import java.util.Scanner;
public class WordsDec40 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String sa[]=s1.split("\\s+");
		int se=0;
		for(int i=0;i<sa.length;i++) {
			int t=0;
			for(int  j=i;j<sa.length;j++) {
				if(sa[i].equals(sa[j])) {
					t++;
				}
			}
			if(t==1) {
				se++;
			}
		}
		String se1[]=new String[se];
		int fa[]=new int[se];
		int in=0;
		for(int i=0;i<sa.length;i++) {
			int t=0,ir=0;
			for(int j=0;j<sa.length;j++) {
				if(sa[i].equals(sa[j])) {
					t++;
				}
			}
			for(int j=i;j<sa.length;j++) {
				if(sa[i].equals(sa[j])) {
					ir++;
				}
			}
			if(t==ir) {
				se1[in]=sa[i];
				fa[in]=t;
				in++;
			}
		}
		System.out.println(Arrays.toString(se1));
		System.out.println(Arrays.toString(fa));
		for(int i=0;i<fa.length;i++) {
			for(int j=i+1;j<fa.length;j++) {
				if(fa[i]<fa[j]) {
					fa[i]=fa[i]+fa[j]-(fa[j]=fa[i]);
					String str=se1[j];
					se1[j]=se1[i];
					se1[i]=str;
				}
			}
		}
		System.out.println(Arrays.toString(se1));
		System.out.println(Arrays.toString(fa));
		
	}
}
