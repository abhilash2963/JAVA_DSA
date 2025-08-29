package SortingAlogs;

public class InsertionSort {
    public static void insertionsort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int prev=i-1;
            int curr=arr[i];
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;

        }
    }
    public static void printarr(int arr[]){
            for(int m:arr){
                System.out.print(m+ " ");
                
            }
            System.out.println();
        }
        public static void main(String[] args) {
            int arr[]={3,7,5,8,2};
            insertionsort(arr);
            printarr(arr);
        }
}
