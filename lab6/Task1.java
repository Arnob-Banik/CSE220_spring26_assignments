//LAB TASK NO NEED TO SUBMIT
public class Task1 {

    //======================TASK#1_1======================
    // This method takes only 1 parameter which is root
    // You'll traverse the tree pre-order
    public static void preOrder( BTNode root ){
        if (root == null) return;
        System.out.print(root.elem+"  ") ;
        preOrder(root.left);
        preOrder(root.right);

    }
    //==================================================

    //======================TASK#1_2======================
    // This method takes only 1 parameter which is root
    // You'll traverse the tree in-order
    public static void postOrderLvl( BTNode root ){
        // TO DO
        postOrderHelper(root, 0);

        
    }
    public static void postOrderHelper(BTNode root, int level) {
    if (root == null) return;

    postOrderHelper(root.left, level + 1);
    postOrderHelper(root.right, level + 1);

    System.out.println(root.elem + ": " + level);
}
    //==================================================

    //======================TASK#1_3======================
    // This method takes only 1 parameter which is root
    // You'll traverse the tree in-order
    public static void inOrderEvenLvl( BTNode root ){
       inOrderEvenLvlHelper(root, 0);
    }

    public static void inOrderEvenLvlHelper(BTNode root, int level){
        if (root == null) return;
        inOrderEvenLvlHelper(root.left, level);
        if(level%2==0){
         System.out.println(root.elem + ": " + level+1);
        }
        inOrderEvenLvlHelper(root.right, level+1);
    }
    //==================================================

}
