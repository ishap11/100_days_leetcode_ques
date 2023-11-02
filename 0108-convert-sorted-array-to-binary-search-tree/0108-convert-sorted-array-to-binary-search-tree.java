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
    private TreeNode creatingBST (int[] nums , int l , int r){
        if(l > r){
            return null;
        }
        int mid = (l + r)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = creatingBST(nums , l , mid-1);
        root.right = creatingBST(nums , mid+1 , r);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return creatingBST(nums , 0 , nums.length -1);
    }
}
// so basically in this question we have to convert sorted array to heightbalanced tree so if we directly create tree in given sorted order it will become linkedlist so we have to take middle element as head value such it will become height balanced tree