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
        int max=Integer.MAX_VALUE;
        Integer prev=null;
    public int getMinimumDifference(TreeNode root) {
        traverse(root);
        return max;
    }
    void traverse(TreeNode root){
        if(root==null)return;
        traverse(root.left);
        if(prev!=null){
            max=Math.min(Math.abs(root.val-prev),max);
        }
        prev=root.val;
        traverse(root.right);
    }
}