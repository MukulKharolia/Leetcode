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
    TreeNode res;
    int maxd=-1;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        dfs(root,0);
        return res;
    }
    private int dfs(TreeNode node,int d){
        if(node==null){
            maxd=Math.max(maxd,d);
            return d;
        }
        int left=dfs(node.left,d+1);
        int right=dfs(node.right,d+1);
        if(left==right && left==maxd){
            res=node;
        }
        return Math.max(left,right);
    }
}