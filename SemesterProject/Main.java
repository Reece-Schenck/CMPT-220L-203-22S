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

        //Should be true
        System.out.println(tree.nodeExists(root, 6));

        //should be false
        System.out.println(tree.nodeExists(root, 16));

        //should be 2
        System.out.println(tree.getMin(root));

        //should be 15
        System.out.println(tree.getMax(root));
        
        // should be 11
        Node NthLargest = tree.NthLargestElement(root, 3);

        if(NthLargest != null){
            System.out.println(NthLargest.value);  
        }
        else{
            System.out.println("The value entered returns a null");
        }

        //should be null
        Node NthLargest2 = tree.NthLargestElement(root, 15);

        if(NthLargest2 != null){
            System.out.println(NthLargest2.value);  
        }
        else{
            System.out.println("The value entered returns a null");
        }

        //should be 5
        System.out.println(tree.height(root));

        //should delete the node with value 14
        tree.deleteNode(root, 14);

        //the node with the value 14 should no longer exist(should be false)
        System.out.println(tree.nodeExists(root, 14));
    }
}