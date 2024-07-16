package easy;

import java.util.*;

class Cholocolate {
    public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        Collections.sort(a);
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i <= n - m; i++) {
            mini = Math.min(mini, a.get(i + m - 1) - a.get(i));
        }
        return mini;
    }
}

public class choco {
    public static void main(String[] args) {
        Cholocolate ob = new Cholocolate();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i < N; i++)

        {
            li.add(sc.nextInt());
        }
        int M = sc.nextInt();

        long ans = ob.findMinDiff(li, N, M);
        System.out.println(ans);
    }
}
