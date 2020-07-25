import sun.net.httpserver.HttpServerImpl;

public class 树的子结构 {
    public boolean IsSame(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return IsSame(root1.left, root2.left) && IsSame(root1.right, root2.right);
    }


    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        boolean result = false;
        if (root1.val == root2.val) {
            result = IsSame(root1, root2);
        }
        if (result != true) {
            result = HasSubtree(root1.left, root2);
        }
        if (result != true) {
            result = HasSubtree(root1.right, root2);
        }
        return result;
    }
}
