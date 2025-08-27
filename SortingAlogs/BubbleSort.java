package SortingAlogs;

public class BubbleSort {
    public static void Bubblesort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
    }
    public static void printarr(int arr[]){
            for(int n:arr){
                System.out.print(n+ " ");
                
            }
            System.out.println();
        }
    public static void main(String[] args) {
        int arr[]={6,4,2,9,1,3};
        Bubblesort(arr);
        printarr(arr);
    }
    
}
