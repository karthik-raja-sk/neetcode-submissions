class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
        String pr=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(pr)!=0){
                pr=pr.substring(0,pr.length()-1);
                if(pr.isEmpty()){
                    return "";
                }
            }
        }
        return pr;
    }
}