//Before starting to work on this design the Tree in the Tester code 
// Complete the lowestCommonAncestor method
public class Task2 {

    //======================TASK#1======================
    // This method takes only 3 parameter first one is root
    // and second & third parameter are as 2 integers
    // You'll need to find the lowest common ancestor of them and return it
    public static Integer lowestCommonAncestor( BSTNode root, Integer x, Integer y ){
       //if(root==null) return null;
       BSTNode temp = root;
       while(temp!=null){
       if (x< temp.elem&&y<temp.elem) temp = temp.left;
       else if(x>temp.elem&&y>temp.elem) temp = temp.right;
       else return temp.elem;
    }
    return null;
}
    //==================================================

}
