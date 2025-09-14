
package leetcode.Trees;

public class Complete_BinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        System.out.println(isCompleteTree(root));
    }

    static boolean isCompleteTree(TreeNode root) {
        int totalNodes = count(root);
        int i = 1;
        return DFS(root,i,totalNodes);
    }
    static int count(TreeNode root){
        if(root == null){
            return 0;
        }

        return 1 + count(root.left) + count(root.right);
    }
    static boolean DFS(TreeNode root,int i,int totalNodes){
        if(root == null){
            return true;
        }

        if(i > totalNodes){
            return false;
        }


        return DFS(root.left,2*i,totalNodes) && DFS(root.right,2*i + 1,totalNodes);

        
    }


}
