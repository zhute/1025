import java.util.Stack;

class Node {
    Node left;
    Node right;
    char value;
    public Node(char value) {
        this.value = value;
        left=right=null;
    }
}

public class Main {
    public static void preOrder(Node root) {
        Stack<Node> st = new Stack<>();
        Node cur = root;
        while (cur != null || !st.isEmpty()) {
            while (cur != null) {
                System.out.println(cur.value);
                st.push(cur);
                cur = cur.left;
            }
            //获取栈顶元素
            cur = st.pop();
            //访问栈顶元素右子树；
            cur = cur.right;
        }
        System.out.println();
    }

public static void prOderx(Node root){
        if (root!=null){
            System.out.println(root.value);
            prOderx(root.left);
            prOderx(root.right);
        }
}





public static Node buildTree() {
    Node root = new Node('A');
    Node node1 = new Node('B');
    Node node2 = new Node('C');
    Node node3 = new Node('D');
    Node node4 = new Node('E');
    Node node5 = new Node('F');
    Node node6 = new Node('G');
    Node node7 = new Node('H');
    root.left = node1;
    root.right = node2;
    node1.left = node3;
    node1.right = node4;
    node2.left = node5;
    node2.right = node6;
    node4.right = node7;
    return root;
  }

    public static void main(String[] args) {
       // Main b=new Main();
        //b.preOrder(b.buildTree());
          Node root=buildTree();
          prOderx(root);
        System.out.println();
        preOrder(root);
    }
}


