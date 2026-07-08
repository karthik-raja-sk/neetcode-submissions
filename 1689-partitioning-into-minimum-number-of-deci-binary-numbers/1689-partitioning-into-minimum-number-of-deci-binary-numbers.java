class Solution {
    public int minPartitions(String n) {
        int sum=0;
        int a=n.length();
        for(int i=0;i<a;i++){
            sum=Math.max(sum,n.charAt(i)-'0');
        }
        return sum;

    }
}