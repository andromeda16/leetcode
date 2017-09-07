import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Administrator on 6/27/2017.
 */
public class Recursion {
    // f(n) = f(n-5)*f(n-8)
    public int a(int n) {
        if (n >= 0 && n <= 7) {
            return n;
        }

        return a(n - 5) * a(n - 8);
    }

    // memor
    public int a2(int n) {
        int[] memo = new int[n + 1];
        return a2_int(n, memo);
    }

    public int a2_int(int n, int[] memory) {
        if (n >= 0 && n <= 7) {
            return n;
        }
        if (memory[n] == 0) {
            memory[n] = a2_int(n - 5, memory) * a2_int(n - 8, memory);
        }
        return memory[n];
    }

    //bottom
    public int a3(int n) {
        int[] memo = new int[8];
        for (int i = 0; i <= 7; i++) {
            memo[i] = i;
        }

        for (int i = 8; i <= n; i++) {
            memo[i % 8] = memo[(i - 5) % 8] * memo[i % 8];
        }

        return memo[n % 8];
    }

    //top
    // f(n) = f(n-8) + f(n-4);
    public int a4(int n) {
        int[] memo = new int[n + 1];
        Stack<Integer> q = new Stack<Integer>();
        q.add(n);
        while (!q.isEmpty()) {
            int i = q.pop();
            if (memo[i] != 0) {
                continue;
            }
            if (i>=0 && i<=7) {
                memo[i] = i;
                continue;
            }
            if (memo[i-5] != 0 && memo[i-5] != 0) {
                memo[i] = memo[i-5]*memo[i-8];
                continue;
            } else {
                q.add(i);
            }

            if (memo[i-5] == 0) {
                q.add(i-5);
            }
            if (memo[i-8] == 0) {
                q.add(i-8);
            }
        }

        return memo[n];
    }
}
