/* https://www.codechef.com/practice/course/1to2stars/LP1TO201/problems/TANDJ1?tab=statement */

import java.util.*;

public class Tom_And_Jerry_1 {
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int d=sc.nextInt();
		    int k=sc.nextInt();
		    int j=Math.abs(a-c)+Math.abs(b-d);
		    //System.out.println(j);
		    if(k>=j){
		    if((k-j)%2==0){
		        System.out.println("YES");
		    }
		    else {
		        System.out.println("NO");
		    }
		    }
		    else{
		        System.out.println("NO");
		    }
		    
		}
		
	}
}