class Solution {
    public long maxAlternatingSum(int[] nums) {
        long sum =0;
        long arr[] = new long[nums.length];
        for(int  i = 0;i<nums.length;i++){
            arr[i] = nums[i]*nums[i];
        } 
        Arrays.sort(arr);
        for(int i =0;i<arr.length;i++){
            if(i<nums.length/2){
                sum -= arr[i];
            }
            else sum += arr[i];
        }
         return sum;    
    }
}