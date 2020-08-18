//Given an n-ary tree, return the preorder traversal of its nodes' values. 
//
// Nary-Tree input serialization is represented in their level order traversal, 
//each group of children is separated by the null value (See examples). 
//
// 
//
// Follow up: 
//
// Recursive solution is trivial, could you do it iteratively? 
//
// 
// Example 1: 
//
// 
//
// 
//Input: root = [1,null,3,2,4,null,5,6]
//Output: [1,3,5,6,2,4]
// 
//
// Example 2: 
//
// 
//
// 
//Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null
//,12,null,13,null,null,14]
//Output: [1,2,3,6,7,11,14,4,8,12,5,9,13,10]
// 
//
// 
// Constraints: 
//
// 
// The height of the n-ary tree is less than or equal to 1000 
// The total number of nodes is between [0, 10^4] 
// 
// Related Topics Tree 
// 👍 628 👎 61
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/



class Solution {
    public List<Integer> preorder(Node root) {
        //1、使用递归遍历，根-左-右 T:O(n) S:O(n)
/*        List<Integer> travseralPath = new ArrayList<>();
        helper(root, travseralPath);
        return travseralPath;*/

        //2、迭代法使用栈, children逆入栈。否则出栈遍历 T:O(n) S:O(n)
        List<Integer> travseralPath = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node node = root;
        while (node != null || !stack.isEmpty()) {
            if (node == null) {
                node = ;
            }
            travseralPath.add(node.val);
            if (node.children != null && !node.children.isEmpty()) {
                for (int i = node.children.size() - 1; i > 0; i--) {
                    stack.push(node.children.get(i));
                }
                node = node.children.get(0);
            } else {
                node = stack.pop();
            }
        }
        return travseralPath;
    }

    public void helper(Node root, List<Integer> travseralPath) {
        if (root != null) {
            travseralPath.add(root.val);
            if (root.children != null) {
                for (Node children : root.children) {
                    helper(children, travseralPath);
                }
            }
        }
    }


}
//leetcode submit region end(Prohibit modification and deletion)
