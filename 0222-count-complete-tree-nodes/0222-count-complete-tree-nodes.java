class Solution {
    public int countNodes(TreeNode root) 
    {
        if (root == null) 
        {
            return 0;
        }
        int res = 1 + countNodes(root.left) + countNodes(root.right);
        return res;
    }
}
