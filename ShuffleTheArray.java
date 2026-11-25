class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] newNums=new int[nums.length];
        int start=0;
        for(int i=0;i<nums.length;i+=2){
            newNums[i]=nums[start];
            newNums[i+1]=nums[n];
            start++;
            n++;
        }
        return newNums;
    }
}
