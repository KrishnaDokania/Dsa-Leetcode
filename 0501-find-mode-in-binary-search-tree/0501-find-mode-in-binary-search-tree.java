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
    public List<Integer>list=new ArrayList<>();
        public int count=0;
        public int max=0;
        public Integer num=null;
    public int[] findMode(TreeNode root) {
       traverse(root);
       int arr[]=new int[list.size()];
       for(int i=0;i<list.size();i++)
       arr[i]=list.get(i);
        return arr;
    }
    void traverse(TreeNode root){
        if(root==null)return;
        traverse(root.left);
        if(num==null||root.val!=num)count=1;
        else count++;
        if(count>max){
            max=count;
            list.clear();
            list.add(root.val);
        }
        else if(max==count){
            list.add(root.val);
                    }
                    num=root.val;
                    traverse(root.right);
    }
}