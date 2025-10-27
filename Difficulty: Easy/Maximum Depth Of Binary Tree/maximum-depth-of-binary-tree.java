// User function Template for Java

/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public static int maxDepth(Node root) {
        if (root == null)
            return 0; // empty tree has depth 0

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // add 1 for the current node
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
