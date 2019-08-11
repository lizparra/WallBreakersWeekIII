class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        
        int high = nums.length - 1;
        int low = 0;
        int middle = 0;
        while(low <= high){
            middle = (low+high)/2;
            if(nums[middle] == target){
                return middle;
            } else if(nums[middle] < target){
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }
}
