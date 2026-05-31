//Assignment Task (must Submit)
// Complete the isBST method
public class Task6 {

    //===================================TASK#6======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Boolean isBST( BSTNode root ){
        if(root==null) return true;
        else if(root.left != null &&root.left.elem >root.elem) {
            return false;
        }
        else if(root.right != null &&root.right.elem <root.elem) {
            return false;
        }
        return true && isBST(root.left) && isBST(root.right);
        
    }
    //===============================================================


}
