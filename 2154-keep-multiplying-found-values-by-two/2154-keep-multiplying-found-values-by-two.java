class Solution {
    public int findFinalValue(int[] nums, int original) {
        // int org=original;
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==org){
        //         org*=2;
        //     }
        // }
        // return org;
        return hp(nums, original);
    }

    private int hp(int[] nums, int original) {
        for (int i : nums) {
            if (i == original) {
                return hp(nums, original * 2);
            }
        }
        return original;
    }

}