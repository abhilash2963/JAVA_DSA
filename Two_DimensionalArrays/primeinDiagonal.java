package Two_DimensionalArrays;

public class primeinDiagonal {
     public static int diagonalPrime(int[][] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int a=nums[i][i];
            if(isPrime(a)){
                max=Math.max(max,a);
            }

            int b=nums[i][n-i-1];
            if(isPrime(b)){
                max=Math.max(max,b);
            }

            
        }
        return max;
    }
    public static boolean isPrime(int num){
        if (num < 2) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(primeinDiagonal.diagonalPrime(matrix));
    }
}
