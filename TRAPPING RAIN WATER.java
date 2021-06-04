import java.util.*;
public class Main{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of elements : ");
        n = sc.nextInt();
        System.out.print("Enter the elements : ");
        int []height = new int[n];
        for(int i=0;i<n;i++){
            height[i] = sc.nextInt();
        }
        int maxleft = height[0];
        int maxright = height[n-1];
        int left = 1;
        int right = n-2;
        int trappedwater = 0;
        while(left<=right){
            if(maxleft < maxright){ 
                if(height[left]>=maxleft){
                    maxleft = height[left];
                }
                else{
                    trappedwater += maxleft - height[left];
                }
                left += 1; 
            }
            else{
                if(height[right]>maxright){
                    maxright = height[right];
                }
                else{
                    trappedwater += maxright - height[right];
                    
                }
                right -= 1;
            }
        }
        System.out.print("The trapped water is : " + trappedwater);
     }
}

//TIME COMPLEXITY : O(N)
// SPACE COMPLEXITY : O(1)
