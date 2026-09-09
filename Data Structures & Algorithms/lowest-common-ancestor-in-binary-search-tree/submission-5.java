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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return help(root, p, q);
    }
    private TreeNode help(TreeNode node, TreeNode p, TreeNode q){
        if(node == null){
            return null;
        }
        if((node.val < q.val && node.val > p.val) || node.val > q.val && node.val < p.val){
            return node;
        }else if(node.val < p.val && node.val < q.val){
            return help(node.right, p, q);
        }else if(node.val > p.val && node.val > q.val){
            return help(node.left, p, q);
        }else{
            return node;
        }
    }
}
