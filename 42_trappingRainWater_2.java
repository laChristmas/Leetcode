import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int trap(int[] height) {
        Deque<Integer> stack = new ArrayDeque<>();
        int cur = 0;
        int capacity = 0;
        while (cur < height.length) {
            if (!stack.isEmpty() && height[cur] < height[stack.peek()]) {
                stack.push(cur);
                cur++;
                continue;
            }

            int h = 0;
            while (!stack.isEmpty() && height[stack.peek()] <= height[cur]) {
                int i = stack.pop();
                capacity += (cur - i - 1) * (height[i] - h);
                h = height[i];
            }
            if (!stack.isEmpty()) {
                int i = stack.peek();
                capacity += (cur - i - 1) * (height[cur] - h);                
            }
            stack.push(cur);
            cur++;
        }

        return capacity;
    }
}