class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        int[] freq = new int[26];
        boolean[] visited = new boolean[26];
        // count frequency
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : s.toCharArray()) {
            // current character used once
            freq[ch - 'a']--;
            // already in stack
            if (visited[ch - 'a'])
                continue;
            while (!stack.isEmpty()&& ch < stack.peek() && freq[stack.peek() - 'a'] > 0) {
                visited[stack.pop() - 'a'] = false;
            }

            stack.push(ch);
            visited[ch - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();

        for (char c : stack)
            sb.append(c);
        return sb.toString();
    }
}