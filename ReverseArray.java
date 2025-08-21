public class ReverseArray {
    public static void reversearray(int arr[]){
        int st=0,end=arr.length-1;
        while(st<end){
            int temp=arr[end];
            arr[end]=arr[st];
            arr[st]=temp;
            st++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        reversearray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");

    }
}
