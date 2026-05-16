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
    public boolean issametree(TreeNode p,TreeNode q){
        if(p==null && q==null) return true;
        if(p==null ||q==null) return false;
        return p.val==q.val && issametree(p.left,q.left) && issametree(p.right,q.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null && subRoot==null) return true;
        if(root==null || subRoot==null) return false;
        return issametree(root,subRoot) || isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);

    }
}
//Not optimal,TC:O(n^2)