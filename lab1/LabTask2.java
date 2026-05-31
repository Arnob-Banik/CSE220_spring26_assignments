//Lab Task 02: Decryption Process
class LabTask2{

    //Complete this method so that it gives the Expected Output
public static Integer[] decryptMatrix(Integer[][] matrix){

    int cols = matrix[0].length;

    Integer[] arr = new Integer[cols - 1];

    for(int j = 0; j < cols - 1; j++){

        int sum1 = 0;
        int sum2 = 0; 

        for(int i = 0; i < matrix.length; i++){
            sum1 += matrix[i][j];
        }

        for(int i = 0; i < matrix.length; i++){
            sum2 += matrix[i][j + 1];
        }

        arr[j] = sum2 - sum1;
    }

    return arr;
}

    

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}
