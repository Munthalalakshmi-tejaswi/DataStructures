class SelectionSort{
    public static void main(String[] args) {
        int[] arr={4,7,1,44,21,12};
        int temp=0;
        int min=-1;
        for(int i=0;i<arr.length-1;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j])
                min=j;
            }
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}