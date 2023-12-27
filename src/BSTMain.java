public class BSTMain {
    public static void main(String[] args) throws Exception {
        

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(30);
        bst.insert(56);
        bst.insert(70);
        bst.insert(22);
        bst.insert(40);
        bst.insert(11);
        bst.insert(3);
        bst.insert(16);
        bst.insert(60);
        bst.insert(95);
        bst.insert(65);
        bst.insert(63);
        bst.insert(67);

        bst.inorderTraversal();
        System.out.println("");
        System.out.println("Size: " + bst.size());
    }
}
