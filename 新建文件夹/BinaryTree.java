import javax.xml.soap.Node;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//二叉链
class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;

    public TreeNode(int value) {
        this.value = value;
    }
}

public class BinaryTree{
    public static void leverOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null)
            queue.offer(root);
        while(!queue.isEmpty()){
            //获取队头元素
            TreeNode topNode = queue.poll();
            System.out.print(topNode.value);
            //入队孩子节点
            if(topNode.left != null){
                queue.offer(topNode.left);
            }
            if(topNode.right != null){
                queue.offer(topNode.right);
            }
        }
    }

    public  static boolean  isCompleteTree(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null){
            queue.offer(root);
        }
        while(!queue.isEmpty()){
            TreeNode topNode = queue.poll();
            //遇到第一个null节点，停止层序遍历
            if(topNode == null)
                break;
            queue.offer(topNode.left);
            queue.offer(topNode.right);
        }
        //剩余全部出队， 如果有非空节点，说明不是完全二叉树
        while(!queue.isEmpty()){
            TreeNode topNode = queue.poll();
            if(topNode != null)
                return false;
        }
        return true;
    }

    // 递归前序遍历
    public static void prOrder(TreeNode root){
        if(root != null){
            System.out.print(root.value + " ");
            prOrder(root.left);
            prOrder(root.right);
        }
    }
    //非递归前序遍历
    public static void prOrderNoR(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        TreeNode curNode = root;

        while(curNode != null || !st.isEmpty()){
            //走到空时结束
            while(curNode != null){
                //首先访问根
                System.out.print(curNode.value + " ");
                //访问根的左子树
                st.push(curNode);
                curNode = curNode.left;
            }

            //获取栈顶元素
            curNode = st.pop();
            //访问栈顶元素的右子树
            curNode = curNode.right;
        }
        System.out.println();
    }

    public static void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.value + " ");
            inOrder(root.right);
        }
    }


    public static void inOrderNoR(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        TreeNode curNode = root;
        // curNode != null: 表示已curNode为根的子树需要访问
        // !st.isEmpty():  之前压栈的子树没有访问完
        while(curNode != null || ! st.isEmpty()){
            while(curNode != null){
                //访问左子树
                st.push(curNode);
                curNode = curNode.left;
            }
            //访问根
            curNode = st.pop();
            System.out.print(curNode.value + " ");
            //访问右子树
            curNode = curNode.right;
        }
        System.out.println();
    }

    public static void postOrder(TreeNode root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.value + " ");
        }
    }
    public static void postOrderNoR(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        TreeNode curNode = root;
        TreeNode prev = null;
        while(curNode != null || ! st.isEmpty()){
            while(curNode != null){
                //左子树
                st.push(curNode);
                curNode = curNode.left;
            }
            //根: 访问完右子树之后，才能访问根
            //curNode = st.pop();  有可能导致元素访问不到
            curNode = st.peek();
            //判断右子树是由已经访问完：
            // 1. curNode.right == null : 没有右子树
            // 2. curNode.right == prev:  有右子树，并且右子树的根上一次已经访问结束，即右子树访问完成
            if(curNode.right == null || curNode.right == prev){
                System.out.print(curNode.value + " ");
                prev = curNode;
                st.pop();
                curNode = null;
            }
            else{
                //右子树
                curNode = curNode.right;
            }
        }
        System.out.println();
    }


    public static TreeNode buildTree(){
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        root.left = left;
        root.right = right;
        left.left = node4;
        left.right = node5;
        right.left = node6;
        right.right = node7;
        left.left.left = node8;
        return root;
    }

    public static TreeNode buildTree2(){
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        root.left = left;
        root.right = right;
        left.left = node4;
        left.right = node5;
        right.left = node6;
        right.right = node7;
        left.left.right = node8;
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = buildTree();
        System.out.println("递归");
        postOrder(root);
        System.out.println();
        System.out.println("非递归");
        postOrderNoR(root);
    }
}
