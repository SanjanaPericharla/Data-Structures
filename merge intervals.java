class Solution {
    public int[][] merge(int[][] intervals) {
        // create list of array
        List <int[]> res = new ArrayList<>();
        // if the intervals are null
        if(intervals.length == 0 || intervals == null){
            // then return the array
           return res.toArray(new int[0][]);
        }
        // sort the array of lists
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int []i : intervals){
            if(i[0] <= end){
                end = Math.max(end,i[1]);
            }
            else{
                res.add(new int[]{start,end});
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[0][]);
    }
}
