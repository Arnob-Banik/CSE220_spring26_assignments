// Complete the levelSum method
//ASSIGNMENT TASK MUST SUBMIT
public class Task7 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum( BTNode root ){
        return sumHelper(root,0);
    }
    public static Integer sumHelper(BTNode root, int level){
        if (root == null )return 0;
        int curr = (Integer)root.elem;
        int left = (Integer)sumHelper(root.left,level+1);
        int right = (Integer)sumHelper(root.right,level+1);
        if(level%2==0) return -curr+right+left;
        else{return curr+right+left;}
    }
    
    //============================================================================

}
