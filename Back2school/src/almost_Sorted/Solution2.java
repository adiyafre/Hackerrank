package almost_Sorted;

import java.util.Scanner;

public class Solution2 {
	
	public static int checkSwapNear(int[] a, int[] p, int n){
		boolean check = false;
		int count = 0;
		int pos = 0;
			for(int i=0; i<n; i++)
				if (p[i]==1) {count++; pos=i;}
			
			if(count==1) {
				int temp = a[pos]; 
				a[pos] = a[pos+1];
				a[pos+1] = temp;
				
				
				check = true;
			}
		
		
		if (check) return pos;
		else return -1;
		
	}
	
	public static int[][] checkSwapFar(int[] a, int[] p, int n){
		boolean check = false;
		int count = 0;
		int pos = 0;
		int posprev = 0;	
		
		int[][] ret = new int[1][2];
		ret[0][0] = -1; 
		ret[0][1] = -1;

		
		 for(int i=0; i<n; i++)
				if (p[i]==1) {count++; posprev=pos; pos=i; }
			
			
		 
		 	if(count==2 ) {
				
							
				
				int temp = a[posprev]; 
				a[posprev] = a[pos+1];
				a[pos+1] = temp;
				
				
				
				ret[0][0] = posprev;
				ret[0][1] = pos;
				check = true;
			}

			
			return ret;
			
			
	}
	
	
	
	public static int checkSwapMid(int[] a, int[] p, int n){
		boolean check = false;
		int count = 0;
		int pos = 0;
			for(int i=0; i<n; i++)
				if (p[i]==1) {count++; pos=i;}
			
			if(count==2 && p[pos]==1 & p[pos+1] ==1) {
				int temp = a[pos]; 
				a[pos] = a[pos+2];
				a[pos+2] = temp;
				
				
				check = true;
			}
		
			
			if (check) return pos;
			else return -1;
	}
	
	
	
	
	
	public static boolean checkSort(int[] a, int n){
		
		boolean sorted = true;
		for (int i = 0 ; i<n-1; i++)
		 	if (a[i]>a[i+1]) sorted = false;
		
		return sorted;
		
		
			
	}


    public static void main(String[] args) {
        
    	
    	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];
		
		int[] p = new int[n];

		
		for (int t = 0; t<n; t++){
		
			
			a[t] = sc.nextInt();

		
		}
		
		
	
        
        
        int[][] tempa = new int[1][2];
		
		boolean r = false;
        
        boolean index1 = false; 
        boolean	 index2 = false;
        int pos1 = 0; 
        int pos2 = 0;
        
        
        
        for (int i = 0; i < n; i++) { if (!index1 && i > 0 && (a[i] < a[i - 1])) {pos1 = i - 1; index1 = true;} }
  	
        for (int t = 0; t<n-1; t++){ if (a[t]<a[t+1]) p[t] = 0; }
	
        
        p[n-1] = 0;
        
        for (int i = 0; i < n; i++) {if (!index1 && i > 0 && (a[i] < a[i - 1])) {pos1 = i - 1; index1 = true; }}
   		
        if (checkSort(a,n)) r = true;
			else if (checkSwapNear(a,p,n)>-1) {r = checkSort(a,n);  }
				else if (checkSwapMid(a,p,n)>-1) {r = checkSort(a,n); }
					else {tempa = checkSwapFar(a,p,n); 
							if (tempa[0][0]>-1) {r = checkSort(a,n); }

					}
   		
   		
        while (index1 && pos1 - 1 >= 0 && a[pos1] == a[pos1 - 1]) pos1--;
        for (int i = n - 1; i > 0; i--) {if (a[i] < a[i - 1]) {pos2 = i; break; }}
        
        while (index1 && pos2 + 1 < n && a[pos2] == a[pos2 + 1]) pos2++;
        if (pos2 == 0 && pos1 == 0) System.out.println("yes");
         else {int temp = a[pos1]; a[pos1] = a[pos2]; a[pos2] = temp;
             if (checkSort(a,n)) {System.out.println("yes");System.out.println("swap " + (pos1 + 1) + " " + (pos2 + 1));
             	} else {int tmp = a[pos1]; a[pos1] = a[pos2];a[pos2] = tmp;            
                int j = 0;
                for (int i = pos1; i <= pos1 + (pos2 - pos1) / 2; i++) {int tempo = a[i]; a[i] = a[pos2-j];a[pos2-j] = tempo; j++; }
                if (checkSort(a,n)) {System.out.println("yes"); System.out.println("reverse " + (pos1 + 1) + " " + (pos2 + 1));} 
                else System.out.println("no");
                
            }
        }
        
       
    }
   
}


    
	
	

