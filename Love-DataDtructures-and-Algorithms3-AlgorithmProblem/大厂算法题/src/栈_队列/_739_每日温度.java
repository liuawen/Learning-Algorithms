package 栈_队列;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/daily-temperatures/
 * 
 * @author MJ
 *
 */
public class _739_每日温度 {
    public int[] dailyTemperatures(int[] T) {
    	if (T == null || T.length == 0) return null;
    	int[] values = new int[T.length];
    	for (int i = T.length - 2; i >= 0; i--) {
			int j = i + 1;
			while (true) {
				if (T[i] < T[j]) {
					values[i] = j - i;
					break;
				} else if (values[j] == 0) {
					values[i] = 0;
					break;
				}
				// 当T[i] == T[j]的时候
				j = j + values[j];
			}
		}
    	return values;
    }

    public int[] dailyTemperatures1(int[] T) {
    	if (T == null || T.length == 0) return null;
    	int[] values = new int[T.length];
    	for (int i = T.length - 2; i >= 0; i--) {
			int j = i + 1;
			while (true) {
				if (T[i] < T[j]) {
					values[i] = j - i;
					break;
				} else if (values[j] == 0) {
					values[i] = 0;
					break;
				} else if (T[i] == T[j]) {
					values[i] = values[j] + j - i;
					break;
				} else {
					j = j + values[j];
				}
			}
		}
    	return values;
    }
    
    public int[] dailyTemperatures2(int[] T) {
    	if (T == null || T.length == 0) return null;
    	int[] result = new int[T.length];
    	Stack<Integer> stack = new Stack<>();
    	for (int i = 0; i < T.length; i++) {
    		// 这里应该要写大于，不要写大于等于
			while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
				result[stack.peek()] = i - stack.peek();
				stack.pop();
			}
			stack.push(i);
		}
    	return result;
    }
}
