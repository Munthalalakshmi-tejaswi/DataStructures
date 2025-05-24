class Maxsum{
    static int maxS(int[] nums){
        int max=nums[0];
        int curr=nums[0];
        for(int i=1;i<nums.length;i++){
            if(curr+nums[i]>nums[i]){
                curr+=nums[i];
            }
            else{
                curr=nums[i];
            }
            if(curr>max){
                max=curr;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums={1,2,-1,1,-5};
        int max=maxS(nums);
        System.out.print(max);
    }
}