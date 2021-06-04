class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []result = new int[2]; //creating result array of size 2.bcz we know that the result is in the form of (index of i,index of num contating in hashtable).
        Map<Integer,Integer>map = new HashMap<Integer,Integer>();//creation of hashmap
        for(int i=0;i<nums.length;i++){// iterate all the array
            // we check target - i = res present in the hashtable or not if present
            if(map.containsKey(target - nums[i])){ 
                result[1] = i;// index 1 as index of i
                result[0] = map.get(target - nums[i]);// index 0 as the index of the res in the hashtable
                return result;//we return result
            }
            map.put(nums[i],i);// when there is no element present
        }
        return result;
    }
}
