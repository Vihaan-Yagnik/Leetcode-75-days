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
    public int max = 0;
    public int longestZigZag(TreeNode root) {
        dfs(root,0,0);
        dfs(root,1,0);
        return max;
    }
    public void dfs(TreeNode root ,int direction ,int length){
        if(root == null) return;
        max = Math.max(max,length);
        
        if(direction == 1){
            dfs(root.left,0,length+1);
            dfs(root.right,1,1);
        }
        else{
            dfs(root.right,1,length+1);
            dfs(root.left,0,1);
        }
    }
}
