class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int mi=-1;
        int mv=-1;
        int sm=-1;
        for (int i = 0; i < n; i++) {
            if(nums[i]>mv){
                sm=mv;
                mv=nums[i];
                mi=i;
            }
            else if(nums[i]>sm){
                sm=nums[i];
            }
        }
        if(mv>=sm*2){
            return mi;
        }
        return -1;
    }
}