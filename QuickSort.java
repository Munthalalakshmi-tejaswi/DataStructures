class QuickSort{
    public static void quick(int[] arr,int low,int high){
        if(low<high){
            int pi=part(arr,low,high);
            quick(arr, low, pi-1);
             quick(arr,pi+1,high);
        }
    }
    private static int part(int[] arr,int low,int high){
        int pi=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pi){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    } 
    public static void main(String[] args) {
        int[] arr={3,2,4,1,8,7};
        quick(arr, 0, arr.length-1);
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}