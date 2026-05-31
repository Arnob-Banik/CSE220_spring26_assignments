//Before starting to work on this design the Tree in the Tester code 
// Complete the sumOfLeaves method
public class Task3 {

    //===================================TASK#2===================================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is an Integer
    // You'll need to find the path from the root to a node containing the Integer
    // return the path as a String
    public static String findPath( BSTNode root, Integer key ){
        String s = "";
        BSTNode curr = root;
        while (curr!=null){
            if(curr.elem>key){
                s+= curr.elem + " ";
                curr=curr.left;
            }
            else if (curr.elem<key){
                s+=curr.elem + " ";
                curr=curr.right;

            }
            else{
                return s+ curr.elem;
            }
        }


        return "No Path Found"; //remove this line
    }
    //============================================================================

}
