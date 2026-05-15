class Solution {
    public String removeKdigits(String num, int k) {
        Stack <Character> stack=new Stack<>();
        for(char i:num.toCharArray()){
            while(!stack.isEmpty() && stack.peek() > i && k > 0){
                stack.pop();
                k--;
            }
            stack.push(i);
        }
        while(!stack.isEmpty() && k>0){
            stack.pop();
            k--;
        }
        StringBuilder ans=new StringBuilder();
        for(char i:stack){
            ans.append(i);
        }
        while(ans.length()>0 && ans.charAt(0)=='0'){
            ans.deleteCharAt(0);
        }
        if(ans.length()==0) return "0";
        return ans.toString();
    }
}