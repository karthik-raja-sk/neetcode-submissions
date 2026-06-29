class Solution {
    public int findKthNumber(int m, int n, int k) {
        // int mat[][]=new int[m][n];
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         int val=(i+1)*(j+1);
        //         mat[i][j]=val;
        //     }
        // }
        // int l=m*n;
        // int arr[]=new int[l];
        // int ind=0;
        // for(int row[]:mat){
        //     for(int a:row){
        //         arr[ind]=a;
        //         ind++;
        //     }
        // }
        // Arrays.sort(arr);
        // int res=arr[k-1];
        // if(arr.length<k) res=arr[l-1];
        // return res;
        int l=1;
        int h=m*n;
        //int res=h;
        while(l<=h){
            int mid=l+(h-l)/2;
            //res=mid;
            if(cle(mid,m,n)>=k){
                //res=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
    private int cle(int mid,int m,int n){
        int count=0;
        for(int i=1;i<=m;i++){
            count+=Math.min(mid/i,n);
        }
        return count;
    }
}