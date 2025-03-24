class Node {
    int data;
    Node left, right;

    public Node(int item){
        data = item;
        left = right = null;
    }
}
class BinarySearchTree{
    Node root;
    BinarySearchTree(){
        root = null;
    
}

void insert(int data){
    root = insertRec(root, data);
        }
    Node insertRec(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }

        if(data < root.data){
            root.left = insertRec(root.left, data);
        }else if(data > root.data){
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    void inOrder(Node root){
       
            if(root != null){
                inOrder(root.left);
                System.out.print(root.data + " ");
                inOrder(root.right);
            }
        }
        void preOrder(Node root){
            if(root != null){
                System.out.print(root.data + " ");
                preOrder(root.left);
                preOrder(root.right);
            }
        }
        void postOrder(Node root){
            if(root != null){
                postOrder(root.left);
                postOrder(root.right);
                System.out.print(root.data + " ");
            }
        }

}
public class App {
    public static void main(String[] args) throws Exception {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(8);
        tree.insert(20);

        System.out.println("In Order traversal: ");
        tree.inOrder(tree.root);
        System.out.println();
        
        System.out.println("Pre Order traversal: ");
        tree.preOrder(tree.root);
        System.out.println();

        System.out.println("Post Order traversal: ");
        tree.postOrder(tree.root);
        System.out.println();

    }
}
