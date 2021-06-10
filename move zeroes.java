// brute force 
// TRAVERSE THE ARRAY AND IF THERE ARE NON-ZERO ELEMENTS PUSH INTO NEW ARRAY AND KEEP A COUNTER FOR THE ZEROES AND PUSH THEM AFTER PUSHING THE NON-ZERO ELEMENTS
// TC -O(N)
//SC - O(N)

// OPTIMAL APPROACH (INPLACE)
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n == 0 || n == 1){
            return;
        }
        int l = 0, r = 0;
        int temp;
        while(r<n){
            if(nums[r] == 0){
                r++;
            }
            else{
                temp = nums[l];
                nums[l] = nums[r];
                nums[r]= temp;
                l++;
                r++;
            }
        }
    }
}
// TC - O(N)
// SC - O(1)
