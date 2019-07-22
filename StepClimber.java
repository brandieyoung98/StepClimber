import java.util.*;
import java.lang.*;
import java.io.*;

//Bottom up dynamic programming is used to solve this problem as demonstrated in the "cache-ing" of values in the integer array ways
public class StepClimber{
	public static void main (String[] args){
	  //change this n to test various step input
    int n = 5;
		int answer = numWays(n);
		System.out.println("There are " + answer + " many ways the child can go up " + n " + " stairs!");
	}
	public static int numWays(int n){
	    //building block base cases
      if(n == 0){
	       return 0;
	    }
	    else if(n ==1){
	      return 1;
	    }
	    else if(n ==2){
	      return 2;
	    }
	    else{
	      int[] ways = new int[n+1];
	      ways[0] = 1;
	      ways[1] = 1;
	      ways[2] = 2;
	      for(int i = 3; i<= n; i++){
          /*
          ways[i] represents the # of ways to get to step i
          you can jump 1 from the i-1 step, jump 2 from i-2 step, OR jump 3 from the i-3 step
          so we add all the ways to get to these 3 diff steps to get the ways to get to the ith step!
          */
	        ways[i] = ways[i-1] + ways[i-2] + ways[i-3];
	      }
	    //at the end we simply return the # of ways to travel n steps, as stored in our array
	    return ways[n];
	    }
	}
}
