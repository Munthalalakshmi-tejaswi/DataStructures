class LinearSearch{
    public static int Search(int[] arr,int key){
       for (int i = 0; i < arr.length; i++) {
           if(arr[i]==key){
            return i;
           }
       }
       return -1;
    }
    public static void main(String[] args) {
       int[] arr={10,40,20,30};
        int key=40;
        int res=Search(arr, key);
        if(res!=-1)
        System.out.println("Found element index " +res);
        else
        System.out.println("not Found");
    }
}