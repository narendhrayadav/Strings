package strings;
import java.util.Scanner;
public class LongestUniquesCharWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int p=0;
        String s2="";
    for(int i=0;i<s1.length();i++){
        for(int j=i;j<s1.length();j++){
            String ss="";
            for(int k=i;k<=j;k++){
                ss+=s1.charAt(k);
            }
            //System.out.println(ss);
            //char ca[]=ss.toCharArray();
            p=0;
            for(int k=0;k<ss.length();k++){
                int t=0;
                for(int l=0;l<ss.length();l++){
                    if(ss.charAt(k)==ss.charAt(l)){
                        t++;
                    }
                }
                if(t!=1){
                    p=-1;
                    break;
                }  
            }
            if(p==0&&ss.length()>s2.length()){
                s2=ss;   
            } 
        }
    }
    System.out.print(s2);
	}
}
