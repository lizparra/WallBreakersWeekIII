class Solution {
    public int arrayPairSum(int[] nums) {
        int[] array = new int[20001];
		for (int i = 0; i < nums.length; i++) {
			array[nums[i] + 10000]++;
		}
		int sum = 0;
		boolean odd = true;
		for (int i = 0; i < array.length; i++) {
			while (array[i] > 0) {
				if (odd) {
					sum += i - 10000;
				}
				odd = !odd;
				array[i]--;
			}
		}
		return sum;
    }
}
