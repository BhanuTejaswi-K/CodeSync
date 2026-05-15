class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack=new Stack<>();
        int freq[]=new int[26];
        boolean[] visited=new boolean[26];
          for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for(char ch:s.toCharArray()){
            if(visited[ch-'a']) {
                freq[ch-'a']--;
                continue;
            }
            while(!stack.isEmpty() && ch<stack.peek() && freq[stack.peek()-'a']>1){
                freq[stack.peek()-'a']-=1;
                visited[stack.pop()-'a']=false;
            }
            stack.push(ch);
            visited[ch-'a']=true;
        }
        StringBuilder result=new StringBuilder();
        for(char ch:stack)
        {
            result.append(ch);
        }
        return result.toString();
    }

}