/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
		if(root == null) return root;
		TreeNode temp = invertTree(root.right);
		root.right = invertTree(root.left);
		root.left = temp;
		return root;
    }
}