import java.util.*;
class PrefixSum{
    static int[] build(int[] arr){
     int n=arr.length;
     int[] pre=new int[n];
     pre[0]=arr[0];
     for(int i=1;i<n;i++){
     pre[i]=pre[i-1]+arr[i];
     }
     return pre;
    }
    static int Resum(int[] pre,int L,int R){
        if(L==0){
            return pre[R];
        }
        else{
            return pre[R]-pre[L-1];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        int[] pre=build(arr);
        for(int i=0;i<q;i++){
         int L=sc.nextInt();
         int R=sc.nextInt();
         int sum=Resum(pre, L, R);
         System.out.println("L & R"+sum);
        }
    }
}