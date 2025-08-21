public class sumofSubarrays {
    public static void sumprintsubarray(int arr[]){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum=sum+arr[k];
                }
                System.out.print("sum==>"+sum);
                ts++;
                System.out.println(" ");
                
            }
                System.out.println(" ");

        }
                System.out.print("total no of subarrays:"+ts);

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        sumprintsubarray(arr);
    }
}
