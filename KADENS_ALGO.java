// PROGRAM FOR FINDING LARGEST SUM CONTIGUOUS SUBARRAY

import java.util.*;
public class Main{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the no.of elements : ");
        n = sc.nextInt();
        int []ar = new int[10];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        int max_end_here = 0, max_so_far = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max_end_here = max_end_here + ar[i];
            if(max_end_here < ar[i]){
                max_end_here = ar[i];
            }
            if(max_so_far < max_end_here){
                max_so_far = max_end_here;
            }
        }
        System.out.println("The sum of largest subarray is : " +max_so_far);
    }
}
//TIME COMPLEXITY : O(N)
//SPACE COMPLEXITY : O(1)
