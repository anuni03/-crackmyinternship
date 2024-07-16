package easy;

import java.util.Scanner;

class B {
    public void mergeElement(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;
        if (m == 0 && n == 1)
            nums1[0] = nums2[0];

        while (i >= 0 && p1 >= 0 && p2 >= 0) {
            if (nums2[p2] > nums1[p1]) {
                nums1[i--] = nums2[p2--];
            } else if (nums1[p1] >= nums2[p2]) {
                nums1[i--] = nums1[p1--];
            }
        }
        while (i >= 0 && p2 >= 0)
            nums1[i--] = nums2[p2--];
    }
}

public class merge {
    public static void main(String[] args) {
        B ob = new B();
        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int nums2[] = { 2, 5, 6 };
        int n = 3;

        ob.mergeElement(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++)
            System.out.print(nums1[i] + " ");
    }
}
