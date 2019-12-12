


class Node{
    int val;
    Node right;
    Node left;
}

public class BinaryTree {
    public int size = 0;
    public int leafSize = 0;

    public void preOrder(Node root) {
        if (root == null) {
            return;

        } else {
            System.out.println(root.val);
            preOrder(root.left);
            preOrder(root.right);

        }
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val);
            inOrder(root.right);
        }
    }

    public void posOrder(Node root) {
        if (root == null) {
            return;

        } else {
            preOrder(root.left);
            preOrder(root.right);
            System.out.println(root.val);

        }
    }

    public int getSize1(Node root) {
        if (root != null) {
            getSize1(root.left);
            getSize1(root.right);
            size++;

        }
        return 0;
    }

    public int getSize2(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        return getSize2(root.left) + getSize2(root.right) + 1;

    }

    public void getleafSize1(Node root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            leafSize++;
            return;
        }
        getleafSize1(root.left);
        getleafSize1(root.right);
    }

    public int getleasize2(Node root) {

        if (root == null) {
            return 0;

        } else if (root.left == null && root.right == null)
            return 1;
        return getleasize2(root.left) + getleasize2(root.right);
    }


    public static void main(String[] args) {
        System.out.println();
    }
}
   /* public Node buildTree(){
        Node root=new Node();
        Node node1=new Node();
    }/*
}



