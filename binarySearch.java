public class binarySearch {
    public static int BinarySearch(int arr[],int key){
        int st=0,end=arr.length-1;
        while (st<=end) {
            int mid=(st+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={2,4,5,6,8,21,32};
        int key=21;
        
        System.out.println("index for key "+key+" is:"+BinarySearch(arr, key));
    }
}
