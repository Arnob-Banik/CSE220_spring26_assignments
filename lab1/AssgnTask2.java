//Assignment Task 02: Matrix Compression
class AssgnTask2{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static Integer[][] compressMatrix( Integer[][] matrix ){
Integer row = matrix.length;
    Integer col = matrix[0].length;

    Integer r = row / 2;
    Integer c = col / 2;

    Integer[][] arr = new Integer[r][c];

    for (Integer x = 0; x < r * c; x++) {
        Integer i = x / c;   
        Integer j = x % c;   

        arr[i][j] =
            matrix[2*i][2*j]
          + matrix[2*i + 1][2*j]
          + matrix[2*i][2*j + 1]
          + matrix[2*i + 1][2*j + 1];
    }
    return arr;

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}
