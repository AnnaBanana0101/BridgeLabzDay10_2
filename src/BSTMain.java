public class BSTMain {
    public static void main(String[] args) throws Exception {
        

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(56);
        bst.insert(30);
        bst.insert(70);

        bst.inorderTraversal();
    }
}
