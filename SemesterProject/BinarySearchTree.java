public class BinarySearchTree {

    public Node insert(Node newNode, int val){
        if(node == null) {
          return NewNode(val);
        }
        
        if(val < newNode.value){
            newNode.left = insert(newNode.left, val);
        } 
        else if((val > newNode.value)){
            newNode.right = insert(newNode.right, val);
        }
        return node;
      }
      
      public Node NewNode(int num){
        Node newNode = new Node();

        newNode.value = num;
        newNode.left = null;
        newNode.right = null;

        return newNode;
      }
}