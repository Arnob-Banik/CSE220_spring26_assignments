//LAB TASK NO NEED TO SUBMIT
public class Task3 {

        //===================================TASK#3_1===================================
        // This method takes 1 parameter, the root
        // This method returns the summation
        // No Helper Methods are needed for this task
        public static Integer sumTree( BTNode root ){
            //TO DO
            if (root==null) return 0;
            return  (Integer) root.elem + sumTree(root.left)   + sumTree(root.right);

        }
        //===================================TASK#3_2===================================
        // This method takes 1 parameter, the root
        // This method returns the summation
        // You can use extra helper private static methods as per need
        public static void sumTreePrint( BTNode root ){
            System.out.println(sumTree(root));
        }
        //============================================================================


}
