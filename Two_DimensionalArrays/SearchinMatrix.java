package Two_DimensionalArrays;

public class SearchinMatrix {
    public static boolean searchinmatrix(int matrix[][],int key){
        int n=matrix.length;
        int row=0,col=n-1;
        while (row<n && col>=0) {
            if(matrix[row][col] == key){
                System.out.println("key found at(" + row +"," + col + ")");
                return true;
            }
            else if(key< matrix[row][col]){
                col--;
            }
            else{
                row++;
            }

        }
        System.out.println("key not found");
        return false;

    } 
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        searchinmatrix(matrix,8);
    }
}
