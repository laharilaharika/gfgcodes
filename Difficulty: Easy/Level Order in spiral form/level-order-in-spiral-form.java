/*
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
    public ArrayList<Integer> findSpiral(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        boolean leftToRight = false; // first level should be leftToRight=false (right-to-left)

        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                level.add(curr.data);

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }

            if (leftToRight) {
                result.addAll(level);
            } else {
                Collections.reverse(level);
                result.addAll(level);
            }

            leftToRight = !leftToRight; // toggle direction
        }

        return result;
    }
}
