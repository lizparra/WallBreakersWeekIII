class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int j = 0;
        for(int i = 1;i < A.length; i++){
            if(A[i] < A[j]){
                return j;
            } 
            j++;
        }
        
        return 0;
    }
}
