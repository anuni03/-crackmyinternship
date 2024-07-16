package easy;

import java.util.Scanner;

class Ele {
    public int majorityElement(int[] nums) {
        int c = 0;
        int ele = -1;
        for (int i = 0; i < nums.length; i++) {
            if (c == 0) {
                ele = nums[i];
                c++;
            } else if (nums[i] == ele) {
                c++;
            } else {
                c--;
            }
        }
        return ele;
    }
}

public class majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ele ob = new Ele();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int ans = ob.majorityElement(arr);
        System.out.println("Answer: " + ans);
    }
}
