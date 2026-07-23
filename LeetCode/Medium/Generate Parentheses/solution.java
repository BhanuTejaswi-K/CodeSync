class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        func(0,0,n,ans,new StringBuilder());
        return ans;
    }
    void func(int op,int cl,int n,List<String> ans,StringBuilder curr){
        if(curr.length()>(n*2) || cl>op) return;
        if(curr.length()==(n*2)){
            ans.add(curr.toString());
            return;
        }
        if(op<n){
            curr.append("(");
            func(op+1,cl,n,ans,curr);
            curr.deleteCharAt(curr.length()-1);
        }
        if(cl<op){
            curr.append(")");
            func(op,cl+1,n,ans,curr);
            curr.deleteCharAt(curr.length()-1);
        }
        return;
    }
}