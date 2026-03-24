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
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>inner=new ArrayList<>();
        generate(root,targetSum,inner,result);
        return result;
    }
    void generate(TreeNode root,int target,List<Integer>inner,List<List<Integer>>result){
        if(root==null)return;
        inner.add(root.val);
        if(root.left==null&&root.right==null&&target==root.val){
            result.add(new ArrayList<>(inner));
        }
        else{
        generate(root.left,target-root.val,inner,result);
        generate(root.right,target-root.val,inner,result);
        }
        inner.remove(inner.size()-1);
    }
}