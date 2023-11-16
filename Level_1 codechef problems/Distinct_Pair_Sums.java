import java.util.Scanner;

public class Distinct_Pair_Sums {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0 ){
		    int L = sc.nextInt();
		    int R = sc.nextInt();
		    
		    if(L == R)
		        System.out.println(1);
		    else{
		        int range = 2*R-2*L;
		        System.out.println(range+1);
		    }
		}
	}
}
