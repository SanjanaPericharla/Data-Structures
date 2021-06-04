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
        int low=0,high = n-1,m = 0,temp;
        while(m<=high){
            if(ar[m] == 0){
                temp = ar[low];
                ar[low] = ar[m];
                ar[m] = temp;
                low++;
                m++;
            }
            if(ar[m]==1){
                m++;
            }
            if(ar[m] == 2){
                temp = ar[m];
                ar[m] = ar[high];
                ar[high] = temp;
                high--;
            }
        }
        for(int c=0;c<n;c++){
            System.out.print(ar[c]+" ");
        }
        
        
    }
}
// TIME COMPLEXITY : O(N)
// SPACE COMPLEXITY : O(1)
