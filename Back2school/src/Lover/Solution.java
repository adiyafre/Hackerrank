package Lover;

import java.util.Scanner;

public class Solution {
 public static void main(String[] args) {  
  
  int constant = 100003;
  int size = 4;
  Scanner sc = new Scanner(System.in);  
  
  
  int t = sc.nextInt();
    
  for (int p = 1 ; p<=t; p++){
	  
	   
  long n = sc.nextLong();
  int k = sc.nextLong();
  
    
  long[][] a = new long[size][k];   a[1][1] = 1;  a[2][1] = 2;

  int i=3;
  while(i <= n){
   for(int j = 1; j <= ((i+1)/2<k ? (i+1)/2 : k); j++ ){ if (j==1) a[3][j]=i; else a[3][j]=(a[2][j]+a[1][j-1]) % constant;   }
   
   
   
   for(int l = 1; l < 3; l++){
    for(int m = 1; m <= ((i+1)/2<k ? (i+1)/2 : k); m++){a[l][m]=a[l+1][m]; } } i++; }
  
  
  
  System.out.println(a[3][k]);
 
  
  
  
  }
  
  
 }
}