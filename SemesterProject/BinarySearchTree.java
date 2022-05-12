public class BinarySearchTree {

  public Node insert(Node newNode, int val){
    if(newNode == null){
      return NewNode(val);
    }
        
    if(val < newNode.value){
      newNode.left = insert(newNode.left, val);
    } 
    else if((val > newNode.value)){
      newNode.right = insert(newNode.right, val);
    }
      return newNode;
  }
      

  public Node NewNode(int num){
    Node newNode = new Node();

    newNode.value = num;
    newNode.left = null;
    newNode.right = null;

    return newNode;
  }


  public boolean nodeExists(Node possibleNode, int val){
        
    boolean exists = false;

    if(possibleNode == null){
      return exists;
    }
                
    while(possibleNode != null){
      if(val < possibleNode.value){
        possibleNode = possibleNode.left;
      }
      else if(val > possibleNode.value){
        possibleNode = possibleNode.right;
      }
      else{
        exists = true;
        break;
      }
    }
        
    return exists;
  }


  public int getMin(Node smallestNode){
    if(smallestNode == null){
      System.out.println("The tree is empty");
      return -1;
    }
        
    while(smallestNode.left != null){
      smallestNode = smallestNode.left;
    }
        
    return smallestNode.value;
  }


  public int getMax(Node biggestNode){
    if(biggestNode == null){
      System.out.println("The tree is empty");
      return -1;
    }
        
    while(biggestNode.right != null){
      biggestNode = biggestNode.right;
      }
        
    return biggestNode.value;
  }

  
  static int count = 0;

  public Node NthLargestElement(Node NthNode, int num){

    if(NthNode == null){
      return null;
    }
    
    Node rightNode = NthLargestElement(NthNode.right, num);
    
    if(rightNode != null){
      return rightNode;
    }
    
    count++;
    
    if(count == num){
      return NthNode;
    }
    
    return NthLargestElement(NthNode.left, num);
  }


  public int height(Node tree){
    if(tree == null){
      return 0;
    }
    return Math.max(height(tree.left), height(tree.right)) + 1;
  }
}