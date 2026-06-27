class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int i=0;
        int j=n-1;
        double mavg=Double.MAX_VALUE;
        while(i<j){
            double cavg=(nums[i]+nums[j])/2.0;
            if(cavg<mavg){
                mavg=cavg;
            }
            i++;
            j--;
        }
        return mavg;
    }
}