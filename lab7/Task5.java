//Assignment Task (must Submit)
// Complete the sumOfLeaves method
public class Task5 {

    //===================================TASK#5======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum( BSTNode root ){
        if (root==null) return 0;
        return mshelper(root.left, root.right);
    }
    

    public static Integer mshelper(BSTNode L, BSTNode R){
        if(L==null && R == null) return 0;
        if (L == null || R == null) return 0;

        Integer sum = (Integer)L.elem +  (Integer)R.elem;
        sum += mshelper(L.left, R.right);
        sum+= mshelper(L.right, R.left);
        return sum;
    }
    }
    //===============================================================



