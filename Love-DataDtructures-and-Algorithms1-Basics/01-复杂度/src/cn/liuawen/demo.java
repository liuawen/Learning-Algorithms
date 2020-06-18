package cn.liuawen;

public class demo {
	// 计算 1+2+3+...+n 的和
	public static int sum1(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result += i;
		}
		return result;
	}

	// 计算 1+2+3+...+n 的和
	public static int sum2(int n) {
		return (1 + n) * n / 2;
	}

	public static void main(String[] args) {
		System.out.println("sum1(10):"+sum1(10));
		System.out.println("sum2(10):"+sum2(10));

	}
}
