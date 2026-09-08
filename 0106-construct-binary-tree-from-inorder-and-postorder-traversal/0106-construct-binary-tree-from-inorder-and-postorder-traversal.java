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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;
        int m=postorder.length;
        return solve(inorder,postorder,0,n-1,0,m-1);
    }
    TreeNode solve(int[] inorder, int[] postorder, int instart,int inend,int poststart,int postend){
        if(instart>inend)return null;
        int rootval=postorder[postend];
        int i=instart;
        for(;i<inend;i++){
            if(inorder[i]==rootval)break;
        }
        TreeNode root=new TreeNode(rootval);
        int left=i-instart;
        root.left=solve(inorder,postorder,instart,i-1,poststart,poststart+left-1);
        root.right=solve(inorder,postorder,i+1,inend,poststart+left,postend-1);
        return root;
    }
}