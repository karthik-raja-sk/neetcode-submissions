class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        int ind=1;
        for(char ch:s.toCharArray()){
            ans+=(123-ch)*ind;
            ind++;
        }
        return ans;
    }
}