package Arrays_Q109_Q137;

import java.util.Scanner;

public class Q131 {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    int[][] arr = new int[rows][cols];
	    for(int i=0 ;i<=rows-1;i++)
	    {
	      for(int j=0 ;j<=cols-1;j++)
	      {
	        arr[i][j]=inp.nextInt();
	      }//end for cols
	    }//end for rwos
	    
	    //your code here
	    
	     int matches = 0;
				for(int i=0; i<arr.length;i++) 
					for(int z=arr[i].length-1;z>=0;z--) 
						if(arr[i][i]==arr[i][z]&& i!=z)  
						  matches+=1;
		   
		    System.out.print("matches: "+matches);
			
	  }//end main

}
