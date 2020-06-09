package 字符串;

/**
 * https://leetcode-cn.com/problems/flipped-string-lcci/
 * 
 * @author MJ
 *
 */
public class 面试题_01_09_字符串轮转 {
	
	// KMP
	
	// 旋转词
	public static boolean isRevolving(String s1, String s2) {
		if (s1 == null || s2 == null) return false;
		if (s1.length() != s2.length()) return false;
		// 这里还可以考虑使用KMP算法
		return (s1 + s1).contains(s2);
	}
	
//	public static void main(String[] args) {
//		System.out.println(isRevolving("cdab", "abdd"));
//	}
}
