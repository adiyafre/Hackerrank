package grid_Search;

import java.util.Scanner;


public class Solution {


	
	public static void main(String[] args) {
		
		

		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		
		for (int k=1; k<=t; k++){
		

		int R = sc.nextInt();

		int C = sc.nextInt();

		
				
		String[] pattern = new String[R];
				
			
		sc.nextLine(); 
		
		for (int i = 0; i<R; i++){
			pattern[i] = sc.nextLine(); 
			
		}
		
		
		int r = sc.nextInt();

		int c = sc.nextInt();

		sc.nextLine();
		
		String[] look = new String[r];
				
				
		for (int i = 0; i<r; i++){
			look[i] = sc.nextLine(); 
			//System.out.println(i+";"+look[i].toString());
			
		}
		
		
		
		boolean found = false;
		boolean subool = true;
		boolean yes = false;
		
		for (int i = 0; i<R; i++){
			int ind=pattern[i].indexOf(look[0]);
			found = false;
			if (ind>-1)	
				found = true;
				
			
			
			if(found){
				subool = true;
				for(int j=1; j<r&&subool; j++){
					if(i+j>=R){subool=false; break;}
					else
					if (!(pattern[i+j].substring(ind,ind+c+1)).equals(look[j]))subool=false;
					
				}
				if (subool) {yes = true; break;}
				
			}
			
			
			
		}
		
		if (yes) System.out.println("YES");
		else System.out.println("NO");
			

		}
		
	}

}
