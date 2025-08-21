public class maxSubarraySum {
    public static void maxsumsubarray(int arr[]){
        int currsum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    
                    currsum=currsum+arr[k];
                }
                System.out.println(currsum);

                if(currsum>max_sum){
                    max_sum=currsum;
                }
                
                
            }
                

        }
                System.out.print("MAX sub array sum:"+max_sum);

    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        maxsumsubarray(arr);
    }
}
