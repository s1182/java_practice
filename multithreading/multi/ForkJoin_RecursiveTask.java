package multi;

import java.util.concurrent.*;  

//A RecursiveTask that computes the SumRTmation of an array of doubles. 

class SumRT extends RecursiveTask<Double> { 

// The sequential threshold value.  
final int seqThresHold = 500; 

// Array to be accessed. 
double[] data;  

// Deterines what part of data to process. 
int start, end; 

SumRT(double[] vals, int s, int e ) { 
 data = vals; 
 start = s; 
 end = e; 
} 

// Find the SumRTmation of an array of doubles. 
protected Double compute() { 
 double SumRT = 0; 

 // If number of elements is below the sequential threshold, 
 // then process sequentially. 
 if((end - start) < seqThresHold) { 
   // SumRT the elements. 
   for(int i = start; i < end; i++) SumRT += data[i]; 
 } 
 else { 
   // Otherwise, continue to break the data into smaller peices. 

   // Find the midpoint. 
   int middle = (start + end) / 2; 

   // Invoke new tasks, using the subdivided data. 
   SumRT subTaskA = new SumRT(data, start, middle); 
   SumRT subTaskB = new SumRT(data, middle, end); 

   // Start each subtask by forking. 
   subTaskA.fork(); 
   subTaskB.fork(); 

   // Wait for the subtasks to return, and aggregate the results. 
   SumRT = subTaskA.join() + subTaskB.join(); 
 } 
   // Return the final SumRT. 
   return SumRT; 
} 
} 

//Demonstrate parallel execution.  
public class ForkJoin_RecursiveTask { 
	
public static void main(String args[]) {  
 // Create a task pool. 
 ForkJoinPool fjp = new ForkJoinPool(); 

 double[] nums = new double[5000]; 

 // Initialize nums with values that alternate between 
 // positive and negative. 
 for(int i=0; i < nums.length; i++) 
   nums[i] = (double) (((i%2) == 0) ? i : -i) ; 

 SumRT task = new SumRT(nums, 0, nums.length); 

 // Start the ForkJoinTasks.  Notice that in this case, 
 // invoke() returns a result. 
 double Summation = fjp.invoke(task); 

 System.out.println("SumRTmation " + Summation); 
}  
}

