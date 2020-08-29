package src;

public class 二叉树的深度 {
    public int TreeDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int dleft=1;
        int dright=1;
        dleft=1+TreeDepth(root.left);
        dright=1+TreeDepth(root.right);
        return dleft>dright? dleft:dright;
    }

}
