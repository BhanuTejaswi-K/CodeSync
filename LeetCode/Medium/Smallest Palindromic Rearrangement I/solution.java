class Solution {
    public String smallestPalindrome(String s) {
        int freq[]=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder first=new StringBuilder();
        String middle="";
        for(int i=0;i<26;i++){
            for(int j=0;j<freq[i]/2;j++){
                first.append((char) (i + 'a'));
            }

            if (freq[i] % 2 == 1) {
                middle = String.valueOf((char) (i + 'a'));
            }
        }

        String second = new StringBuilder(first).reverse().toString();

        return first.toString() + middle + second;
    }
}