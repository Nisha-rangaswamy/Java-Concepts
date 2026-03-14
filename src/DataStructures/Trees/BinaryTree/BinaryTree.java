package DataStructures.Trees.BinaryTree;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int[] arr;
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class BinaryTree {
    static Node createNode(int val){
        return new Node(val);
    }
    static void BFS(Node root){
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node front=q.poll();
            System.out.print(front.data + " ");
            if(front.left!=null){
                q.offer(front.left);
            }
            if(front.right!=null){
                q.offer(front.right);
            }
        }
    }

    //preorder DFS
    static void DFS1(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        DFS1(root.left);
        DFS1(root.right);
    }

    //inorder DFS
    static void DFS2(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        DFS2(root.left);
        DFS2(root.right);
    }

    //Postorder
    static void DFS3(Node root){
        if(root==null){
            return;
        }
        DFS3(root.left);
        DFS3(root.right);
        System.out.print(root.data + " ");

    }

    static
    int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        return Math.max(leftHeight,rightHeight)+1;
    }

    public static void main(String[] args) {
        Node root=createNode(1);
        root.left=createNode(2);
        root.right=createNode(3);
        root.left.left=createNode(4);
        root.left.right=createNode(5);
        root.right.left=createNode(6);
        root.right.right=createNode(7);
        root.left.right.left=createNode(8);
        root.right.left.right=createNode(9);
        root.right.left.left=createNode(15);

        System.out.println("DFS traversal");
        System.out.println("Preoder: ");
        DFS1(root);
        System.out.println("\nInorder: ");
        DFS2(root);
        System.out.println("\nPostorder: ");
        DFS3(root);
        System.out.println("\nBFS traversal");
        BFS(root);
        System.out.println("\nHeight: " + height(root));
    }
}
