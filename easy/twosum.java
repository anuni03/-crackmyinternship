package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Sum {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();

        hs.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (hs.containsKey(target - nums[i])) {
                ans[0] = hs.get(target - nums[i]);
                ans[1] = i;
                break;
            }
            hs.put(nums[i], i);
        }
        return ans;
    }
}

public class twosum {
    public static void main(String[] args) {
        Sum ob = new Sum();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++)

        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans[] = new int[2];
        ans = ob.twoSum(arr, target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
