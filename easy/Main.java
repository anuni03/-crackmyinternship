package easy;

import java.io.*;

class Duplicate {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[j] != nums[j - 1]) {
                nums[++i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }
}

class Main {
    public static void main(String[] args) {
        Duplicate ob = new Duplicate();
        int nums[] = { 1, 2, 2, 3, 3 };
        System.out.println(ob.removeDuplicates(nums));
    }
}