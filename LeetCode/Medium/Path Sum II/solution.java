/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        dfs(root,targetSum,curr,result);
        return result;
    }
    public void dfs(TreeNode root,int targetSum,List<Integer> curr,List<List<Integer>> result){
        if(root==null) return;
        curr.add(root.val);
        if(root.left==null && root.right==null && targetSum==root.val){
            result.add(new ArrayList<Integer>(curr));
        }
        dfs(root.left,targetSum-root.val,curr,result);
        dfs(root.right,targetSum-root.val,curr,result);
        curr.remove(curr.size()-1);
    }
}