package Question5;


public class Solution {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return Integer.MAX_VALUE;
        }
        return findKthLargest(nums, 0, nums.length - 1, nums.length - k);
    }

    public int findKthLargest(int[] nums, int start, int end, int k) {
        if (start > end) {
            return Integer.MAX_VALUE;
        }

        int pivot = nums[end];
        int left = start;
        for (int i = start; i < end; i++) {
            if (nums[i] <= pivot)
            {
                swap(nums, left++, i);
            }
        }
        swap(nums, left, end);

        if (left == k) {
            return nums[left];
        } else if (left < k){
            return findKthLargest(nums, left + 1, end, k);
        } else {
            return findKthLargest(nums, start, left - 1, k);
        }
    }

    void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
}
