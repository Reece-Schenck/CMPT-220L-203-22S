public class Main{
    public static void main(String[] args){

        BinarySearchTree tree = new BinarySearchTree();

        Node root = null;

        root = tree.insert(root, 9);
        root = tree.insert(root, 2);
        root = tree.insert(root, 8);
        root = tree.insert(root, 11);
        root = tree.insert(root, 5);
        root = tree.insert(root, 6);
        root = tree.insert(root, 3);
        root = tree.insert(root, 14);
        root = tree.insert(root, 15);
        
        //test
        System.out.println("working");
    }
}