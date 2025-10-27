/*
class Node {
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
*/


class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean leftToRight = true; // start with left to right for level 1

        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> level = new ArrayList<>();

            // process all nodes of current level
            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();
                level.add(curr.data);

                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
            }

            // if direction is right-to-left, reverse current level
            if (!leftToRight) {
                Collections.reverse(level);
            }

            // add all elements of this level to final result
            result.addAll(level);

            // toggle direction
            leftToRight = !leftToRight;
        }

        return result;
    }
}