//Before starting to work on this design the Tree in the Tester code 
// Complete the lowestCommonAncestor method
public class Task1 {

    //======================TASK#1a======================
    // This method takes only 1 parameter; root of a BST
    // You'll need to find the max of the BST and return it
    public static Integer maxOfBST( BSTNode root ){
        BSTNode temp = root;
        while(temp.right!=null){
            temp = temp.right;
        }
        return temp.elem; //remove this line
    }
    //==================================================

    //======================TASK#1b======================
    // This method takes only 2 parameters
    // root of a BST and the value of which you wanna the predecessor
    // You'll need to find the max of the BST and return it
    public static Integer inOrderPred( BSTNode root, Integer x ){
        BSTNode pred = root;
        BSTNode curr = root;
        if(curr.elem<x) curr = curr.right; 
        else if(curr.elem>x){
            
            pred = curr;
            curr = curr.left;
        }
        else {
            if (curr.left != null) {
                return maxOfBST(curr.left);
                
            }
           
        }

        return pred.elem;
    }
    //==================================================
}
