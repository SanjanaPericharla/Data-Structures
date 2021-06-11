// first approach
// take another array and initialize the elements to -1 and if there is greater element presenton the 
//right of the current element then store the element in the second array.
// tc - O(n ^ 2)

// optimal approach

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int [] output = new int[n];
        Arrays.fill(output, -1);
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n*2;i++){
            while(!st.empty() && nums[st.peek()] < nums[i%n]){
                output[st.pop()] = nums[i%n];
            }
            if(i<n) st.push(i);
        }
        return output;
        
    }
}
// tc - O(n)
// sc - O(n)
