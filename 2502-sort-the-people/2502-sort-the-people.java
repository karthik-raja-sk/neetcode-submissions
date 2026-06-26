class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        int h=heights.length;
        int max=0;
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(heights[i],names[i]);
            
        }
        Arrays.sort(heights);
        String[] sn=new String[n];
        for(int i=n-1;i>=0;i--){
            sn[i]=map.get(heights[n-1-i]);
        }
        return sn;
    }
}