package _4_Cross_Matrix;
import java.util.Scanner;



public class Solution {
		
	
	public static int leftline(int i, int j, int[][] _a){
		
		int count = 0;j--;
		while(j>=0 && _a[i][j]==1){j--; count++;} return count;
	}
	
	public static int topline(int i, int j, int[][] _a){
		
		int count = 0; i--;
		while(i>=0 && _a[i][j]==1){i--; count++;} return count;
	}
	
	public static int rightline(int i, int j, int[][] _a, int _n){
		
		int count = 0;j++;
		while(j<_n && _a[i][j]==1){j++; count++;} return count;
	}
	
	public static int bottomline(int i, int j, int[][] _a, int _n){
		
		int count = 0;i++;
		while(i<_n && _a[i][j]==1){i++; count++;} return count;
	}
	
	
	public static int lefttop(int i, int j, int[][] _a, int _n, int leftline, int topline){
		
		int count = 0;
		int i1 = i-1;
		int j1 = j-1;
		int lim = j-leftline;
		
		
		while(i1>=i-topline && _a[i1][j1]==1){
			
			
			while(j1>=lim && _a[i1][j1]==1){
				
				 count++;
				j1--;
			}
			
			if (j1>=lim)
			if (_a[i1][j1] == 0)lim = ++j1;
			
			i1--;
			j1 = j-1;
			
			
		}
		return count;
		
	}
	
	public static int topright(int i, int j, int[][] _a, int _n, int topline, int rightline){
		
		int count = 0;
		int i1 = i-1;
		int j1 = j+1;
		int lim = j+rightline;
		
		
		while(i1>=i-topline && _a[i1][j1]==1){
			
			
			while(j1<=lim && _a[i1][j1]==1){
				
				 count++;
				j1++;
			}
			
			if (j1<=lim)
			if (_a[i1][j1] == 0) lim = --j1;
			
			i1--;
			j1 = j+1;
			
			
		}
		return count;
		
	}
	
	public static int rightbottom(int i, int j, int[][] _a, int _n, int rightline, int bottomline){
		
		int count = 0;
		int i1 = i+1;
		int j1 = j+1;
		int lim = j+rightline;
		
		
		while(i1<=i+bottomline && _a[i1][j1]==1){
			
			
			while(j1<=lim && _a[i1][j1]==1){
				
				 count++;
				 j1++;
			}
			
			if (j1<=lim)
			if (_a[i1][j1] == 0) lim = --j1;
			
			i1++;
			j1 = j+1;
			
			
		}
		return count;
		
	}
	
	public static int bottomleft(int i, int j, int[][] _a, int _n, int bottomline, int leftline){
		
		int count = 0;
		int i1 = i+1;
		int j1 = j-1;
		int lim = j-leftline;
		
		
		while(i1<=i+bottomline && _a[i1][j1]==1){
			
			
			while(j1>=lim && _a[i1][j1]==1){
				
				 count++;
				 j1--;
			}
			
			if (j1>=lim)
			if (_a[i1][j1] == 0) lim = ++j1;
			
			i1++;
			j1 = j-1;
			
			
		}
		return count;
		
	}
	
	
	public static long count(int i,int j,int[][] _a, int _n){
		long constant = 1000000007;
		
		int LEFTLINE = 0;
		int TOPLINE = 0;
		int RIGHTLINE = 0;
		int BOTTOMLINE = 0;
		
		System.out.println("i,j: "+i+":"+j);
		
		
		//LEFT LINE
		if (j-1>=0)LEFTLINE=leftline(i,j,_a);
		//TOP LINE
		if (i-1>=0)TOPLINE=topline(i,j,_a);
		//RIGHT LINE
		if (j+1<_n)RIGHTLINE=rightline(i,j,_a,_n);
		//BOTTOM LINE
		if (i+1<_n)BOTTOMLINE=bottomline(i,j,_a,_n);
		
		System.out.println("LEFLINE:"+LEFTLINE);
		System.out.println("TOPLINE:"+TOPLINE);
		System.out.println("RIGHTLINE:"+RIGHTLINE);
		System.out.println("BOTTOMLINE:"+BOTTOMLINE);
		
		
		//LEFT TOP CURVE
		long LEFT_TOP_CURVE = 0;
		if (LEFTLINE>0 && TOPLINE>0) LEFT_TOP_CURVE = LEFTLINE*TOPLINE;
		//TOP RIGHT CURVE
		long TOP_RIGHT_CURVE = 0;
		if (TOPLINE>0 && RIGHTLINE>0) TOP_RIGHT_CURVE = TOPLINE*RIGHTLINE;
		//RIGHT BOTTOM CURVE
		long RIGHT_BOTTOM_CURVE = 0;
		if (RIGHTLINE>0 && BOTTOMLINE>0) RIGHT_BOTTOM_CURVE = RIGHTLINE*BOTTOMLINE;
		//BOTTOM LEFT CURVE
		long BOTTOM_LEFT_CURVE = 0;
		if (BOTTOMLINE>0 && LEFTLINE>0) BOTTOM_LEFT_CURVE = BOTTOMLINE*LEFTLINE;
		
		//TOP BOTTOM SIDE
		long TOP_BOTTOM_SIDE = 0;
		if (TOPLINE>0 && BOTTOMLINE>0) TOP_BOTTOM_SIDE = TOPLINE*BOTTOMLINE;
		
		//LEFT RIGHT SIDE
		long LEFT_RIGHT_SIDE = 0;
		if (LEFTLINE>0 && RIGHTLINE>0) LEFT_RIGHT_SIDE = LEFTLINE*RIGHTLINE;
		
		
		
		System.out.println("LEFT_TOP_CURVE: "+LEFT_TOP_CURVE);
		System.out.println("TOP_RIGHT_CURVE: "+TOP_RIGHT_CURVE);
		System.out.println("RIGHT_BOTTOM_CURVE: "+RIGHT_BOTTOM_CURVE);
		System.out.println("BOTTOM_LEFT_CURVE: "+BOTTOM_LEFT_CURVE);
		System.out.println("TOP_BOTTOM_SIDE: "+TOP_BOTTOM_SIDE);
		System.out.println("LEFT_RIGHT_SIDE: "+LEFT_RIGHT_SIDE);
		
		//LEFT TOP CUBE
		
		long LEFT_TOP_CUBE = 0;
		if (LEFTLINE>0 && TOPLINE>0) LEFT_TOP_CUBE = lefttop(i,j,_a,_n,LEFTLINE,TOPLINE);
		
		//TOP RIGHT CUBE
		long TOP_RIGHT_CUBE = 0;
		if (TOPLINE>0 && RIGHTLINE>0) TOP_RIGHT_CUBE = topright(i,j,_a,_n,TOPLINE,RIGHTLINE);
		
		//RIGHT BOTTOM CUBE
		long RIGHT_BOTTOM_CUBE = 0;
		if (RIGHTLINE>0 && BOTTOMLINE>0) RIGHT_BOTTOM_CUBE = rightbottom(i,j,_a,_n,RIGHTLINE,BOTTOMLINE);
		
		//BOTTOM LEFT CUBE
		long BOTTOM_LEFT_CUBE = 0;
		if (BOTTOMLINE>0 && LEFTLINE>0) BOTTOM_LEFT_CUBE = bottomleft(i,j,_a,_n,BOTTOMLINE,LEFTLINE);
		
		
		System.out.println("LEFT_TOP_CUBE: "+LEFT_TOP_CUBE);
		System.out.println("TOP_RIGHT_CUBE: "+TOP_RIGHT_CUBE);
		System.out.println("RIGHT_BOTTOM_CUBE: "+RIGHT_BOTTOM_CUBE);
		System.out.println("BOTTOM_LEFT_CUBE: "+BOTTOM_LEFT_CUBE);
		
		
		//LEFT TOP COUNT
		long LEFT_TOP_SUM=0;
		if (LEFT_TOP_CUBE>0 ){
			
			LEFT_TOP_SUM = LEFT_TOP_CUBE*RIGHTLINE + LEFT_TOP_CUBE*BOTTOMLINE+
					LEFT_TOP_CUBE*RIGHT_BOTTOM_CUBE;
			
					
		}
		//TOP RIGHT COUNT
		long TOP_RIGHT_SUM=0;
		if (TOP_RIGHT_CUBE>0 ){
			
			TOP_RIGHT_SUM = TOP_RIGHT_CUBE*LEFTLINE + TOP_RIGHT_CUBE*BOTTOMLINE+
					TOP_RIGHT_CUBE*BOTTOM_LEFT_CUBE;
			
				
		}
		//RIGHT BOTTOM COUNT
		long RIGHT_BOTTOM_SUM=0;
		if (RIGHT_BOTTOM_CUBE>0 ){
			
			RIGHT_BOTTOM_SUM = RIGHT_BOTTOM_CUBE*LEFTLINE + RIGHT_BOTTOM_CUBE*TOPLINE+
					+RIGHT_BOTTOM_CUBE*LEFT_TOP_CUBE;
			
					
		}
		//BOTTOM LEFT COUNT
		long BOTTOM_LEFT_SUM=0;
		if (BOTTOM_LEFT_CUBE>0 ){
			
			BOTTOM_LEFT_SUM = BOTTOM_LEFT_CUBE*RIGHTLINE + BOTTOM_LEFT_CUBE*TOPLINE+
					 BOTTOM_LEFT_CUBE*TOP_RIGHT_CUBE;
			
					
		}
		
		
		long X_SUM = 0;
		
		
		if (TOPLINE>0 && BOTTOMLINE>0 && RIGHTLINE>0) X_SUM=(RIGHTLINE+LEFTLINE)*(TOPLINE+BOTTOMLINE+1) - TOP_RIGHT_CURVE - RIGHT_BOTTOM_CURVE; 
		else if (TOPLINE>0 && BOTTOMLINE>0 && LEFTLINE>0) X_SUM=(RIGHTLINE+LEFTLINE)*(TOPLINE+BOTTOMLINE+1) - LEFT_TOP_CURVE - BOTTOM_LEFT_CURVE;
		else if (RIGHTLINE>0 && LEFTLINE>0 && TOPLINE>0) X_SUM=(RIGHTLINE+LEFTLINE+1)*(TOPLINE+BOTTOMLINE) - LEFT_TOP_CURVE - TOP_RIGHT_CURVE  ;
		else if (RIGHTLINE>0 && LEFTLINE>0 && BOTTOMLINE>0) X_SUM=(RIGHTLINE+LEFTLINE+1)*(TOPLINE+BOTTOMLINE) - RIGHT_BOTTOM_CURVE - BOTTOM_LEFT_CURVE ;
		
		

		
		System.out.println("LEFT_TOP_SUM: "+LEFT_TOP_SUM);
		System.out.println("TOP_RIGHT_SUM: "+TOP_RIGHT_SUM);
		System.out.println("RIGHT_BOTTOM_SUM: "+RIGHT_BOTTOM_SUM);
		System.out.println("BOTTOM_LEFT_SUM: "+BOTTOM_LEFT_SUM);
		System.out.println("X_SUM: "+X_SUM);
		
		System.out.println();
		System.out.println("sum: "+(double)(
				LEFT_TOP_CURVE+TOP_RIGHT_CURVE+RIGHT_BOTTOM_CURVE+
				BOTTOM_LEFT_CURVE+
				TOP_BOTTOM_SIDE+LEFT_RIGHT_SIDE+
				LEFT_TOP_SUM+TOP_RIGHT_SUM+RIGHT_BOTTOM_SUM+BOTTOM_LEFT_SUM+X_SUM));
		
		
		return LEFT_TOP_CURVE+TOP_RIGHT_CURVE+RIGHT_BOTTOM_CURVE+
				BOTTOM_LEFT_CURVE+
				TOP_BOTTOM_SIDE+LEFT_RIGHT_SIDE+
				LEFT_TOP_SUM+TOP_RIGHT_SUM+RIGHT_BOTTOM_SUM+BOTTOM_LEFT_SUM+X_SUM;
		
		
		
	}
	
	
	
	
	
	
	
	public static void solve(int[][] _a, int _n){
		long constant = 1000000007;
		
		long sum = 0;
		
		for(int i=0; i<_n; i++)
			for(int j=0; j<_n; j++){
				
				if (_a[i][j]==1) sum+=count(i,j,_a,_n)*2;
				
				if (sum>=constant) {sum = sum%constant;}
				
				//System.out.println(_a[i][j]);
			}
		
		
		  
		//sum = count(0,3,_a,4);
		 
		
		System.out.println(sum);

	}
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int[][] a = new int[n][n];
		for (int i = 0; i<n; i++){
			
			String s = sc.next();
			StringBuilder str = new StringBuilder(s);
			for (int j=0; j<n; j++){
				
				
				a[i][j]=Integer.parseInt(""+str.charAt(j));
			

			
			
			}
			

		}
			
		
		
	solve(a,n);
				
		
		
	};
}
