
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

    public int size() {
       return size(root);
    }

    private int size(Node<T> root) {

        if(root==null)
            return 0;

        return size(root.left) + size(root.right) + 1;
    }

    public boolean search(T data)
    {
        return search(root, data);
    }

    private boolean search(Node<T> root, T data) {

        
        if(root == null)
        {
            return false;
        }

        if(data.compareTo(root.data)==0)
            return true;

        if(data.compareTo(root.data)<0)
        {
            return search(root.left, data);
        }
        else
        {
            return search(root.right, data);
        }

    }

    
}