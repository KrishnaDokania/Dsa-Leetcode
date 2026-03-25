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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>result=new ArrayList<>();
        generate(root,"",result);
        return result;
    }
    void generate(TreeNode root,String tmp, List<String>result){
        if(root==null)return;
        tmp=tmp+root.val+"->";
           if(root.left==null&&root.right==null&&tmp.length()!=0){
            result.add(tmp.substring(0,tmp.length()-2));
            return;
           }
             generate(root.left,tmp,result);
             generate(root.right,tmp,result);
    }
}