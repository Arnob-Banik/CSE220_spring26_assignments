//LAB TASK NO NEED TO SUBMIT
public class Task4 {

        //===================================TASK#4===================================
        // This method takes 1 parameter, the root
        // This method prints the leaf nodes of the tree
        // This method returns nothing
        // No Helper Methods are needed for this task
        public static void printLeafNodes( BTNode root ){
            if(root == null) return;
            if(root.left==null && root.right==null)System.out.println(root.elem + " ");
            printLeafNodes(root.left);
            printLeafNodes(root.right);
        }
        //============================================================================


}
