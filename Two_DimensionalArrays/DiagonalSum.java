package Two_DimensionalArrays;

public class DiagonalSum {
	public static int diagonalsum(int matrix[][]){
        int sum=0;
        // brute force 
        //for secondary digonal i+j=n-1; and j=n-1-i;
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }
        //         if(i+j==matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }

            for(int i=0;i<matrix.length;i++){
                //prinary diagonal
                sum+=matrix[i][i];
                //secondary digonal
                sum+=matrix[i][matrix.length-i-1];
            }
        return sum;

    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{3,4,5,8},{4,9,0,5}};
        System.out.println(diagonalsum(matrix));
    }
}
