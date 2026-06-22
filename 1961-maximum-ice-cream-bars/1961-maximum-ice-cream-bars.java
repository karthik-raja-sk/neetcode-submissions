class Solution {
    public int maxIceCream(int[] costs, int coins) {
       int max=0;
       for(int i:costs){
        if(i>max){
            max=i;
        }
       }
       int fre[]=new int[max+1];
       for(int c:costs){
        fre[c]++;
       }
       int count=0;
       for(int i=1;i<=max;i++){
        while(coins>=i&& fre[i]>0){
            coins-=i;
            fre[i]--;
            count++;
        }
       }
       return count;
    }
}