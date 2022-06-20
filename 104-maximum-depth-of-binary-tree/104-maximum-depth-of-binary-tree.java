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
        int level = 0;
        if(root == null) {
            return 0;
        }
        int next = 0;
        Queue<TreeNode> nn = new ArrayDeque<TreeNode>();
        nn.add(root);
        while(!nn.isEmpty())  { 
            next = nn.size();
        for(int i =0; i< next; i++) {
         TreeNode l = nn.remove(); 
            if( l.left != null) {
                nn.add(l.left);
            }
            if(l.right != null) {
                nn.add(l.right);
            }
            
        }
        level = level +1;
            
        }
      return level;  
    }
}