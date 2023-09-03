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
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode save = root;
        try{
            while(save.val != val && save != null){
                if(val > save.val){
                    save = save.right;
                }
                else{
                    save = save.left;
                }
            }
        }
        catch(Exception e){}
        if(save == null){
            return null;
        }
        else{
            return save;
        }
    }
}
