import java.util.*;
class WindowMaxSum{
    static int MaxSum(int[] arr,int k){
        int n=arr.length;
        if(n<k){
            return -1;
        }
        int WindowSum=0;
        for(int i=0;i<k;i++){
            WindowSum+=arr[i];
        }
        int maxSum=WindowSum;
        for(int i=k;i<n;i++){
            WindowSum=WindowSum+arr[i]-arr[i-k];
            if(WindowSum>maxSum){
                maxSum=WindowSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int res=MaxSum(arr, k);

        if(res!=-1){
            System.out.print("The Max Substring sum"+k+"is"+res);
        }
    }
}