public class prefixSum {
    public static void maxsumsubarray(int arr[]){
        int currsum=0;
        int max_sum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int n=1;n<arr.length;n++){
            prefix[n]=prefix[n-1]+arr[n];
        }
        for(int i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){
                currsum= i==0 ? prefix[j] : prefix[j]-prefix[i-1];
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
