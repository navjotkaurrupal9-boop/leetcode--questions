class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                return i;
            }
        }

        if(n==0){
            return 0;
        }

        if(n==1){
            if(nums[0]>target)
                return 0;
            else
                return 1;
        }

        // if el is not in arr
        for(int i=0;i<n-1;i++){
            if(nums[i]<target & nums[i+1]>target){
                return i+1;
            }
            if(i==0){
                if(nums[i]>target){
                    return 0;
                }
            }
        }

        return  n;
    }
}
