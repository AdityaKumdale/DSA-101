import java.util.*;

class Maximum_Length_Even_Subarray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		
		while(t-- > 0 ){
		    
		    int n = sc.nextInt();
            
            int sum = n * ( n + 1 ) /2;
            
            if( (sum&1) == 0 ){      //(sum & 1) will be 0 for even numbers (since bitwise AND with 1 results in 0 if the number is even) and 1 for odd numbers.
                System.out.println( n );
            }
            else{
                System.out.println( n - 1 );
            }
		    
		}
	}
}
