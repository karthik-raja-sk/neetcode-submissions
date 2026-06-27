class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.length();
        char ch1[] = word.toCharArray();
        int i = 0;
        int j = word.indexOf(ch);
        while (i < j) {

            char t = ch1[i];
            ch1[i] = ch1[j];
            ch1[j] = t;

            i++;
            j--;
        }
        return new String(ch1);
    }
}