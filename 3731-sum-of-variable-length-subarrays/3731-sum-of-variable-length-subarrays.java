class Solution {
    public int subarraySum(int[] nums) {
        int n = nums.length;
        int pre[] = new int[n];
        pre[0] = nums[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + nums[i];
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int st = Math.max(0, i - nums[i]);
            int cs;
            if (st == 0) {
                cs = pre[i];
            } else {
                cs = pre[i] - pre[st - 1];
            }
            ans += cs;
        }
        return ans;
    }
}