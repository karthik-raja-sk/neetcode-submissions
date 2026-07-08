class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0||j>=0||carry!=0){
            int bA=(i>=0)?a.charAt(i)-'0':0;
            int bB=(j>=0)?b.charAt(j)-'0':0;
            int sum=bA+bB+carry;
            res.append(sum%2);
            carry=sum/2;
            i--;
            j--;
        }
        return res.reverse().toString();
    }
}