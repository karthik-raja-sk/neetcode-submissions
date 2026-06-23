class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums==null||nums.length<k){
            return 0;
        }
        Arrays.sort(nums);
        int ts=Integer.MAX_VALUE;
        for(int i=0;i<=nums.length-k;i++){
            int cs=nums[i+k-1]-nums[i];
            ts=Math.min(cs,ts);
        }
        return ts;
    }
}