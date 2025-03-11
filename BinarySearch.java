class BinarySearch{
    public static int Binary(int[] arr,int key){
        int left=0,right=arr.length-1;
        while(left<=right){
        int mid=(left+right)/2;
        if(arr[mid]==key)
        return mid;
        if(arr[mid]<key)
        left=mid+1;
        else
         right=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int key=30;
        int res=Binary(arr, key);
        if(res!=-1)
        System.out.println("Element found "+res);
        else
        System.out.println("Not found");
    }
}