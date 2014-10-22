package _2_John_and_GCD_list;
import java.util.Scanner;



public class Solution {
	
	static int  getLCM(int a,int b)
	{

	    int x;
	    int y;
	    if(a<b)
	    {
	        x=a;
	         y=b;   
	    }
	    else
	    {
	         x=b;
	         y=a;   
	    }
	    int i=1;
	    while(true)
	    {

	        int x1=x*i;
	        int y1=y*i;
	        for(int j=1;j<=i;j++)
	        {
	        if(x1==y*j)
	        {
	            return x1;
	        }
	        }

	        i++;
	    }



	}
	static int lcm(int i,int y)
	{
	    int n,x,s=1,t=1;
	    for(n=1;;n++)
	    {
	        s=i*n;
	        for(x=1;t<s;x++)
	        {
	            t=y*x;
	        }
	        if(s==t)
	            break;
	    }
	    return(s);
	}

	public static int[] solve(int[] a){
		int[] b = new int[a.length+1];
		b[0] = a[0];
		int i = 1;

		while (i<=a.length-1){
			
			
			//if (b[i-1]>a[i]) b[i]=getLCM(a[i],a[i-1]);
			//else
			b[i]=getLCM(a[i-1],a[i]); 
			
			i++;
		}
		b[a.length] = a[a.length-1];
		
		return b;
	};
	
	public static void print(int[] b){
		for (int i=0; i<b.length-1; i++)
			System.out.print(b[i]+" ");
		System.out.print(b[b.length-1]);
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		
		for (int i = 1; i<=t; i++){
		
			
			int n = sc.nextInt();
			int[] arr = new int[n];
			
			for(int j=0; j<n; j++){
				
				arr[j] = sc.nextInt();

			}
			
			print(solve(arr));
			System.out.println();
			
			
			
		}
		
				
		
		
	}

}
