class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int max = 0;
        int l = 0;
        int ml = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max += nums[i];
            while (max >= target) {
                ml = Math.min(ml, i - l + 1);
                max-=nums[l];
                l++;
            }
        }
        return ml == Integer.MAX_VALUE ? 0 : ml;
    }
}