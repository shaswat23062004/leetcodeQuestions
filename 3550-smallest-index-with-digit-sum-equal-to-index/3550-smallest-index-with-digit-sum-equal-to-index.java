class Solution {
    public int smallestIndex(int[] nums) {
        int sum =0;
        for(int i = 0;i<nums.length;i++){
            if(i == digitSum(nums[i])) return i;
        }
        return -1;
    }
    public int digitSum(int a){
        int sum =0;
        while(a>0){
            int rem = a %10;
            sum += rem;
            a = a/10;
        }
        return sum;
    }
}