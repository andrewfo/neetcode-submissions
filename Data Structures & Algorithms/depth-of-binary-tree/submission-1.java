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
    public int maxDepth(TreeNode root) {
        return findDepth(root, 0);
    }
    private int findDepth(TreeNode node, int curr){
        if(node == null){
            return curr;
        }
        curr++;
        int right = findDepth(node.right, curr);
        int left = findDepth(node.left, curr);
        return Math.max(right, left);


        
    }
}
