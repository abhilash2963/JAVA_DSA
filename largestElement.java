import java.util.*;
class largestElement{
    public static int getLargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int [] arr={1,3,5,2,7,9,23,14};
        System.out.print(getLargest(arr));
        
    }
}