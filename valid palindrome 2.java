
// deleting a letter and making it palindrome.
class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return isvalidPalindrome(s,left+1,right) || isvalidPalindrome(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isvalidPalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
// time complexity : O(n)
//space complexity : O(1)
