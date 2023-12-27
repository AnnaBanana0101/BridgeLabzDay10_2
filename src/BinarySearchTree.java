
public class BinarySearchTree<T extends Comparable<T>>{
    
    Node<T> root;

    public BinarySearchTree()
    {
        this.root = null;
    }

    public void insert (T data)
    {
        root = addNode(root, data);
    }

    private Node<T> addNode(Node<T> root,T data)
    {
        if(root == null)
        {
            root = new Node<T>(data); 
            return root;           
        }

        if(data.compareTo(root.data)<0)
        {
            root.left = addNode(root.left, data);
        }
        else
        {
            root.right = addNode(root.right, data);
        }

        return root;
    }

    public void inorderTraversal()
    {
        inorderTraversal(root);
    }

    private void inorderTraversal(Node<T> root) {

        if(root!=null)
        {
            inorderTraversal(root.left);
            System.out.print(root.data+ " ");
            inorderTraversal(root.right);
        }

    }

    
}