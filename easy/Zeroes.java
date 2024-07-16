package easy;

import java.io.*;

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0)
                continue;
            nums[i++] = nums[j];
        }
        for (int j = i; j < nums.length; j++)
            nums[j] = 0;
    }
}

class Zeroes {
    public static void main(String[] args) {
        Solution ob = new Solution();
        int nums[] = { 1, 0, 2, 0, 3 };
        ob.moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
