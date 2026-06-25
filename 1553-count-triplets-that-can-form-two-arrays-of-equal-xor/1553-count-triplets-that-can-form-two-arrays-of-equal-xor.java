class Solution {
    public int countTriplets(int[] arr) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            int xora=0;
            for(int mid=i+1;mid<n;mid++){
                xora^=arr[mid-1];
                int xorb=0;
                for(int end=mid;end<n;end++){
                    xorb^=arr[end];
                    if(xora==xorb){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}