package Methods;

import java.util.Scanner;

public class Q151 {
	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
		    for(int i=0; i < size; i++){
		      nums[i] = scan.nextInt();
		    }
		    printUniqueNumbers(nums);
		  }
		  
		  public static void printUniqueNumbers(int[] nums){
		    //WRITE YOUR CODE HERE
		    for(int j=0; j<nums.length; j++) {
				    	int num=0;
						for(int i=0; i<nums.length; i++ ) {
							if( nums[i]== nums[j]  )
								   num++;
						}
				    	if(num==1) System.out.println(nums[j]);
				    }
		    
		    
		    
		  }

}
