//LAB TASK NO NEED TO SUBMIT
public class Task5 {

        //===================================TASK#4===================================
        // This method takes 1 parameter, the root
        // This method returns the largest value
        // No Helper Methods are needed for this task
public static Integer maxTree(BTNode root) {
    if (root == null) return Integer.MIN_VALUE;

    int current = (Integer) root.elem;

    int leftMax = maxTree(root.left);
    int rightMax = maxTree(root.right);

    return Math.max(current, Math.max(leftMax, rightMax));
}
        //============================================================================


}
