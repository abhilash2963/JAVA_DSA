package SortingAlogs;

public class SelectionSort{
    public static void selectionsort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minposi=i;
            for(int j=i+1;j<n;j++){
                if(arr[minposi]>arr[j]){
                    minposi=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minposi];
            arr[minposi]=temp;
        }
    }
     public static void printarr(int arr[]){
            for(int m:arr){
                System.out.print(m+ " ");
                
            }
            System.out.println();
        }
        public static void main(String[] args) {
            int arr[]={2,6,7,4,8,9,1};
            selectionsort(arr);
            printarr(arr);
        }
    
}
